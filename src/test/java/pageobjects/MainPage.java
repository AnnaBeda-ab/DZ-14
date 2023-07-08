package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends AbstractPageObject {

    private final By productName = By.cssSelector("a[href=\"https://magento.softwaretestingboard.com/radiant-tee.html\"]");

    public MainPage(WebDriver driver) {
        super(driver);
        driver.get("https://magento.softwaretestingboard.com/");
    }

    public ProductPage goToProductPage() {
        getElement(productName).click();
        return new ProductPage(driver);
    }



}
