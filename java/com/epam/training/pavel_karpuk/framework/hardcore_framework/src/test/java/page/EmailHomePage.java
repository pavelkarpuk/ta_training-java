package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static utils.CommonUtils.waitForElementClickable;
import static utils.CommonUtils.waitForElementLocated;

public class EmailHomePage extends AbstractPage {

    private final By refreshEmailBox = By.xpath("//*[@id='refresh']");
    private final By frame = By.xpath("//*[@id='ifmail']");
    private final By estimatedMonthlyCost = By.xpath("//td[contains(text(),'USD')]");

    public EmailHomePage(WebDriver driver) {
        super(driver);
    }

    public String getEstimatedMonthlyCost() {
        refreshEmailHomePage();
        goToChildFrame();
        waitForElementLocated(estimatedMonthlyCost, driver);
        return driver.findElement(estimatedMonthlyCost).getText();
    }

    private void goToChildFrame() {
        driver.switchTo().frame(driver.findElement(frame));
    }

    private void refreshEmailHomePage() {
        waitForElementClickable(refreshEmailBox, driver);
        driver.findElement(refreshEmailBox).click();
    }

    @Override
    public EmailHomePage openPage() {
        return this;
    }
}
