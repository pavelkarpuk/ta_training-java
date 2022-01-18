package page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PastebinHomePage extends AbstractPage {

    private static final String HOMEPAGE_URL = "https://pastebin.com";

    @FindBy(xpath = "//textarea[@id='postform-text']")
    private WebElement textAreaForCode;

    @FindBy(xpath = "//span[@id='select2-postform-format-container']")
    private WebElement syntaxHighlightingDropdown;

    @FindBy(xpath = "//span[@id='select2-postform-expiration-container']")
    private WebElement pasteExpirationDropdown;

    @FindBy(xpath = "//input[@id='postform-name']")
    private WebElement textAreaForPasteName;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement createNewPasteButton;

    private String selectBashSyntaxHighlighting = "//li[text()='Bash']";
    private String select10MinutesPasteExpiration = "//li[text()='10 Minutes']";

    public PastebinHomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public PastebinHomePage openPage() {
        driver.get(HOMEPAGE_URL);
        return this;
    }

    public PastebinHomePage writeCodeToTextArea(String code) {
        scrollToElement(textAreaForCode);
        textAreaForCode.sendKeys(code);
        return this;
    }

    public PastebinHomePage selectSyntaxHighlighting() {
        scrollToElement(syntaxHighlightingDropdown);
        syntaxHighlightingDropdown.click();
        driver.findElement(By.xpath(selectBashSyntaxHighlighting)).click();
        return this;
    }

    public PastebinHomePage selectPasteExpiration() {
        scrollToElement(pasteExpirationDropdown);
        pasteExpirationDropdown.click();
        driver.findElement(By.xpath(select10MinutesPasteExpiration)).click();
        return this;
    }

    public PastebinHomePage writePasteName(String pasteName) {
        textAreaForPasteName.sendKeys(pasteName);
        return this;
    }

    public PastebinPageWithPaste createNewPaste() {
        createNewPasteButton.click();
        return new PastebinPageWithPaste(driver);
    }

    private void scrollToElement(WebElement element) {
        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].scrollIntoView(true); window.scrollBy(0, -window.innerHeight / 4);", element);
    }
}
