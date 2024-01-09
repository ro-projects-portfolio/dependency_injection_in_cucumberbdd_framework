package pom.components.cart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pom.common.AbstractComponent;

public class CartList extends AbstractComponent {
    @FindBy(xpath = "//div[@class='cart_list']")
    @CacheLookup
    private WebElement cartList;

    public CartList(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isDisplayed() {
        return this.wait.until((d) -> this.cartList.isDisplayed());
    }

    public int getProductQuantity(String productName) {
        By productItm = By.xpath("//div[normalize-space()='" + productName + "']/../../../div[@class='cart_quantity']");
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(productItm));
        return Integer.parseInt(e.getText());
    }
}
