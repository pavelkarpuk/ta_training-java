package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static utils.CommonUtils.waitForElementClickable;

public class YopmailHomePage extends AbstractPage {

    private final static String HOMEPAGE_URL = "https://yopmail.com";
    private final By generateRandomEmailAddressButton = By.xpath("//*[@href='email-generator']");

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
        driver.findElement(generateRandomEmailAddressButton).click();
        return new YopmailPageWithRandomEmail(driver);
    }
}
