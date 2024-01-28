package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class locatorPage {

    public locatorPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@href=\"https://www.dopinger.com/panel/register/\"]")
    public WebElement registerButton;

    @FindBy(xpath = "//a[contains(text(),'Teklif al')]")
    public WebElement takeAnOfferButton;
    @FindBy(xpath = "//input[@id='mat-input-0']")
    public WebElement nameInput;

    @FindBy(xpath = "//input[@id='mat-input-1']")
    public WebElement emailInput;

    @FindBy(xpath = "//input[@id='mat-input-2']")
    public WebElement passwordInput;

    @FindBy(xpath = "//input[@id='mat-input-3']")
    public WebElement confirmPasswordInput;

    @FindBy(xpath = "//span[@class='mat-checkbox-inner-container']")
    public WebElement privacyPolicyCheckbox;

    @FindBy(xpath = "//button[@class='mat-focus-indicator mat-raised-button mat-button-base mat-primary']")
    public WebElement registerSecondPageButton;

    @FindBy(xpath = "//*[text()='Alan gereklidir.']")
    public WebElement errorEmptyMessageForNameInput;

    @FindBy(xpath = "//*[text()=\"Geçerli bir e-posta adresi olmalıdır.\"]")
    public WebElement errorMessageForEmailInput;

    @FindBy(xpath = "//*[text()='En az 8 karakter olmalıdır.']")
    public WebElement errorMessageForPasswordlInput;

    @FindBy(xpath = "//*[text()='Şifreler aynı değil.']")
    public WebElement errorMessageForConfirmPasswordlInput;

    @FindBy(xpath = "//*[text()='Alan gereklidir.']")
    public WebElement errorMandatoryFields;

}
