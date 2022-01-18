package page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CloudGoogleSearchPage extends AbstractPage {

    private String searchTerm;

    private String googleCloudPlatformPricingCalculatorLink
            = "//b[text()='Google Cloud Platform Pricing Calculator']//ancestor::a[@class='gs-title']";

    public CloudGoogleSearchPage(WebDriver driver, String searchTerm) {
        super(driver);
        this.searchTerm = searchTerm;
    }

    public GoogleCloudPlatformPricingCalculatorHome selectSearchLink() {
        waiterElementLocated("//*[@class='gs-title']");
        scrollToElement(googleCloudPlatformPricingCalculatorLink);
        driver.findElement(By.xpath(googleCloudPlatformPricingCalculatorLink)).click();
        return new GoogleCloudPlatformPricingCalculatorHome(driver);
    }

    private void scrollToElement(String xpath) {
        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].scrollIntoView(true); window.scrollBy(0, -window.innerHeight / 4);", driver.findElement(By.xpath(xpath)));
    }

    private void waiterElementLocated(String xpath) {
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
    }

    @Override
    public CloudGoogleSearchPage openPage() {
        return this;
    }
}
