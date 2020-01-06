package methods;

import java.io.IOException;

public class OrgHRMSuite {

	public static void main(String[] args) throws InterruptedException, IOException 
	{

		OrgHRMLib ohl=new OrgHRMLib();
		
		System.out.println("Login TC");
		String res=ohl.orgLaunch("http://orangehrm.qedgetech.com");
		System.out.println("App Launch "+res);
		
		res=ohl.orgLogin("Admin", "Qedge123!@#");
		System.out.println("App Login "+res);
		
		res=ohl.orgLogout();
		System.out.println("App Logout "+res);
		
		ohl.orgClose();
		System.out.println("App Closed Successfuly");

		System.out.println("Employee Registration TC");
		res=ohl.orgLaunch("http://orangehrm.qedgetech.com");
		System.out.println("App Launch "+res);
		
		res=ohl.orgLogin("Admin", "Qedge123!@#");
		System.out.println("App Login "+res);
		
		res=ohl.orgEmpReg("Mokshitha", "G", "GM3214");
		System.out.println("Employee Registration "+res);
		
		res=ohl.orgLogout();
		System.out.println("App Logout "+res);
		
		ohl.orgClose();
		System.out.println("App Closed Successfuly");
		
		System.out.println("User Registration TC");
		res=ohl.orgLaunch("http://orangehrm.qedgetech.com");
		System.out.println("App Launch "+res);
		
		res=ohl.orgLogin("Admin", "Qedge123!@#");
		System.out.println("App Login "+res);
		
		res=ohl.orgUserReg("Mokshitha G", "AAMokshithaG6543", "MokshithaG@12345678901234", "MokshithaG@12345678901234");
		System.out.println("User Registration "+res);
		
		res=ohl.orgLogout();
		System.out.println("App Logout "+res);
		
		ohl.orgClose();
		System.out.println("App Closed Successfuly");
		
		System.out.println("User Login");
		res=ohl.orgLaunch("http://orangehrm.qedgetech.com");
		System.out.println("App Launch "+res);
			
		res=ohl.orgLogin("AAMokshithaG6543", "MokshithaG@12345678901234");
		System.out.println("App Login "+res);
			
		res=ohl.orgLogout();
		System.out.println("App Logout "+res);
			
		ohl.orgClose();
		System.out.println("App Closed Successfuly");
		

	}

}
