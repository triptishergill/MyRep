package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class New1 {
  @Test(dataProvider="regData")
  public void fS(String uName,String desig,int empNo) {
	  System.out.println(uName +"-----"+desig+"-----"+empNo+"------");
  }
  
  @DataProvider
  public Object[][] regData()
  {
	  Object[][] ob=new Object[2][3];
	  
	  
	  ob[0][0]="Tripti Shergill";
	  ob[0][1]="Sr Test Analyst";
	  ob[0][2]=7890;
	  
	  
	  ob[1][0]="Tripti1 khkShergill";
	  ob[1][1]="Sr Test1 jkklhAnalyst";
	  ob[1][2]=7890909;
	  
	  return ob;
	  
	  
  }
  
  
  
  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Before Suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("After Suite");
  }

}
