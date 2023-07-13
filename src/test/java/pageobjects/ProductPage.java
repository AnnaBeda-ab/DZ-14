package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage extends AbstractPageObject {
    public ProductPage(WebDriver driver) {
        super(driver);
        //driver.get("https://magento.softwaretestingboard.com/radiant-tee.html");
    }

    private final By sizeOfProduct = By.cssSelector("#option-label-size-143-item-166");
    private final By colorOfProduct = By.cssSelector("#option-label-color-93-item-50");
    private final By addToCartButton = By.cssSelector("#product-addtocart-button");
    private final By watchCart =  By.xpath("(//a[@href=\"https://magento.softwaretestingboard.com/checkout/cart/\"])[3]");
            //By.cssSelector("[class='counter-number']");


    public ProductPage putInCart(){
       getElement(sizeOfProduct).click();
       getElement(colorOfProduct).click();
       getElement(addToCartButton).click();
       return this;
    }
    public void setWatchCart (){
        getElement(watchCart).click();
        //clickOnElementWithJS(watchCart);

    }
}
