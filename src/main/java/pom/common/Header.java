package pom.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Header extends AbstractComponent {
    @FindBy(xpath = "//div[@class='header_label']")
    private WebElement header;
    @FindBy(xpath = "//div[@id='shopping_cart_container']//a")
    private WebElement cartLink;
    @FindBy(xpath = "//span[@class='shopping_cart_badge']")
    private WebElement cartBadge;

    public Header(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isDisplayed() {
        return this.wait.until((d) -> this.header.isDisplayed());
    }

    public Header clickCartLink() {
        wait.until(ExpectedConditions.elementToBeClickable(this.cartLink)).click();
        return this;
    }

    public int getCartBadgeQuantity() {
        return Integer.parseInt(this.cartBadge.getText());
    }
}
