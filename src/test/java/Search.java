import io.github.bonigarcia.wdm.WebDriverManager;
import io.netty.channel.ChannelConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;


public class Search {

    WebDriver driver;
    @BeforeTest
    public void beforetest(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();
    }
    @Test
    public void searh() {
     driver.findElement(By.id("gh-ac")).sendKeys("mazda mx-5");

     driver.findElement(By.id("gh-btn")).click();
     driver.findElement(By.xpath("//*[@id=\"x-refine__group_1__0\"]/ul/li[1]/div/a/div/span/input")).click();

    }
    @AfterTest
    public void closebrowser() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
}
