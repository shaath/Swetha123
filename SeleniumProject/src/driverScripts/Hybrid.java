
package driverScripts;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import methods.OrgHRMLib;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Hybrid {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		OrgHRMLib om=new OrgHRMLib();
		String xlpath="D:\\SwthaRecordings\\Workspace\\SeleniumProject\\src\\testdata\\Hybrid.xlsx";
		String xlout="D:\\SwthaRecordings\\Workspace\\SeleniumProject\\src\\results\\HybridRes.xlsx";
		String res=null;
		FileInputStream fi=new FileInputStream(xlpath);
		
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet ws=wb.getSheet("Testcase");
		XSSFSheet ws1=wb.getSheet("Teststeps");
		XSSFSheet ws2=wb.getSheet("TestData");
		XSSFSheet ws3=wb.getSheet("EmpReg");
		
		int TC_RC=ws.getLastRowNum();
		int TS_RC=ws1.getLastRowNum();
		int EmpReg_RC=ws3.getLastRowNum();
		
		for (int i = 1; i <= TC_RC; i++)
		{
			ws.getRow(i).createCell(3);
			String exe=ws.getRow(i).getCell(2).getStringCellValue();
			if (exe.equalsIgnoreCase("Y"))
			{
				String TC_TCID=ws.getRow(i).getCell(0).getStringCellValue();
				
				for (int j = 1; j <= TS_RC; j++)
				{
					String TS_TCID=ws1.getRow(j).getCell(0).getStringCellValue();
					if (TC_TCID.equalsIgnoreCase(TS_TCID)) 
					{
						String key=ws1.getRow(j).getCell(3).getStringCellValue();
						
						switch (key)
						{
						case "Launch":
							String url=ws2.getRow(1).getCell(0).getStringCellValue();
							res=om.orgLaunch(url);
							break;
						case "login":
							String u=ws2.getRow(1).getCell(1).getStringCellValue();
							String p=ws2.getRow(1).getCell(2).getStringCellValue();
							res=om.orgLogin(u, p);
							break;
						case "logout":
							res=om.orgLogout();
							om.orgClose();
							break;
						case "Empreg":
							for (int k = 1; k <= EmpReg_RC; k++) 
							{
								String f=ws3.getRow(k).getCell(0).getStringCellValue();
								String l=ws3.getRow(k).getCell(1).getStringCellValue();
								String Eid=ws3.getRow(k).getCell(2).getStringCellValue();
								res=om.orgEmpReg(f, l, Eid);
								ws3.getRow(k).createCell(3).setCellValue(res);
							}
							break;
						case "Usereg":
							String ename=ws2.getRow(1).getCell(6).getStringCellValue();
							String uname=ws2.getRow(1).getCell(7).getStringCellValue();
							String pswd=ws2.getRow(1).getCell(8).getStringCellValue();
							String cpswd=ws2.getRow(1).getCell(9).getStringCellValue();
							res=om.orgUserReg(ename, uname, pswd, cpswd);
							break;
						case "Ulogin":
							String un=ws2.getRow(1).getCell(7).getStringCellValue();
							String cp=ws2.getRow(1).getCell(8).getStringCellValue();
							res=om.orgLogin(un, cp);
							break;
						default:
							System.out.println("Give a proper keyword input");
							break;
						}
						ws1.getRow(j).createCell(4).setCellValue(res);
						
						if (!ws.getRow(i).getCell(3).getStringCellValue().equalsIgnoreCase("Fail")) 
						{
							ws.getRow(i).getCell(3).setCellValue(res);
						}
						
					}
				}
			}
			else
			{
				ws.getRow(i).createCell(3).setCellValue("BLOCKED");
			}
		}
		FileOutputStream fo=new FileOutputStream(xlout);
		wb.write(fo);
		wb.close();



	}

}
