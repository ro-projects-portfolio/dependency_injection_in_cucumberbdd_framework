package pom.pages;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pom.common.Header;
import pom.components.inventory.InventoryContainer;


/**
 * {@link InventoryPage} class represents the page containing the page details in a web application.
 * It extends the {@link BasePage} class and provides access to the {@link Header} and {@link InventoryContainer} components.
 */
@Getter // lombok to generate getters
public class InventoryPage extends BasePage {
    private final Header header;
    private final InventoryContainer inventoryContainer;

    /**
     * Constructs a {@link InventoryPage} object with the given {@link WebDriver} instance.
     *
     * @param driver The {@link WebDriver} instance used for interacting with the web application.
     */
    public InventoryPage(WebDriver driver) {
        super(driver);
        this.header = PageFactory.initElements(driver, Header.class);
        this.inventoryContainer = PageFactory.initElements(driver, InventoryContainer.class);
    }

    @Override
    public String getUrl() {
        return this.driver.getCurrentUrl();
    }

//    @FindBy(xpath = "//div[@id='shopping_cart_container']//a") private WebElement cartLink;
//    @FindBy (xpath = "//span[@class='shopping_cart_badge']") private WebElement cartBadge;
//    public InventoryPage(WebDriver driver) {
//        super(driver);
//    }
//    public void addToCart (String productName) {
//        By addToCart = By.xpath("//div[normalize-space()='" + productName + "']/../../../..//button[normalize-space()='Add to cart']");
//        wait.until(ExpectedConditions.elementToBeClickable(addToCart)).click();
//    }
//    public InventoryPage clickCartLink (){
//        wait.until(ExpectedConditions.elementToBeClickable(this.cartLink)).click();
//        return this;
//    }
//    public int getCartBadgeQuantity () {
//        return Integer.parseInt(this.cartBadge.getText());
//    }

}
