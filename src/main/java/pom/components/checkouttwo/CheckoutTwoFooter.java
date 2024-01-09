package pom.components.checkouttwo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import pom.common.AbstractComponent;

public class CheckoutTwoFooter extends AbstractComponent {
    @FindBy(xpath = "//div[@class='cart_footer']")
    @CacheLookup
    private WebElement checkoutTwoFooter;
    @FindBy(xpath = "//button[@id='finish']")
    @CacheLookup
    private WebElement finishBth;

    public CheckoutTwoFooter(WebDriver driver) {
        super(driver);
    }

    public void clickFinishBtn() {
        this.finishBth.click();
    }

    @Override
    public boolean isDisplayed() {
        return this.wait.until((d) -> this.checkoutTwoFooter.isDisplayed());
    }


}
