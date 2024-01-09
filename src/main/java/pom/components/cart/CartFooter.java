package pom.components.cart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import pom.common.AbstractComponent;

public class CartFooter extends AbstractComponent {

    @FindBy(xpath = "//button[@id='checkout']")
    @CacheLookup
    private WebElement checkoutBtn;
    @FindBy(xpath = "//div[@class='cart_footer']")
    @CacheLookup
    private WebElement cartFooter;

    public CartFooter(WebDriver driver) {
        super(driver);
    }

    public void clickCheckoutBtn () {
        this.checkoutBtn.click();
    }

    @Override
    public boolean isDisplayed() {
        return this.wait.until((d) -> this.cartFooter.isDisplayed());
    }
}
