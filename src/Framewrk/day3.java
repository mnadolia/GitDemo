package Framewrk;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 
{
	
	@BeforeClass
	public void befoclass()
	{
		System.out.println("class: day3, method: befoclass. Before executing any methods in the class.");
	}
	
	@Parameters({"URL", "APIKey/usrname"})
	@Test
	public void webloginCarLoan(String urlname, String key)
	{
		//Selenium
		System.out.println("class: day3, method: webloginCarLoan.  Weblogincar.");
		System.out.println(urlname);
		System.out.println(key);
	}
	
	@BeforeMethod
	public void beforeevery()
	{
		System.out.println("class: day3, method: beforeevery. I will execute Before every test method in day3 class.");
	}
	
	@AfterMethod
	public void afterevery()
	{
		System.out.println("class: day3, method: afterevery. I will execute After every test method in day3 class.");
	}
	
	@AfterClass
	public void afteclass()
	{
		System.out.println("class: day3, method: afteclass. After Executing all methods in the class.");
	}
	
	@Test(groups= {"Smoke"})
	public void mobileloginCarLoan()
	{
		//Appium
		System.out.println("class: day3, method: mobileloginCarLoan.  Mobilelogincar.");
	}
	
	@BeforeSuite
	public void bfSuite()
	{
		System.out.println("class: day3, method: bfSuite.  I am No. 1!!!");
	}
	
	@Test(enabled=false)
	public void MobileSignincarLoan()
	{
		System.out.println("class: day3, method:  Mobile SignIn!");
	}
	
	@Test(dataProvider = "getData")
	public void MobileSignoutcarLoan(String username, String password)
	{
		//Appium
		System.out.println("class: day3, method: MobileSignoutcarLoan.  Mobile SignOut!");
		System.out.println(username);
		System.out.println(password);
	}
	
	@Test(dependsOnMethods= {"webloginCarLoan","MobileSignoutcarLoan"})
	public void APIcarLoan()
	{
		//Rest API Automation
		System.out.println("class: day3, method: APIcarLoan.  APIcarLoan@@@");
	}
	
	@DataProvider
	public Object[][] getData()
	{
		//1st Combination: username password - good credit history = Row.
		//2nd Combination: username password - No credit history.
		//3rd Combination: fradulent credit history.
		
		Object[][] data = new Object[3][2];
		
		//1st Set
		data[0][0]="Firstsetusername";
		data[0][1]="Firstpassword";
		//columns in the row are nothing but the values for that particular combination(row)

		//2nd Set
		data[1][0]="Secondsetusername";
		data[1][1]="Secondpassword";
		
		//2nd Set
		data[2][0]="Thirdsetusername";
		data[2][1]="Thirdpassword";
				
		return data;
	}
}
