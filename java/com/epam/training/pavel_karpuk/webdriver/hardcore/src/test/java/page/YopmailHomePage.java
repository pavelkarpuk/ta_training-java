package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class YopmailHomePage extends AbstractPage {

    private String HOMEPAGE_URL = "https://yopmail.com";

    private String generateRandomEmailAddressButton = "//*[@href='email-generator']";

    public YopmailHomePage(WebDriver driver) {
        super(driver);
    }

    public YopmailPageWithRandomEmail generateRandomEmailAddress() {
        waiterElementClickable(generateRandomEmailAddressButton);
        driver.findElement(By.xpath(generateRandomEmailAddressButton)).click();
        return new YopmailPageWithRandomEmail(driver);
    }

    private void waiterElementClickable(String xpath) {
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS)
                .until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
    }

    @Override
    public YopmailHomePage openPage() {
        driver.get(HOMEPAGE_URL);
        return this;
    }
}
