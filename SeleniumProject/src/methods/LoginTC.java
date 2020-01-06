package methods;

import java.io.IOException;

public class LoginTC {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		OrgHRMLib ohl=new OrgHRMLib();
		
//		ohl.brLaunch("chrome");
//		ohl.driver.get("http://google.com");
		
		
		String res=ohl.orgLaunch("http://orangehrm.qedgetech.com");
		System.out.println("App Launch "+res);
		
		res=ohl.orgLogin("Admin", "Qedge123!@#");
		System.out.println("App Login "+res);
		
		res=ohl.orgLogout();
		System.out.println("App Logout "+res);
		
		ohl.orgClose();
		System.out.println("App Closed Successfuly");

	}

}
