package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PastebinPageWithPaste extends AbstractPage {

    private String syntaxHighlightingName = "//a[@class='btn -small h_800']";
    private String pageTitleName = "//div[@class='info-top']/child::h1";
    private String linesFromTextAreaForCode = "//div[@class='de1']";

    public PastebinPageWithPaste(WebDriver driver) {
        super(driver);
    }

    public String getSyntaxHighlighting() {
        waiter(syntaxHighlightingName);
        return driver.findElement(By.xpath(syntaxHighlightingName)).getText().trim();
    }

    public String getPageTitleName() {
        waiter(pageTitleName);
        return driver.findElement(By.xpath(pageTitleName)).getText().trim();
    }

    public String getCodeFromPaste() {
        waiter(linesFromTextAreaForCode);
        StringBuilder codeFromPaste = new StringBuilder();
        for (WebElement line : driver.findElements(By.xpath(linesFromTextAreaForCode))) {
            codeFromPaste.append(line.getText());
            codeFromPaste.append("\n");
        }
        return codeFromPaste.toString().trim();
    }

    @Override
    protected PastebinPageWithPaste openPage() {
        return this;
    }

    private void waiter(String xpath) {
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS)
                .until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(xpath)));
    }
}
