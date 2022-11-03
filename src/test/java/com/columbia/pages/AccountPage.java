package com.columbia.pages;


import com.columbia.utilities.BrowserUtils;
import com.columbia.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.Assert.assertEquals;

public class AccountPage extends BasePage{

    @FindBy(css = "#firstName") public WebElement ad_Loc;

    @FindBy(css = "#lastName") public WebElement soyad_Loc;

    @FindBy(css = "#email") public WebElement email_Loc;

    @FindBy(css = "#phone") public WebElement telefon_Loc;

    @FindBy(xpath = "(//button[@class='MuiButtonBase-root MuiIconButton-root'])[2]") public WebElement arrowBtn_Loc;

    @FindBy(xpath = "(//*[text()='Şifremi Sıfırla'])[2]") public WebElement sifremiSifirla_Loc;

    @FindBy(xpath = "(//button[contains(@class, 'MuiButtonBase-root MuiIconButton-root jss')])[2]") public WebElement cikisYap_Loc;

    public void getInformation(String name, String lastname, String email, String phone){
        String actName = ad_Loc.getAttribute("value");
        String actlastName = soyad_Loc.getAttribute("value");
        String actEmail = email_Loc.getAttribute("value");
        String actPhone = telefon_Loc.getAttribute("value");

        assertEquals(name,actName);
        assertEquals(lastname,actlastName);
        assertEquals(email,actEmail);
        assertEquals(phone,actPhone);
    }

    public static void verifyMessage(){
        String actual = Driver.get().findElement(By.xpath("//*[text()='Sepetiniz Boş']")).getText();
        String expected = "SEPETINIZ BOŞ";

        Assert.assertEquals(expected,actual);
    }

    public void clickCikisButton(){
        BrowserUtils.waitForClickablility(cikisYap_Loc,5);
        cikisYap_Loc.click();
        BrowserUtils.waitFor(1);
    }


}
