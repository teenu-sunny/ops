package p1;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class DevopsTest {
    WebDriver driver;


    @Test
    public void openBrowser() throws InterruptedException {
        driver.get("https://www.google.com");


        Assert.assertEquals(driver.getTitle(), "Google");


    }


    @BeforeTest
    public void beforeTest() {
        System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
    }


    @AfterTest
    public void afterTest() {
        driver.close();


    }


}











