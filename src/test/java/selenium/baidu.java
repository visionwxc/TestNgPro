package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class baidu {
    @Test
    public void testBaidu() {
        //路径对应的是驱动chromedriver.exe在系统中的路径
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.baidu.com/");

        //driver.manage().window().maximize();

        WebElement txtbox = driver.findElement(By.name("wd"));
        txtbox.sendKeys("testng");

        WebElement btn = driver.findElement(By.id("su"));
        btn.click();

//        driver.close();
    }
}