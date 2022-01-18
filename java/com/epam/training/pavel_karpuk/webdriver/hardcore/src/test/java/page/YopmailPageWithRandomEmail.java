package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class YopmailPageWithRandomEmail extends AbstractPage {

    private String generatedEmailAddress = "//*[@id='egen']";

    private String checkEmailButton = "//button[@onclick='egengo();']";

    public YopmailPageWithRandomEmail(WebDriver driver) {
        super(driver);
    }

    public String getEmailAddress() {
        waiterElementLocated(generatedEmailAddress);
        String emailAddress = driver.findElement(By.xpath(generatedEmailAddress)).getText();
        String unnecessaryText = driver.findElement(By.xpath("//*[@id='egen']/script")).getText();
        return emailAddress.replace(unnecessaryText, "").trim();
    }

    public EmailHomePage checkEmail() {
        waiterElementClickable(checkEmailButton);
        driver.findElement(By.xpath(checkEmailButton)).click();
        return new EmailHomePage(driver);
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
    public YopmailPageWithRandomEmail openPage() {
        return this;
    }
}
