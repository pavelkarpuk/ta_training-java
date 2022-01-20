package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static utils.CommonUtils.waitForElementClickable;
import static utils.CommonUtils.waitForElementLocated;

public class EmailHomePage extends AbstractPage {

    private String refreshEmailBox = "//*[@id='refresh']";

    private String frame = "//*[@id='ifmail']";

    private String estimatedMonthlyCost = "//td[contains(text(),'USD')]";

    public EmailHomePage(WebDriver driver) {
        super(driver);
    }

    public String getEstimatedMonthlyCost() {
        refreshEmailHomePage();
        goToChildFrame();
        waitForElementLocated(estimatedMonthlyCost, driver);
        return driver.findElement(By.xpath(estimatedMonthlyCost)).getText();
    }

    public void goToChildFrame() {
        driver.switchTo().frame(driver.findElement(By.xpath(frame)));
    }

    private void refreshEmailHomePage() {
        waitForElementClickable(refreshEmailBox, driver);
        driver.findElement(By.xpath(refreshEmailBox)).click();
    }

    @Override
    public EmailHomePage openPage() {
        return this;
    }
}
