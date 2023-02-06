package com.columbia.pages;

import com.columbia.utilities.BrowserUtils;
import com.columbia.utilities.ConfigurationReader;
import com.columbia.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;


public class HomePage extends BasePage{

    @FindBy(xpath = "//*[@aria-label='close']") public WebElement popUp2_Loc;

    @FindBy(xpath = "//span[text()='Kabul Ediyorum']") public WebElement cookies_Loc;

    @FindBy(xpath = "//*[@data-testid='header-account-button']") public WebElement loginBtn_Loc;

    @FindBy(css = "#email") public WebElement email_Loc;

    @FindBy(xpath = "(//button[@class='MuiButtonBase-root MuiIconButton-root'])[1]") public WebElement hamburgerMenuBtn_Loc;

    @FindBy(css = "#search") public WebElement searchBox_Loc;

    @FindBy(xpath = "(//*[text()='Giriş Yap'])[2]") public WebElement girisYapBtn_Loc;

    @FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-h3 muirtl-14hb52n']") public List<WebElement> footerMenuNames_Loc;

    @FindBy(xpath = "(//*[name()='svg'][@class='MuiSvgIcon-root jss227 jss229'])[1]") public WebElement kurumsalButton_Loc;

    @FindBy(xpath = "(//*[name()='svg'][@class='MuiSvgIcon-root jss227 jss237'])[1]") public WebElement yardimButton_Loc;

    @FindBy(xpath = "//a[@class='MuiTypography-root MuiLink-root MuiLink-underlineNone jss193 MuiTypography-colorSecondary']") public List<WebElement> footerLinks_Loc;


    @FindBy(css = "a[href='https://www.instagram.com/columbiasportswear_tr']") public WebElement instagramButton_Loc;

    @FindBy(css = "a[href='https://www.facebook.com/ColumbiaTurkey']") public WebElement facebookButton_Loc;

    @FindBy(css = "a[href='https://twitter.com/Columbia_TR']") public WebElement twitterButton_Loc;

    @FindBy(css = "a[href='https://www.youtube.com/channel/UCxKwjVULZxWFw1r6SZloXAw']") public WebElement youtubeButton_Loc;

    @FindBy(css = "a[href='https://tr.pinterest.com/columbia1938/']") public WebElement pinterestButton_Loc;

    @FindBy(css = "a[href='https://www.linkedin.com/company/columbia-sportswear/']") public WebElement linkedinButton_Loc;



    public void clickInstagramButton(){
        BrowserUtils.waitFor(2);
        BrowserUtils.clickWithJS(instagramButton_Loc);
        BrowserUtils.waitFor(2);
    }

    public void verifyInstagramPage(){
        BrowserUtils.getWindowHandle();
        String actualTitle = Driver.get().getTitle();
        String expectedTitle = "Columbia Sportswear Turkey (@columbiasportswear_tr) • Instagram photos and videos";
        Assert.assertEquals(expectedTitle,actualTitle);
    }

    public void clickFacebookButton(){
        BrowserUtils.waitFor(2);
        BrowserUtils.clickWithJS(facebookButton_Loc);
        BrowserUtils.waitFor(2);
    }

    public void verifyFacebookPage(){
        BrowserUtils.getWindowHandle();
        String actualTitle = Driver.get().getTitle();
        String expectedTitle = "Columbia Sportswear - Home | Facebook";
        Assert.assertEquals(expectedTitle,actualTitle);
    }

    public void clickTwitterButton(){
        BrowserUtils.waitFor(2);
        BrowserUtils.clickWithJS(twitterButton_Loc);
        BrowserUtils.waitFor(2);
    }

    public void verifyTwitterPage(){
        BrowserUtils.getWindowHandle();
        String actualTitle = Driver.get().getTitle();
        String expectedTitle = "Columbia_TR (@Columbia_TR) / Twitter";
        Assert.assertEquals(expectedTitle,actualTitle);
    }

    public void clickYoutubeButton(){
        BrowserUtils.waitFor(2);
        BrowserUtils.clickWithJS(youtubeButton_Loc);
        BrowserUtils.waitFor(2);
    }

    public void verifyYoutubePage(){
        BrowserUtils.getWindowHandle();
        String actualTitle = Driver.get().getTitle();
        String expectedTitle = "Columbia Sportswear - YouTube";
        Assert.assertEquals(expectedTitle,actualTitle);
    }

    public void clickPinterestButton(){
        BrowserUtils.waitFor(2);
        BrowserUtils.clickWithJS(pinterestButton_Loc);
        BrowserUtils.waitFor(2);
    }

    public void verifyPinterestPage(){
        BrowserUtils.getWindowHandle();
        String actualTitle = Driver.get().getTitle();
        String expectedTitle = "Columbia Sportswear (columbia1938) - Profile | Pinterest";
        Assert.assertEquals(expectedTitle,actualTitle);
    }

    public void clickLinkedinButton(){
        BrowserUtils.waitFor(2);
        BrowserUtils.clickWithJS(linkedinButton_Loc);
        BrowserUtils.waitFor(2);
    }

    public void verifyLinkedinPage(){
        BrowserUtils.getWindowHandle();
        String actualTitle = Driver.get().getTitle();
        String expectedTitle = "Columbia Sportswear Company | LinkedIn";
        Assert.assertEquals(expectedTitle,actualTitle);
    }

    public void gotoHomePage(){
        Driver.get().get(ConfigurationReader.get("url"));

        BrowserUtils.waitFor(2);

        BrowserUtils.waitForClickablility(cookies_Loc,5);
        cookies_Loc.click();
        BrowserUtils.waitForClickablility(popUp2_Loc,5);
        popUp2_Loc.click();
        BrowserUtils.waitFor(1);
    }

    public static void checkHomePage(){
        String expectedTitle ="Columbia Türkiye Online Shop";
        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
    }

    public void searchBox(String string){
        searchBox_Loc.sendKeys(string+Keys.ENTER);
        BrowserUtils.waitFor(1);
    }

    public void clickLoginButton(){
        BrowserUtils.waitFor(5);
        loginBtn_Loc.click();
        BrowserUtils.waitFor(1);
    }

    public void clickGirisYap(){
        BrowserUtils.waitForClickablility(girisYapBtn_Loc,5);
        girisYapBtn_Loc.click();
        BrowserUtils.waitFor(1);
    }

    public void clickHamburgerMenuButton(){
        BrowserUtils.waitForClickablility(hamburgerMenuBtn_Loc,5);
        hamburgerMenuBtn_Loc.click();
        BrowserUtils.waitFor(1);
    }

    List<String> allNames = new ArrayList<>();
    public void checkFooterNames(List<String> headerNames){

        for (WebElement element : footerMenuNames_Loc) {
            allNames.add(element.getText());
        }
        Assert.assertTrue(allNames.containsAll(headerNames));
    }

    public void checkPageTitle(String button, String title){
        BrowserUtils.waitFor(1);
        kurumsalButton_Loc.click();
        BrowserUtils.waitFor(1);
        yardimButton_Loc.click();
        BrowserUtils.waitFor(1);
        for (int i = 0; i < footerLinks_Loc.size(); i++) {
            if (footerLinks_Loc.get(i).getText().contains(button)){
                BrowserUtils.clickWithJS(footerLinks_Loc.get(i));
                BrowserUtils.waitForPageToLoad(10);
                BrowserUtils.waitFor(2);
                Assert.assertTrue("Search result value failed at instance ["+Driver.get().getTitle()+"]" ,Driver.get().getTitle().contains(title));
                BrowserUtils.waitFor(2);
                break;
            }
        }
    }

}
