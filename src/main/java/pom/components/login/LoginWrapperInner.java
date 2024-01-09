package pom.components.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import pom.common.AbstractComponent;

public class LoginWrapperInner extends AbstractComponent {
    @FindBy(xpath = "//div[@class='login_wrapper-inner']")
    @CacheLookup
    private WebElement wrapperInner;
    @FindBy(xpath = "//input[@id='user-name']")
    @CacheLookup
    private WebElement usernameFld;
    @FindBy(xpath = "//input[@id='password']")
    @CacheLookup
    private WebElement passwordFld;
    @FindBy(xpath = "//input[@id='login-button']")
    @CacheLookup
    private WebElement loginBtn;
    @FindBy(xpath = "((//*[local-name()='svg'])[1])")
    private WebElement usernameErrorIcn; // svg element
    @FindBy(xpath = "((//*[local-name()='svg'])[2])")
    private WebElement passwordErrorIcn; // svg element

    public LoginWrapperInner(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isDisplayed() {
        return this.wait.until((d) -> this.wrapperInner.isDisplayed());
    }

    public LoginWrapperInner enterUsername(String username) {
        this.usernameFld.sendKeys(username);
        return this;
    }

    public LoginWrapperInner enterPassword(String password) {
        this.passwordFld.sendKeys(password);
        return this;
    }

    public void clickLoginButton() {
        this.loginBtn.click();
    }

    public void login(String username, String password) {
        enterUsername(username).enterPassword(password).clickLoginButton();
    }

    public boolean isUsernameEmpty() {
        return this.usernameFld.getAttribute("value").isEmpty();
    }

    public boolean isPasswordEmpty() {
        return this.passwordFld.getAttribute("value").isEmpty();
    }

    public boolean isUsernameErrorIconVisible() {
        return this.wait.until((d) -> this.usernameErrorIcn.isDisplayed());
    }

    public boolean isPasswordErrorIconVisible() {
        return this.wait.until((d) -> this.passwordErrorIcn.isDisplayed());
    }
}
