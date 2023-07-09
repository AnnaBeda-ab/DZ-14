package test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pageobjects.MainPage;
import pageobjects.ProductPage;

public class GoToProductPageTest extends BaseTest {
    @Test
    public void testGoToProductPage() {
        new MainPage(driver)
                .goToProductPage()
                .putInCart()
                .setWatchCart();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(driver.findElement(By.xpath("//*[@id=\"shopping-cart-table\"]/tbody/tr[1]/td[1]/div/strong/a")).getText(), "Radiant Tee", "The item name is wrong");
        softAssert.assertEquals(driver.findElement(By.xpath("//*[@id=\"shopping-cart-table\"]/tbody/tr[1]/td[1]/div/dl/dd[1]")).getText(), "XS", "The size is wrong");
        softAssert.assertAll();

               /*  пробувала такі xpath для пошуку назви товару, в браузері девпанелі все знаходить вірно, в тесті фейлиться:
                    //div/strong[@class="product-item-name" and a[contains(@data-bind,"attr")]]
                   (//strong[@class="product-item-name"]/a)[2]
                   (//strong[@class="product-item-name" and a[text()='Radiant Tee']])[2]

              xpath for item name by right mouse click: "//*[@id=\"shopping-cart-table\"]/tbody/tr[1]/td[1]/div/strong/a"
                */
    }

}
