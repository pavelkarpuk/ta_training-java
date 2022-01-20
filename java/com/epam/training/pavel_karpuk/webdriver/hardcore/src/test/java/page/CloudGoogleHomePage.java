package page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CloudGoogleHomePage extends AbstractPage {

    private final String HOMEPAGE_URL = "https://cloud.google.com/";

    @FindBy(xpath = "//form[@class='devsite-search-form']")
    private WebElement searchButton;

    private String searchInput = "//input[@aria-label='Search']";

    public CloudGoogleHomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public CloudGoogleHomePage openPage() {
        driver.get(HOMEPAGE_URL);
        return this;
    }

    public CloudGoogleSearchPage searchForTerm(String searchTerm) {
        searchButton.click();
        driver.findElement(By.xpath(searchInput)).sendKeys(searchTerm + Keys.ENTER);
        return new CloudGoogleSearchPage(driver);
    }
}
