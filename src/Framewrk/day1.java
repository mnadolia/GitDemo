package Framewrk;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class day1 
{
	public void lastexecution()
	{
		System.out.println("class: day1, method: lastexecution. I will Execute Last");
	}
	
	@Test
	public void Demo()
	{
	System.out.println("class: day1, method: Demo.  Hello Mohamed! Now Start Framework, First is 'TestNG'"); //automation
	}

	@AfterSuite
	public void afSyite()
	{
		System.out.println("I am the no 1 from last ");
	}	
	
	@Test
	public void SecondTest()
	{
		System.out.println("class: day1, method: SecondTest.  Bye");
	}
}

