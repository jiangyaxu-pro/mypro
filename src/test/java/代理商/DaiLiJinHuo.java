package 代理商;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DaiLiJinHuo {
    public static WebDriver driver=null;
    //代理商进货
    @BeforeClass
    public static void chushihua(){
        System.setProperty("webdriver.chrome.driver", "D:/chromedriver_win32/chromedriver.exe");
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://kf.xumutang999.com/#/login");
    }
    /**
    代理商进货客服处理
     */

    @Test
    public void jinhuo() throws InterruptedException {
        WebElement dingdanzhongxin = driver.findElement(By.xpath("/html/body/div[1]/aside/div/ul/li[4]/div"));
        dingdanzhongxin.click();
        Thread.sleep(1000);
        WebElement jinhuodan = driver.findElement(By.xpath("/html/body/div[1]/aside/div/ul/li[4]/ul/li[3]"));
        jinhuodan.click();
        Thread.sleep(1000);
        WebElement xiangqing = driver.findElement(By.xpath("//*[@id=\"pane-indent-replenishpages\"]/div/div/div/div[2]/div[4]/div[2]/table/tbody/tr[1]/td[8]/div/button[1]/span"));
        xiangqing.click();
        Thread.sleep(2000);
        WebElement xinyongzhi = driver.findElement(By.xpath("//*[@id=\"pane-indent-replenishpages\"]/div/div/div/div[4]/div/div[2]/div/div[1]/section[3]/p[2]/i"));
        if (Integer.valueOf(xinyongzhi.getText()).intValue()>0){
            WebElement queding = driver.findElement(By.xpath("//*[@id=\"pane-indent-replenishpages\"]/div/div/div/div[4]/div/div[3]/span/span[1]/button"));
            queding.click();
        }else {
            WebElement bohui = driver.findElement(By.xpath("//*[@id=\"pane-indent-replenishpages\"]/div/div/div/div[4]/div/div[3]/span/span[2]/button"));
            bohui.click();
        }

    }
    /*
    财务处理
    */
    @Test
    public void caiwu()throws InterruptedException{
        driver.manage().window().maximize();
        driver.get("http://test999.xumutang999.com/#/login");
        WebElement dingdanzhongxin = driver.findElement(By.xpath("/html/body/div[1]/aside/div/ul/li[4]/div"));
        dingdanzhongxin.click();
        Thread.sleep(1000);
        WebElement jinhuodan = driver.findElement(By.xpath("/html/body/div[1]/aside/div/ul/li[4]/ul/li[3]"));
        jinhuodan.click();
        Thread.sleep(1000);
        WebElement xiangqing = driver.findElement(By.xpath("//*[@id=\"pane-indent-replenishpages\"]/div/div/div/div[2]/div[4]/div[2]/table/tbody/tr[1]/td[8]/div/button[1]/span"));
        xiangqing.click();
        Thread.sleep(2000);
        WebElement xinyongzhi = driver.findElement(By.xpath("//*[@id=\"pane-indent-replenishpages\"]/div/div/div/div[4]/div/div[2]/div/div[1]/section[3]/p[2]/i"));
        if (Integer.valueOf(xinyongzhi.getText()).intValue()>0){
            WebElement queding = driver.findElement(By.xpath("//*[@id=\"pane-indent-replenishpages\"]/div/div/div/div[4]/div/div[3]/span/span[1]/button"));
            queding.click();
        }else {
            WebElement bohui = driver.findElement(By.xpath("//*[@id=\"pane-indent-replenishpages\"]/div/div/div/div[4]/div/div[3]/span/span[2]/button"));
            bohui.click();
        }
    }
}
