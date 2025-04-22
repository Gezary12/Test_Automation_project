package base;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class basetests {
    private WebDriver driver;
    public void setup(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

        //List<WebElement> links =driver.findElements(By.tagName("a"));
        //System.out.println(links.size());
        WebElement shiftinglink=driver.findElement(By.linkText("Shifting Content"));
        shiftinglink.click();
        WebElement Example1link=driver.findElement(By.linkText("Example 1: Menu Element"));
        Example1link.click();
        WebElement homelink=driver.findElement(By.linkText("Home"));
        homelink.click();
        WebElement inputslink=driver.findElement(By.linkText("Inputs"));
        inputslink.click();

        System.out.println(driver.getTitle());
        driver.quit();
    }
    public static void main(String args[]){
        basetests test = new basetests();
        test.setup();
    }
}
