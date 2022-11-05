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

        driver.get("http://en.wikipedia.org");
        WebElement link = driver.findElement(By.linkText("Log in"));
        WebElement link2 = driver.findElement(By.partialLinkText("Community"));
        WebElement searchField = driver.findElement(By.name("search"));
        WebElement searchButton = driver.findElement(By.className("searchButton"));
        WebElement li = driver.findElement(By.id("n-upload"));
        WebElement input = driver.findElement(By.tagName("input"));
        WebElement element = driver.findElement(By.cssSelector("div#simpleSearch"));
        WebElement logo = driver.findElement(By.xpath("//*[@class='mw-wiki-logo']"));

        driver.quit();
    }
}

