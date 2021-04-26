package qaclickacademy.Mavenjava;

import org.testng.annotations.DataProvider;

public class Userqaclick {
	
	// I have used these DataProviders in Selenium class
		@DataProvider(name="ussr")
		public Object[][] t1() {
			
		Object[][]	usrnames= new Object[2][2];
		
		
		usrnames[0][0]="Nitin 1st name";
		usrnames[0][1]="Password 1st name";
		
		
		usrnames[1][0]="Rahul name";
		usrnames[1][1]="Rahuk Name password";
			
			
			return usrnames;
			
		}
		
		
		
		
		
		@DataProvider(name="city")
		public Object[][]  namecity() {
			
			 return new Object[][]
					 {
				 
				 {"Nitin","Bhopal"},
				 {"Ramesh","Delhi"}
				 
				 
					 };
			

		}
		
		
		
	


}
