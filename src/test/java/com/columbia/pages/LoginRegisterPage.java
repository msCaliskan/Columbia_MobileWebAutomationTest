package com.columbia.pages;

import com.columbia.utilities.BrowserUtils;
import com.columbia.utilities.ConfigurationReader;
import com.columbia.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginRegisterPage extends BasePage{

    @FindBy(css = "#email") public WebElement email_Loc;

    @FindBy(css = "#password") public WebElement password_Loc;
    public void mobilLogin(){
        String email = ConfigurationReader.get("user_email");
        String password = ConfigurationReader.get("user_password");

        email_Loc.sendKeys(email);
        password_Loc.sendKeys(password);
        Driver.get().findElement(By.xpath("(//span[text()='Giriş Yap'])[3]")).click();
        BrowserUtils.waitFor(1);
    }
}
