package pom.components.checkoutcomplete;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import pom.common.AbstractComponent;

public class CheckoutCompleteContainer extends AbstractComponent {
    @FindBy(xpath = "//div[@id='checkout_complete_container']")
    @CacheLookup
    private WebElement completeContainer;
    @FindBy(xpath = "//h2[normalize-space()='Thank you for your order!']")
    private WebElement successMsg;

    public CheckoutCompleteContainer(WebDriver driver) {
        super(driver);
    }

    public boolean isSuccessMsgDisplayed () {
        return this.wait.until((d) -> this.successMsg.isDisplayed());
    }


    @Override
    public boolean isDisplayed() {
        return this.wait.until((d) -> this.completeContainer.isDisplayed());
    }

}
