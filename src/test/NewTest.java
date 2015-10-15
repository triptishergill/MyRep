package test;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class NewTest {
  @Test
  public void f() {
	  System.out.println("Its a Test1111");
	  Assert.assertEquals("Good", "Good");
  }
  
  @Test
  public void s() {
	  
	  System.out.println("Its a Test2111");
	  Assert.assertTrue(6<2, "6 is greater");
	  
	  //throw new SkipException("Testing skip.");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Its a beforeMethod");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Its a beforeClass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Its a  beforeTest");
  }

  @AfterMethod
  public void AfterMethod() {
	  System.out.println("Its a  aftermethod");
  }
  
  
}
