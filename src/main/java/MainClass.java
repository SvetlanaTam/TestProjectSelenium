import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class MainClass {

    public static void main(String [] args) {
        System.setProperty("webdriver.gecko.driver", "/Users/svetlanatambolskaa/IdeaProjects/TestProject/drivers/geckodriver");

        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait (10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

       /* driver.get("http://en.wikipedia.org");
        driver.findElement(By.xpath("//input[@ id='searchInput']")).sendKeys("Selenium WebDriver");
        driver.findElement(By.xpath("//input[@id ='searchButton']")).click();
        System.out.println(driver.findElement(By.xpath("//div[@id='searchText']/input")).getAttribute("value"));
        driver.findElement(By.xpath("//div[@id='searchText']/input")).clear();
*/
       driver.get("http://github.com");
       driver.findElement(By.xpath("//a[@href='/login']")).click();
       driver.findElement(By.xpath("//form[@data-turbo='false']/input[@id='login_field']")).sendKeys("Password");
       WebElement button = driver.findElement(By.xpath("//input[@class='btn btn-primary btn-block js-sign-in-button']"));



        button.submit();
    }
}

