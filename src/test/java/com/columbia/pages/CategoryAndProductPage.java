package com.columbia.pages;

import com.columbia.utilities.BrowserUtils;
import com.columbia.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CategoryAndProductPage extends BasePage {

    @FindBy(xpath = "//*[contains(@class,'MuiGrid-root MuiGrid-item MuiGrid-grid-xs-6 MuiGrid-grid-sm-4 MuiGrid-grid-md-3')]") public List<WebElement> prodList_Loc;

    @FindBy(xpath = "//button[contains(@class, 'MuiLink-button MuiTypography-caption MuiTypography-colorPrimary')]") public List<WebElement> sizeList_Loc;

    @FindBy(xpath = "//div[contains(@class,'MuiButton-disableElevation')]") public WebElement hearthBtn_Loc;

    @FindBy(xpath = "//*[contains(@class,'MuiTypography-button')]") public WebElement sepeteEkle_Loc;

    @FindBy(xpath = "//*[@class='MuiTypography-root jss140 MuiTypography-body1']") public List<WebElement> productName_Loc;

    @FindBy(xpath = "(//*[@class='MuiSvgIcon-root'])[5]") public WebElement erkekCategory_Loc;

    @FindBy(xpath = "(//*[@class='MuiSvgIcon-root'])[4]") public WebElement kadinCategory_Loc;




    public void clickProductRandom(){

        Random rn = new Random();
        int a = rn.nextInt(prodList_Loc.size());


        BrowserUtils.waitFor(1);
        BrowserUtils.hover(prodList_Loc.get(a));
        BrowserUtils.waitFor(1);
        prodList_Loc.get(a).click();
        BrowserUtils.waitFor(1);
    }

    public void selectSize(){

        for (int i = 0; i < sizeList_Loc.size(); i++) {
            sizeList_Loc.get(i).click();
            BrowserUtils.waitFor(1);

            if (sepeteEkle_Loc.getText().equalsIgnoreCase("Sepete Ekle")) {
                    sepeteEkle_Loc.click();
                    break;
                }
        }
    }

    public void searchResult(String string){

        List<String> allNames = new ArrayList<>();
        for (WebElement element : prodList_Loc) {
        allNames.add(element.getText());
        }
        for (int i = 0; i < productName_Loc.size(); i++) {
             allNames.get(i).contains(string);
        }
    }

    public static void navigateMobile(String tab, String module){
        String tabLocator = "(//p[text()='"+tab+"'])[2]";
        String moduleLocator = "(//p[text()='"+module+"'])[2]";

        Driver.get().findElement(By.xpath(tabLocator)).click();
        BrowserUtils.waitForClickablility(Driver.get().findElement(By.xpath(moduleLocator)),5);
       // BrowserUtils.hover(Driver.get().findElement(By.xpath(moduleLocator)));
        Driver.get().findElement(By.xpath(moduleLocator)).click();
        BrowserUtils.waitFor(1);

    }

}