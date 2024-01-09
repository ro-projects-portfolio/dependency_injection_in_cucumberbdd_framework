package pom.components.checkoutone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import pom.common.AbstractComponent;

public class CheckoutButtons extends AbstractComponent {

    @FindBy(xpath = "//div[@class='checkout_buttons']")
    @CacheLookup
    private WebElement checkoutButtons;

    @FindBy(xpath = "//input[@id='continue']")
    @CacheLookup
    private WebElement continueBtn;

    public CheckoutButtons(WebDriver driver) {
        super(driver);
    }

    public void clickContinueBtn(){
        this.continueBtn.click();
    }

    @Override
    public boolean isDisplayed() {
        return this.wait.until((d) -> this.checkoutButtons.isDisplayed());
    }
}
