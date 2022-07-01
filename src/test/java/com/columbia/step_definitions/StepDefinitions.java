package com.columbia.step_definitions;

import com.columbia.pages.*;
import com.columbia.utilities.BrowserUtils;
import com.columbia.utilities.ConfigurationReader;
import com.columbia.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class StepDefinitions {

    @Given("The user visits Columbia homepage")
    public void the_user_visits_Columbia_homepage() {
        new HomePage().gotoHomePage();
        BrowserUtils.waitFor(1);
    }

    @And("The user verifies redirected to homepage")
    public void the_user_verifies_redirected_to_homepage() {
        HomePage.checkHomePage();
    }

    @Given("The user hovers to login button")
    public void the_user_hovers_to_login_button() {
        BrowserUtils.hover(new HomePage().loginBtn_Loc);
    }

    @When("The user clicks login button")
    public void the_user_clicks_login_button() {
        BrowserUtils.waitFor(1);
        new HomePage().loginBtn_Loc.click();
        BrowserUtils.waitFor(2);
    }
    @And("The user enters invalid email for mobile")
    public void theUserEntersInvalidEmailForMobile() {
        new HomePage().invalidEmailMobile();
    }

    @And("The user enters invalid password for mobile")
    public void theUserEntersInvalidPasswordForMobile() {
        new HomePage().invalidPasswordMobile();
    }
    @Given("The user clicks hamburger menu button")
    public void the_user_clicks_hamburger_menu_button() {
        BrowserUtils.waitFor(2);
        new HomePage().hamburgerMenuBtn_Loc.click();
        BrowserUtils.waitFor(1);
    }

    @When("The user verifies redirected to {string} page")
    public void the_user_verifies_redirected_to_page(String expUrl) {
        BasePage.verifyUrl(expUrl);
    }

    @When("The user checks {string}, {string}, {string} and {string} informations")
    public void the_user_checks_and_informations(String name, String lastName, String email, String phone) {
        new AccountPage().getInformation(name,lastName,email,phone);
    }
    @When("The user clicks arrow button")
    public void the_user_clicks_arrow_button() {
        new AccountPage().arrowBtn_Loc.click();
    }

    @When("The user clicks {string} button")
    public void the_user_clicks_button(String button) {
        BasePage.clickButton(button);
    }

    @When("The user enters old, new and confirm new password")
    public void the_user_enters_old_new_and_confirm_new_password() {
        new AccountPage().changePassword();
    }

    @When("The user enters valid informations")
    public void the_user_enters_valid_informations() {
      new AccountPage().enterAdress();
    }

    @When("The user enters valid informations for guest")
    public void theUserEntersValidInformationsForGuest() {
        new AccountPage().enterGuestAdress();
    }

    @Given("The user navigates to {string} {string} category")
    public void the_user_navigates_to_category(String tab, String module) {
        BasePage.navigateToModule(tab,module);
    }

    @When("The user clicks anyone product")
    public void the_user_clicks_anyone_product() {
        new CategoryAndProductPage().clickProductRandom();
    }

    @When("The user clicks hearth button")
    public void the_user_clicks_hearth_button() {
        new CategoryAndProductPage().hearthBtn_Loc.click();
        BrowserUtils.waitFor(1);
    }

    @When("The user verifies {string} message")
    public void the_user_verifies_message(String message) {
        Assert.assertEquals(message, BasePage.verifyMessage(message));
    }

    @When("The user chooses color and size")
    public void the_user_chooses_color_and_size() {
        new CategoryAndProductPage().selectSize();
    }

    @When("The user enters invalid informations")
    public void the_user_enters_invalid_informations() {
        new CheckoutPage().invalidCard();
    }

    @When("The user selects 3D Secure, Ön Bilgilendirme and Mesafeli Satış Sözleşmesi buttons")
    public void the_user_selects_3D_Secure_Ön_Bilgilendirme_and_Mesafeli_Satış_Sözleşmesi_buttons() {
        new CheckoutPage().checkBox();
    }

    @Then("The user clicks Back button")
    public void the_user_clicks_Back_button() {
        Driver.get().navigate().back();
    }

    @Then("The user enters forget password email adress")
    public void the_user_enters_forget_password_email_adress() {
        new HomePage().email_Loc.sendKeys(ConfigurationReader.get("user_email"));
    }
    @Given("The user fills {string} in the searchbox and click")
    public void the_user_fills_in_the_searchbox_and_click(String string) {
        new HomePage().searchBox(string);
    }

    @Then("The user should see all search results match with {string}")
    public void the_user_should_see_all_search_results_match_with(String string) {
        new CategoryAndProductPage().searchResult(string);
    }

    @And("The user enters valid credentials for mobile")
    public void theUserEntersValidCredentialsForMobile() {
        new HomePage().mobilLogin();
        BrowserUtils.waitFor(1);
    }

    @When("The user selects 3D Secure, Ön Bilgilendirme and Mesafeli Satış Sözleşmesi buttons for mobile")
    public void the_user_selects_3D_Secure_Ön_Bilgilendirme_and_Mesafeli_Satış_Sözleşmesi_buttons_for_mobile() {
        new CheckoutPage().checkBoxMobile();
    }


    @And("The user clicks find button")
    public void theUserClicksFindButton() {
        new HomePage().findBtn_Loc.click();
    }

    @Then("The user clicks Şifremi Sıfırla button")
    public void theUserClicksŞifremiSıfırlaButton() {
        new AccountPage().sifremiSifirla_Loc.click();
    }

    @And("The user closes pop-Ups")
    public void theUserClosesPopUps() {
        new HomePage().closePopUp();
    }

    @And("The user closes arrows")
    public void theUserClosesArrows() {
        new AccountPage().closeArrow();

    }

    @Then("The user clicks Sepetim button")
    public void theUserClicksSepetimButton() {
        new CheckoutPage().sepetim_Loc.click();
        BrowserUtils.waitFor(1);
    }

    @And("The user verifies message")
    public void theUserVerifiesMessage() {
        AccountPage.verifyMessage();
    }

    @And("The user clicks Giris Yap button")
    public void theUserClicksGirisYapButton() {
        new HomePage().clickGirisYap();
    }

    @And("The user clicks Çıkış button")
    public void theUserClicksÇıkışButton() {
        BrowserUtils.clickWithJS(new AccountPage().cikisYap_Loc);
    }

    @And("The user navigates to {string} {string} category for mobile")
    public void theUserNavigatesToCategoryForMobile(String category, String subCategory) {
        CategoryAndProductPage.navigateMobile(category,subCategory);
    }

    @And("The user chooses store informations")
    public void theUserChoosesStoreInformations() {
        new AccountPage().storeInformations();
    }

    @And("The user enters wrong old password")
    public void theUserEntersWrongOldPassword() {
        new AccountPage().wrongOldPassword();
    }

    @And("The user enters different passwords")
    public void theUserEntersDifferentPasswords() {
        new AccountPage().differentPassword();
    }
}