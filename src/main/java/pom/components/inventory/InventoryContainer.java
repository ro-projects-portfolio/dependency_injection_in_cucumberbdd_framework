package pom.components.inventory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pom.common.AbstractComponent;

public class InventoryContainer extends AbstractComponent {
    @FindBy(xpath = "//div[@class='inventory_container']")
    @CacheLookup
    private WebElement inventory;

    public InventoryContainer(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isDisplayed() {
        return this.wait.until((d) -> this.inventory.isDisplayed());
    }

    public void addToCart(String productName) {
        By addToCart = By.xpath("//div[normalize-space()='" + productName + "']/../../../..//button[normalize-space()='Add to cart']");
        wait.until(ExpectedConditions.elementToBeClickable(addToCart)).click();
    }
}
