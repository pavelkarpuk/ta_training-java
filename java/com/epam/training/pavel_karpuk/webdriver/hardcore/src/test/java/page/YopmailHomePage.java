package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static utils.CommonUtils.waitForElementClickable;

public class YopmailHomePage extends AbstractPage {

    private String HOMEPAGE_URL = "https://yopmail.com";

    private String generateRandomEmailAddressButton = "//*[@href='email-generator']";

    public YopmailHomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public YopmailHomePage openPage() {
        driver.get(HOMEPAGE_URL);
        return this;
    }

    public YopmailPageWithRandomEmail generateRandomEmailAddress() {
        waitForElementClickable(generateRandomEmailAddressButton, driver);
        driver.findElement(By.xpath(generateRandomEmailAddressButton)).click();
        return new YopmailPageWithRandomEmail(driver);
    }
}
