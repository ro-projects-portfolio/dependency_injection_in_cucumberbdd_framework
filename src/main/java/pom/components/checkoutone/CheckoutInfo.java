package pom.components.checkoutone;

import objects.CheckoutDetails;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import pom.common.AbstractComponent;

public class CheckoutInfo extends AbstractComponent {

    @FindBy(xpath = "//div[@class='checkout_info']")
    @CacheLookup
    private WebElement checkoutInfo;
    @FindBy(xpath = "//input[@id='first-name']")
    @CacheLookup
    private WebElement firstNameFld;
    @FindBy(xpath = "//input[@id='last-name']")
    @CacheLookup
    private WebElement lastNameFld;
    @FindBy(xpath = "//input[@id='postal-code']")
    @CacheLookup
    private WebElement postalCodeFld;

    public CheckoutInfo(WebDriver driver) {
        super(driver);
    }

    public void enterCheckoutDetails (CheckoutDetails checkoutDetails) {
        this.firstNameFld.sendKeys(checkoutDetails.getFirstName());
        this.lastNameFld.sendKeys(checkoutDetails.getLastName());
        this.postalCodeFld.sendKeys(checkoutDetails.getPostalCode());
    }



    @Override
    public boolean isDisplayed() {
        return this.wait.until((d) -> this.checkoutInfo.isDisplayed());
    }
}
