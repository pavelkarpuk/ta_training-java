package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static utils.CommonUtils.waitForElementClickable;

public class EmailHomePage extends AbstractPage {

    private final By refreshEmailBox = By.xpath("//*[@id='refresh']");
    private final By frame = By.xpath("//*[@id='ifmail']");
    private final By estimatedMonthlyCost = By.xpath("//td[contains(text(),'USD')]");

    public EmailHomePage(WebDriver driver) {
        super(driver);
    }

    public String getEstimatedMonthlyCost() throws Exception {
        try {
            return waitEmail().getText();
        } catch (Exception e) {
            e.printStackTrace();
        }
        throw new Exception();
    }

    private WebElement waitEmail() throws Exception {
        for (int i = 0; i < 5; i++) {
            String parentWindow = driver.getWindowHandle();
            goToChildFrame();
            WebElement element = isEmailExist();
            if (element != null) {
                return element;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            driver.switchTo().window(parentWindow);
            refreshEmailHomePage();
        }
        throw new Exception();
    }

    private WebElement isEmailExist() {
        try {
            return driver.findElement(estimatedMonthlyCost);
        } catch (Exception e) {
            return null;
        }
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
