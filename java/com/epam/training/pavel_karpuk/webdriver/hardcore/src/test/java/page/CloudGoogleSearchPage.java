package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static utils.CommonUtils.scrollToElement;
import static utils.CommonUtils.waitForElementLocated;

public class CloudGoogleSearchPage extends AbstractPage {

    private String pageLoadingLocator = "//*[@class='gs-title']";
    private String googleCloudPlatformPricingCalculatorLink
            = "//b[text()='Google Cloud Platform Pricing Calculator']//ancestor::a[@class='gs-title']";

    public CloudGoogleSearchPage(WebDriver driver) {
        super(driver);
    }

    public GoogleCloudPlatformPricingCalculatorHome selectSearchLink() {
        waitForElementLocated(pageLoadingLocator, driver);
        scrollToElement(googleCloudPlatformPricingCalculatorLink, driver);
        driver.findElement(By.xpath(googleCloudPlatformPricingCalculatorLink)).click();
        return new GoogleCloudPlatformPricingCalculatorHome(driver);
    }

    @Override
    public CloudGoogleSearchPage openPage() {
        return this;
    }
}
