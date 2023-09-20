package seleniumtests;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SimpleTest {
  @Test
  public void verifytitle() {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.get("https://www.google.com/");
	  String exptitle="Google";
	  String acttitle=driver.getTitle();
	  
	  assertEquals(acttitle,exptitle);
	  
  }
}
