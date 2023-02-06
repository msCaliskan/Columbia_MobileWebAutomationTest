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

    @FindBy(xpath = "//*[text()='Tekrar Gösterme']") public WebElement popUp_Loc;

    public void mobilLogin(){
        BrowserUtils.waitFor(3);

        try {
            BrowserUtils.waitForClickablility(popUp_Loc,2);
            popUp_Loc.click();
        }catch (Exception e){
            BrowserUtils.waitFor(1);
        }

        String email = ConfigurationReader.get("user_email");
        String password = ConfigurationReader.get("user_password");

        email_Loc.sendKeys(email);
        password_Loc.sendKeys(password);
        Driver.get().findElement(By.xpath("(//span[text()='Giriş Yap'])[3]")).click();
        BrowserUtils.waitFor(1);
    }

    public void invalidEmailMobile(){
        email_Loc.sendKeys(ConfigurationReader.get("guest_email"));
        password_Loc.sendKeys(ConfigurationReader.get("user_password"));
        Driver.get().findElement(By.xpath("(//span[text()='Giriş Yap'])[3]")).click();
    }
    public void invalidPasswordMobile(){
        email_Loc.sendKeys(ConfigurationReader.get("user_email"));
        password_Loc.sendKeys("Inveon34...");
        Driver.get().findElement(By.xpath("(//span[text()='Giriş Yap'])[3]")).click();
    }
}
