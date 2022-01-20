package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static utils.CommonUtils.waitForElementClickable;
import static utils.CommonUtils.waitForElementLocated;

public class YopmailPageWithRandomEmail extends AbstractPage {

    private String generatedEmailAddress = "//*[@id='egen']";
    private String unnecessaryTextFromChildNodeEmailAddress = "//*[@id='egen']/script";

    private String checkEmailButton = "//button[@onclick='egengo();']";

    public YopmailPageWithRandomEmail(WebDriver driver) {
        super(driver);
    }

    public String getEmailAddress() {
        waitForElementLocated(generatedEmailAddress, driver);
        String emailAddress = driver.findElement(By.xpath(generatedEmailAddress)).getText();
        String unnecessaryText = driver.findElement(By.xpath(unnecessaryTextFromChildNodeEmailAddress)).getText();
        return emailAddress.replace(unnecessaryText, "").trim();
    }

    public EmailHomePage checkEmail() {
        waitForElementClickable(checkEmailButton, driver);
        driver.findElement(By.xpath(checkEmailButton)).click();
        return new EmailHomePage(driver);
    }

    @Override
    public YopmailPageWithRandomEmail openPage() {
        return this;
    }
}
