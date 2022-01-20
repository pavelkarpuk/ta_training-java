package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.CommonUtils;

public class CloudGoogleSearchPage extends AbstractPage {

    private String googleCloudPlatformPricingCalculatorLink
            = "//b[text()='Google Cloud Platform Pricing Calculator']//ancestor::a[@class='gs-title']";

    public CloudGoogleSearchPage(WebDriver driver) {
        super(driver);
    }

    public GoogleCloudPlatformPricingCalculatorHome selectSearchLink() {
        CommonUtils.waitForElementLocated("//*[@class='gs-title']", driver);
        CommonUtils.scrollToElement(googleCloudPlatformPricingCalculatorLink, driver);
        driver.findElement(By.xpath(googleCloudPlatformPricingCalculatorLink)).click();
        return new GoogleCloudPlatformPricingCalculatorHome(driver);
    }

    @Override
    public CloudGoogleSearchPage openPage() {
        return this;
    }
}
