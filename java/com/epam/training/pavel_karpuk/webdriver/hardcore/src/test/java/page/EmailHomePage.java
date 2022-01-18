package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
        waiterElementLocated(estimatedMonthlyCost);
        return driver.findElement(By.xpath(estimatedMonthlyCost)).getText();
    }

    public void goToChildFrame() {
        driver.switchTo().frame(driver.findElement(By.xpath(frame)));
    }

    private void refreshEmailHomePage() {
        waiterElementClickable(refreshEmailBox);
        driver.findElement(By.xpath(refreshEmailBox)).click();
    }

    private void waiterElementLocated(String xpath) {
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
    }

    private void waiterElementClickable(String xpath) {
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS)
                .until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
    }

    @Override
    public EmailHomePage openPage() {
        return this;
    }
}
