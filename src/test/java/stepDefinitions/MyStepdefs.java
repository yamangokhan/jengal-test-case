package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.locatorPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.time.Duration;

import static utilities.Driver.getDriver;


public class MyStepdefs {

    Faker faker = new Faker();
    locatorPage locatorPage = new locatorPage();

    Actions actions = new Actions(getDriver());

    @Given("the user goes to the {string}")
    public void theUserGoesToThe(String url) {
        getDriver().get(ConfigReader.getProperty("url"));
    }

    @When("the user clicks register button on homepage")
    public void theUserClicksRegisterButtonOnHomepage() {
        actions.moveToElement(locatorPage.takeAnOfferButton).perform(); // mouse on hover işlemi için gerekli.
        locatorPage.registerButton.click();
    }

    @When("the user enters {string} to name input area")
    public void theUserEntersToNameInputArea(String invalidName) {
        locatorPage.nameInput.sendKeys(invalidName);
    }

    @Then("the user enters {string} to email input area")
    public void theUserEntersToEmailInputArea(String invalidEmail) {
        locatorPage.emailInput.sendKeys(invalidEmail);
    }

    @And("the user enters {string} to password input area")
    public void theUserEntersToPasswordInputArea(String invalidPassword) {
        locatorPage.passwordInput.sendKeys(invalidPassword);
    }

    @And("the user confirms {string}")
    public void theUserConfirms(String arg0)  {
        locatorPage.confirmPasswordInput.sendKeys(ConfigReader.getProperty("validPassword1"));
    }

    @And("the user clicks privacy policy checkbox")
    public void theUserClicksPrivacyPolicyCheckbox() {
        locatorPage.privacyPolicyCheckbox.click();

    }

    @And("the user clicks register button")
    public void theUserClicksRegisterButton() {
        locatorPage.registerSecondPageButton.click();
    }

    @And("the user handles captcha")
    public void theUserHandlesCaptcha() throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds( 15 ));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt((By.xpath("//iframe[@title='reCAPTCHA sorusunun süresi iki dakika sonra dolacak']"))));
       // wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//iframe[@title='reCAPTCHA sorusunun süresi iki dakika sonra dolacak']"))).click();
        Thread.sleep(3000);
        Driver.getDriver().switchTo().defaultContent();
        Thread.sleep(3000);

    }

    @And("the user verifies that succesfull login to the page")
    public void theUserVerifiesThatSuccesfullLoginToThePage() throws InterruptedException {
        Driver.getDriver().navigate().refresh();
        Thread.sleep(3000);
        String expectedPageUrl = "https://www.dopinger.com/panel/";
        String actualPageUrl = getDriver().getCurrentUrl();
        System.out.println(" actualPageUrl : " + actualPageUrl);
        Assert.assertEquals(actualPageUrl, expectedPageUrl);

        Driver.getDriver().quit();
    }

    @And("the user verifies that error message is displayed")
    public void theUserVerifiesThatErrorMessageIsDisplayed() {
        locatorPage.errorMessageForEmailInput.isDisplayed();
        //Assert.assertEquals(ErrorMessage2, ConfigReader.getProperty("errorEmptyMessageForEmailInput"));
        //System.out.println(" Hata Mesaji : " + ErrorMessage2);
    }

    @When("the user enters valid to name input area")
    public void theUserEntersValidToNameInputArea() {
        locatorPage.nameInput.sendKeys(faker.name().name());
    }

    @And("the user enters valid password to password input area")
    public void theUserEntersValidPasswordToPasswordInputArea() {
        locatorPage.passwordInput.sendKeys(ConfigReader.getProperty("validPassword"));
    }

    @And("the user confirms password")
    public void theUserConfirmsPassword() {
        locatorPage.confirmPasswordInput.sendKeys(ConfigReader.getProperty("validPassword"));
    }

    @Then("the user enters valid email to email input area")
    public void theUserEntersValidEmailToEmailInputArea() {
        locatorPage.emailInput.sendKeys(faker.internet().emailAddress());
    }


    @And("the user enters {string} to corfirm input area")
    public void theUserEntersToCorfirmInputArea(String differentPassword) {
        locatorPage.confirmPasswordInput.sendKeys(differentPassword);


    }

    @When("the user enters valid name to name input area")
    public void theUserEntersValidNameToNameInputArea() {
        locatorPage.nameInput.sendKeys(faker.name().name());
    }

    @And("the user confirms valid password")
    public void theUserConfirmsValidPassword() {
        locatorPage.confirmPasswordInput.sendKeys(ConfigReader.getProperty("validPassword"));
    }

    @And("the user verifies that error message for name input is displayed")
    public void theUserVerifiesThatErrorMessageForNameInputIsDisplayed() {
        locatorPage.errorEmptyMessageForNameInput.isDisplayed();

    }

    @And("the user verifies that error message for password input is displayed")
    public void theUserVerifiesThatErrorMessageForPasswordInputIsDisplayed() {
        locatorPage.errorMessageForPasswordlInput.isDisplayed();
    }

    @And("the user enters {string} to confirm input area")
    public void theUserEntersToConfirmInputArea(String diffPassword) {
        locatorPage.confirmPasswordInput.sendKeys(diffPassword);
    }

    @And("the user verifies that error message for confirm password input is displayed")
    public void theUserVerifiesThatErrorMessageForConfirmPasswordInputIsDisplayed() {

        locatorPage.errorMessageForConfirmPasswordlInput.isDisplayed();
    }

    @When("the user clicks name input area")
    public void theUserClicksNameInputArea() {
        locatorPage.nameInput.click();
    }

    @Then("the user clicks email input area")
    public void theUserClicksEmailInputArea() {
        locatorPage.emailInput.click();
    }

    @And("the user clicks password input area")
    public void theUserClicksPasswordInputArea() {
        locatorPage.passwordInput.click();
    }

    @And("the user clicks confirm password input area")
    public void theUserClicksConfirmPasswordInputArea() {
        locatorPage.confirmPasswordInput.click();
    }

    @And("the user verifies that empty error messages are displayed")
    public void theUserVerifiesThatEmptyErrorMessagesAreDisplayed() {

        if (locatorPage.errorMandatoryFields.getText().equals(ConfigReader.getProperty("errorMandatoryFields"))){
            System.out.println("zorunlu alanlar için uyarı mesajı : " + locatorPage.errorMandatoryFields.getText());
        }
        else System.out.println("Test Failed");

    }
}

