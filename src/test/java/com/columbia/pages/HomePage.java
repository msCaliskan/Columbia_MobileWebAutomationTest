package com.columbia.pages;

import com.columbia.utilities.BrowserUtils;
import com.columbia.utilities.ConfigurationReader;
import com.columbia.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage extends BasePage{

    @FindBy(xpath = "//*[@d='M19 6.41L17.59 5 12 10.59 6.41 5 5 6.41 10.59 12 5 17.59 6.41 19 12 13.41 17.59 19 19 17.59 13.41 12z']") public WebElement popUP_Loc;

    @FindBy(css = "#arrow-1568620800441") public WebElement arrow_Loc;

    @FindBy(xpath = "//span[text()='Kabul Ediyorum']") public WebElement cookies_Loc;

    @FindBy(xpath = "//*[@data-testid='header-account-button']") public WebElement loginBtn_Loc;

    @FindBy(css = "#email") public WebElement email_Loc;

    @FindBy(css = "#password") public WebElement password_Loc;

    @FindBy(xpath = "(//button[@class='MuiButtonBase-root MuiIconButton-root'])[1]") public WebElement hamburgerMenuBtn_Loc;

    @FindBy(css = "#search") public WebElement searchBox_Loc;

    @FindBy(xpath = "//*[@class='MuiSvgIcon-root jss125']") public WebElement findBtn_Loc;

    @FindBy(xpath = "(//*[text()='Giriş Yap'])[2]") public WebElement girisYapBtn_Loc;

    public void gotoHomePage(){
        Driver.get().get(ConfigurationReader.get("url"));
//        BrowserUtils.waitForClickablility(arrow_Loc,5);
//        arrow_Loc.click();
        BrowserUtils.waitForClickablility(cookies_Loc,5);
        cookies_Loc.click();
        BrowserUtils.waitForClickablility(popUP_Loc,5);
        popUP_Loc.click();
    }

    public void mobilLogin(){
        String email = ConfigurationReader.get("user_email");
        String password = ConfigurationReader.get("user_password");

        email_Loc.sendKeys(email);
        password_Loc.sendKeys(password);
        Driver.get().findElement(By.xpath("(//span[text()='Giriş Yap'])[3]")).click();
    }

    public static void checkHomePage(){
        String expectedUrl ="https://www.columbia.com.tr/";
        String actualUrl = Driver.get().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
    }

    public void searchBox(String string){
        searchBox_Loc.sendKeys(string+Keys.ENTER);
        BrowserUtils.waitFor(1);
    }
    public void closePopUp(){
        BrowserUtils.waitForClickablility(new HomePage().popUP_Loc,5);
        popUP_Loc.click();
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

    public void clickGirisYap(){
        girisYapBtn_Loc.click();
        BrowserUtils.waitFor(1);
    }

}
