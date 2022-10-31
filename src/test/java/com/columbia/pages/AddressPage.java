package com.columbia.pages;

import com.columbia.utilities.BrowserUtils;
import com.columbia.utilities.ConfigurationReader;
import com.columbia.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AddressPage extends BasePage{

    @FindBy(css = "#firstName") public WebElement ad_Loc;

    @FindBy(css = "#lastName") public WebElement soyad_Loc;

    @FindBy(css = "#email") public WebElement email_Loc;

    @FindBy(css = "#phone") public WebElement telefon_Loc;

    @FindBy(css = "#title") public WebElement adresBasligi_Loc;

    @FindBy(css = "#countryId") public WebElement ulke_Loc;

    @FindBy(css = "#cityId") public WebElement sehir_Loc;

    @FindBy(css = "#countyId") public WebElement ilce_Loc;

    @FindBy(xpath = "//*[@class='MuiButtonBase-root MuiListItem-root MuiMenuItem-root MuiMenuItem-gutters MuiListItem-gutters MuiListItem-button']") public List<WebElement> dataList_Loc;

    @FindBy(css = "#zipPostalCode") public WebElement postaKodu_Loc;

    @FindBy(css = "#streetAddress") public WebElement adres_Loc;

    public void enterAdress(){
        BrowserUtils.waitFor(1);
        adresBasligi_Loc.sendKeys("Isyeri");
        ad_Loc.sendKeys("Test");
        soyad_Loc.sendKeys("Test");
        email_Loc.sendKeys(ConfigurationReader.get("user_email"));
        telefon_Loc.click();
        telefon_Loc.sendKeys("555555555");
        BrowserUtils.waitFor(1);

        BrowserUtils.scrollDown();
        BrowserUtils.waitFor(1);
        new Actions(Driver.get()).moveToElement(ulke_Loc).doubleClick(ulke_Loc).perform();

        BrowserUtils.waitFor(1);

        sehir_Loc.click();
        BrowserUtils.waitFor(1);

        for (int i = 0; i <= dataList_Loc.size(); i++) {
            if (dataList_Loc.get(i).getText().contains("Ankara")){
                dataList_Loc.get(i).click();
                break;
            }
        }

        BrowserUtils.waitFor(1);

        ilce_Loc.click();
        BrowserUtils.waitFor(1);

        for (int i = 0; i <= dataList_Loc.size(); i++) {
            if (dataList_Loc.get(i).getText().contains("EVREN")){
                dataList_Loc.get(i).click();
                break;
            }
        }
        BrowserUtils.waitFor(1);
        postaKodu_Loc.sendKeys("34340");
        BrowserUtils.waitFor(1);
        adres_Loc.sendKeys("test test test");
        BrowserUtils.waitFor(1);
    }
}
