package Framewrk;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//Courses Discount - email
//rahulonlinetutor@gmail.com

public class day4 
{
	@Parameters({"URL"})
	@Test
	public void webloginHomeLoan(String uname)
	{
		//Selenium
		System.out.println("class: day4, method: webloginHomeLoan.  Webloginhome");
		System.out.println(uname);
	}
	
	@Test(groups = {"Smoke"})
	public void mobileloginHomeLoan()
	{
		//Appium
		System.out.println("class: day4, method: mobileloginHomeLoan.  Mobileloginhome");
	}
	
	@Test
	public void loginAPIHomeLoan()
	{
		//Rest API Automation
		System.out.println("class: day4, method: loginAPIHomeLoan.  APIloginhome");
	}
}