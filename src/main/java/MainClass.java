import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class MainClass {
    static WebDriver driver;

    public static void main(String [] args) {
        System.setProperty("webdriver.gecko.driver", "/Users/svetlanatambolskaa/IdeaProjects/TestProject/drivers/geckodriver");

        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait (10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://accounts.google.com/signup/v2/webcreateaccount?biz=false&cc=GE&continue=https%3A%2F%2Fwww.google.com%2F&dsh=S-117393737%3A1669101849521487&flowEntry=SignUp&flowName=GlifWebSignIn&hl=en&ifkv=ARgdvAvrn2C7olkfVMZTocyVJe6eJRgJd7xO7meW6yBDIYRFlz_t_f2hCiXIA5PhohoJ_cIaSECUIg");

        String listName;
        String option;



        driver.findElement(By.xpath("//div[@id='lang-chooser']")).click();
        driver.findElement(By.xpath("(//div[@data-value='de'])[2]")).click();




        }
        public static void selectOption(String listName, String option){
        String listXpath = String.format ("//div[@id='%s']",listName);
        String optionXpath = String.format("(//div[@data-value='%s'])[2]",option);
            driver.findElement(By.xpath(listXpath)).click();
            driver.findElement(By.xpath(optionXpath)).click();


        }






    }

