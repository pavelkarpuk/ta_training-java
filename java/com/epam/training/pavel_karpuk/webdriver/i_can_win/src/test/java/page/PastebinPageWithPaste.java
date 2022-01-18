package page;

import org.openqa.selenium.WebDriver;

public class PastebinPageWithPaste extends AbstractPage {

    public PastebinPageWithPaste(WebDriver driver) {
        super(driver);
    }

    @Override
    public PastebinPageWithPaste openPage() {
        return this;
    }
}
