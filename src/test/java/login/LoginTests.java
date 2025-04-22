package login;
import base.basetests;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

import static org.testng.Assert.assertEquals;

public class LoginTests extends basetests {
    @Test
    public void testsuccesfullogin(){
        LoginPage loginPage= homepage.clickfromauthentication();
        loginPage.setusername("tomsmith");
        loginPage.setpassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage= loginPage.loginbuttonfield();
        assertEquals(secureAreaPage.getStatusAlerttext(),"You logged into a secure area!\n" +
                "×","Alert text is incorrect");

    }

}
