package Framewrk;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 
{
	@Test(groups = {"Smoke"})
	
	public void ploan() 
	{
		System.out.println("class: day2, method: ploan.  Good!");
	}
	
	@BeforeTest
	public void prerequiste()
	{
		System.out.println("class: day2, method: prerequiste.  I will Execute First!!!");
	
	//Now Studying branch
	System.out.println("Day 2: branch study: day 1 and day 2 branch classes have '>'");
		
	
	}
}
