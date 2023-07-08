package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AbstractPageObject {
private static final int DURATION_WAIT_SEC = 10;
protected WebDriver driver;
public AbstractPageObject (WebDriver driver){this.driver=driver;}
public WebElement getElement (By by){
return new WebDriverWait(driver, Duration.ofSeconds(DURATION_WAIT_SEC))
        .until(ExpectedConditions.presenceOfElementLocated(by));
}
}
