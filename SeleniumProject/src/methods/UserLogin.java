package methods;

import java.io.IOException;

public class UserLogin {

	public static void main(String[] args) throws InterruptedException, IOException
	{
		OrgHRMLib ohl=new OrgHRMLib();
		
		String res=ohl.orgLaunch("http://orangehrm.qedgetech.com");
		System.out.println("App Launch "+res);
		
		res=ohl.orgLogin("AASwethaD6543", "SwethaD@12345678901234");
		System.out.println("App Login "+res);
		
		res=ohl.orgLogout();
		System.out.println("App Logout "+res);
		
		ohl.orgClose();
		System.out.println("App Closed Successfuly");
		

	}

}
