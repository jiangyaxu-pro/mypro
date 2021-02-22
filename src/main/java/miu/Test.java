package miu;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.pagefactory.ByAll;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import static jdk.nashorn.internal.parser.TokenType.OR;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
        //实例化一个Chrome浏览器的实例
        WebDriver driver = new ChromeDriver();
        //设置打开的浏览器窗口最大化
        driver.manage().window().maximize();
        //设置隐性的等待时间
        driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
        //使用get()打开一个网站
        driver.get("https://www.baidu.com");
        //getTitle()获取当前页面的title，用System.out.println()打印在控制台
        System.out.println("当前打开页面的标题是： "+ driver.getTitle());
        //By.xpath("//*[@id=\"kw\"]")
        WebElement element = driver.findElement(ByAll.xpath("//*[@id=\"kw\"]"));
        element.sendKeys("你不好.png");
        Thread.sleep(2000);
        WebElement element1 = driver.findElement(By.xpath("//*[@id=\"su\"]"));
        element1.click();
        Thread.sleep(2000);
        WebElement element2 = driver.findElement(By.xpath("//*[@id=\"2\"]/h3/a"));
        element2.click();
        Thread.sleep(1000);
//        WebElement element3 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/article/div[4]/div/div/span/button[1]"));
//        element3.click();
    }
}