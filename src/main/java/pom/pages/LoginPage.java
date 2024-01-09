package pom.pages;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pom.components.login.LoginWrapperInner;


/**
 * {@link LoginPage} class represents the page containing the page details in a web application.
 * It extends the {@link BasePage} class and provides access to the {@link LoginWrapperInner} components.
 */
@Getter // lombok to generate getters
public class LoginPage extends BasePage {
    private final LoginWrapperInner loginWrapperInner;

    /**
     * Constructs a {@link LoginPage} object with the given {@link WebDriver} instance.
     *
     * @param driver The {@link WebDriver} instance used for interacting with the web application.
     */
    public LoginPage (WebDriver driver) {
        super(driver);
        this.loginWrapperInner = PageFactory.initElements(driver, LoginWrapperInner.class);
    }
    @Override
    public String getUrl() {
        return this.driver.getCurrentUrl();
    }

//    @FindBy (xpath = "//input[@id='user-name']") @CacheLookup private WebElement usernameFld;
//    @FindBy (xpath = "//input[@id='password']") @CacheLookup private WebElement passwordFld;
//    @FindBy (xpath = "//input[@id='login-button']") @CacheLookup private WebElement loginBtn;
//    @FindBy (xpath = "((//*[local-name()='svg'])[1])") private WebElement usernameErrorIcn; // svg element
//    @FindBy (xpath = "((//*[local-name()='svg'])[2])") private WebElement passwordErrorIcn; // svg element
//
//    public LoginPage(WebDriver driver) {
//        super(driver);
//    }
//
//
//    public LoginPage enterUsername (String username) {
//        wait.until(ExpectedConditions.visibilityOf(this.usernameFld)).sendKeys(username);
//        return this;
//    }
//    public LoginPage enterPassword (String password) {
//        wait.until(ExpectedConditions.visibilityOf(this.passwordFld)).sendKeys(password);
//        return this;
//    }
//    public void clickLoginButton () {
//        wait.until(ExpectedConditions.elementToBeClickable(this.loginBtn)).click();
//    }
//
//    public void login (String username, String password) {
//        enterUsername(username).enterPassword(password).clickLoginButton();
//    }
//
//    public boolean isUsernameEmpty(){
//        return this.usernameFld.getAttribute("value").isEmpty();
//    }
//    public boolean isPasswordEmpty(){
//        return this.passwordFld.getAttribute("value").isEmpty();
//    }
//    public boolean isUsernameErrorIconVisible () {
//        return this.usernameErrorIcn.isDisplayed();
//    }
//
//    public boolean isPasswordErrorIconVisible () {
//        return this.passwordErrorIcn.isDisplayed();
//    }

}
