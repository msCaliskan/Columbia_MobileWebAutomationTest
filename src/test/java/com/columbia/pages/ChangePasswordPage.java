package com.columbia.pages;

import com.columbia.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChangePasswordPage extends BasePage{

    @FindBy(css = "#oldPassword") public WebElement gecerliSifre_Loc;

    @FindBy(css = "#newPassword") public WebElement yeniSifre_Loc;

    @FindBy(css = "#confirmNewPassword") public WebElement sifreTekrari_Loc;

    @FindBy(xpath = "//span[text()='Şifre Değiştir']") public WebElement sifreDegistirBtn_Loc;

    public void changePassword(){
        gecerliSifre_Loc.sendKeys("Inveon34.");
        yeniSifre_Loc.sendKeys("Inveon34.");
        sifreTekrari_Loc.sendKeys("Inveon34.");

        sifreDegistirBtn_Loc.click();
        BrowserUtils.waitFor(2);
    }

    public void wrongOldPassword(){
        gecerliSifre_Loc.sendKeys("Inveon34..");
        yeniSifre_Loc.sendKeys("Inveon34.");
        sifreTekrari_Loc.sendKeys("Inveon34.");

        sifreDegistirBtn_Loc.click();
        BrowserUtils.waitFor(2);
    }
    public void differentPassword(){
        gecerliSifre_Loc.sendKeys("Inveon34.");
        yeniSifre_Loc.sendKeys("Inveon34..");
        sifreTekrari_Loc.sendKeys("Inveon34.");

        sifreDegistirBtn_Loc.click();
        BrowserUtils.waitFor(2);
    }
}
