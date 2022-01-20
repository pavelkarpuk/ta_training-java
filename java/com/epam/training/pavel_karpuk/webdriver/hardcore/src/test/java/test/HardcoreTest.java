package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.CloudGoogleHomePage;
import page.GoogleCloudPlatformPricingCalculatorHome;
import page.YopmailHomePage;
import page.YopmailPageWithRandomEmail;

import java.util.ArrayList;

public class HardcoreTest {

    private WebDriver driver;

    @BeforeMethod(alwaysRun = true)
    public void browserSetup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void hardcoreTest() {
        String searchTerm = "Google Cloud Platform Pricing Calculator";
        String numberOfInstances = "4";

        GoogleCloudPlatformPricingCalculatorHome calculator = new CloudGoogleHomePage(driver)
                .openPage()
                .searchForTerm(searchTerm)
                .selectSearchLink()
                .openPage()
                .goToChildFrame()
                .activateComputeEngineMode()
                .setNumberOfInstances(numberOfInstances)
                .selectOperatingSystem()
                .selectMachineClass()
                .selectSeries()
                .selectMachineType()
                .activateAddGPUs()
                .selectGPUType()
                .selectNumberOfGPU()
                .selectLocalSSD()
                .selectDatacenterLocation()
                .selectCommittedUsage()
                .addToEstimate()
                .selectEmailEstimate();

        String totalEstimatedCostInCalculator = calculator.getTotalEstimatedCost();

        openNewTab();

        YopmailPageWithRandomEmail pageWithRandomEmail = new YopmailHomePage(driver)
                .openPage()
                .generateRandomEmailAddress();
        String emailAddress = pageWithRandomEmail.getEmailAddress();

        switchBetweenTabs(0);

        calculator.goToChildFrame()
                .enterEmailAddress(emailAddress)
                .sendEmailWithEstimate();

        switchBetweenTabs(1);

        String totalEstimatedCostInEmail = pageWithRandomEmail
                .checkEmail()
                .getEstimatedMonthlyCost();

        Assert.assertEquals(totalEstimatedCostInCalculator, totalEstimatedCostInEmail);
    }

    @AfterMethod(alwaysRun = true)
    public void browserTearDown() {
        driver.quit();
        driver = null;
    }

    private void openNewTab() {
        driver.switchTo().newWindow(WindowType.TAB);
    }

    private void switchBetweenTabs(int tabNumber) {
        driver.switchTo().window(new ArrayList<>(driver.getWindowHandles()).get(tabNumber));
    }
}
