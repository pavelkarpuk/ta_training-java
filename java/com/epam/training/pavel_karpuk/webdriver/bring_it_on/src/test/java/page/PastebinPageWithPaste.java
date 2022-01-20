package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.CommonUtils;

public class PastebinPageWithPaste extends AbstractPage {

    private String syntaxHighlightingName = "//a[@class='btn -small h_800']";
    private String pageTitleName = "//div[@class='info-top']/child::h1";
    private String linesFromTextAreaForCode = "//div[@class='de1']";

    public PastebinPageWithPaste(WebDriver driver) {
        super(driver);
    }

    public String getSyntaxHighlighting() {
        CommonUtils.waitForElementLocated(syntaxHighlightingName, driver);
        return driver.findElement(By.xpath(syntaxHighlightingName)).getText().trim();
    }

    public String getPageTitleName() {
        CommonUtils.waitForElementLocated(pageTitleName, driver);
        return driver.findElement(By.xpath(pageTitleName)).getText().trim();
    }

    public String getCodeFromPaste() {
        CommonUtils.waitForElementLocated(linesFromTextAreaForCode, driver);
        StringBuilder codeFromPaste = new StringBuilder();
        for (WebElement line : driver.findElements(By.xpath(linesFromTextAreaForCode))) {
            codeFromPaste.append(line.getText());
            codeFromPaste.append("\n");
        }
        return codeFromPaste.toString().trim();
    }

    @Override
    public PastebinPageWithPaste openPage() {
        return this;
    }
}
