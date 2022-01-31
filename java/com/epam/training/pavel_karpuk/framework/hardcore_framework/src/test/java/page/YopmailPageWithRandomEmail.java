package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static utils.CommonUtils.waitForElementClickable;
import static utils.CommonUtils.waitForElementLocated;

public class YopmailPageWithRandomEmail extends AbstractPage {

    private final By generatedEmailAddress = By.xpath("//*[@id='egen']");
    private final By unnecessaryTextFromChildNodeEmailAddress = By.xpath("//*[@id='egen']/script");
    private final By checkEmailButton = By.xpath("//button[@onclick='egengo();']");

    public YopmailPageWithRandomEmail(WebDriver driver) {
        super(driver);
    }

    public String getEmailAddress() {
        waitForElementLocated(generatedEmailAddress, driver);
        String emailAddress = driver.findElement(generatedEmailAddress).getText();
        String unnecessaryText = driver.findElement(unnecessaryTextFromChildNodeEmailAddress).getText();
        return emailAddress.replace(unnecessaryText, "").trim();
    }

    public EmailHomePage checkEmail() {
        waitForElementClickable(checkEmailButton, driver);
        driver.findElement(checkEmailButton).click();
        return new EmailHomePage(driver);
    }

    @Override
    public YopmailPageWithRandomEmail openPage() {
        return this;
    }
}
