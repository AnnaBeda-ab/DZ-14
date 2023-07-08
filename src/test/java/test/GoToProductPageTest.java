package test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.MainPage;
import pageobjects.ProductPage;

public class GoToProductPageTest extends BaseTest {
    @Test
    public void testGoToProductPage() {
         new MainPage(driver)
                .goToProductPage()
                .putInCart()
                .setWatchCart()
                .getElement(By.cssSelector("a[href='https://magento.softwaretestingboard.com/radiant-tee.html']"))
                .click();
        Assert.assertEquals(driver.getCurrentUrl(),"https://magento.softwaretestingboard.com/radiant-tee.html",
                "Mistake is in cart");




    }

}
