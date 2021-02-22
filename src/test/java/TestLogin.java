import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/*
登录自动化测试
 */
public class TestLogin {
      @Test
    public void login() throws InterruptedException {
          System.setProperty("webdriver.chrome.driver", "D:/chromedriver_win32/chromedriver.exe");
          WebDriver driver = new ChromeDriver();
          driver.manage().window().maximize();
          driver.get("http://test999.xumutang999.com/#/login");
          WebElement usernum = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/form/div[1]/div/div/input"));
          WebElement userpass = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/form/div[2]/div/div/input"));
          WebElement checkcode = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/form/div[3]/div/div[1]/div[1]/div/input"));
          WebElement buttonlogin = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/form/div[4]/div/button"));
          usernum.click();
          usernum.sendKeys("18317893732");
          Thread.sleep(1000);
          userpass.click();
          userpass.sendKeys("jiangyaxu710608");
          Thread.sleep(1000);
          checkcode.click();
          checkcode.sendKeys("0");
          Thread.sleep(1000);
          buttonlogin.submit();
      }



}
