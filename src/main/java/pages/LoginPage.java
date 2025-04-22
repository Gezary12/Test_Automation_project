package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By usernamefield=By.id("username");
    private By passwordfield=By.id("password");
    private By loginfield=By.cssSelector("#login button");
    public LoginPage(WebDriver driver){
        this.driver=driver;
    }
    public void setusername(String username){
        driver.findElement(usernamefield).sendKeys(username);
    }
    public void setpassword(String password){
        driver.findElement(passwordfield).sendKeys(password);
    }
    public void login(String login){
        driver.findElement(loginfield).sendKeys(login);
    }
    public SecureAreaPage loginbuttonfield(){
        driver.findElement(loginfield).click();
        return new SecureAreaPage(driver);
    }
}
