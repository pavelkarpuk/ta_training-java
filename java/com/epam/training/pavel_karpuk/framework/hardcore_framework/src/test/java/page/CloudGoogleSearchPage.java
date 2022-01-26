package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static utils.CommonUtils.scrollToElementDown;
import static utils.CommonUtils.waitForElementLocated;

public class CloudGoogleSearchPage extends AbstractPage {

    private final By pageLoadingLocator = By.xpath("//*[@class='gs-title']");
    private final By googleCloudPlatformPricingCalculatorLink
            = By.xpath("//b[text()='Google Cloud Platform Pricing Calculator']//ancestor::a[@class='gs-title']");

    public CloudGoogleSearchPage(WebDriver driver) {
        super(driver);
    }

    public GoogleCloudPlatformPricingCalculatorHome selectSearchLink() {
        waitForElementLocated(pageLoadingLocator, driver);
        scrollToElementDown(googleCloudPlatformPricingCalculatorLink, driver);
        driver.findElement(googleCloudPlatformPricingCalculatorLink).click();
        return new GoogleCloudPlatformPricingCalculatorHome(driver);
    }

    @Override
    public CloudGoogleSearchPage openPage() {
        return this;
    }
}
