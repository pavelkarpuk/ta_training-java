package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.CloudGoogleHomePage;
import page.GoogleCloudPlatformPricingCalculatorHome;

public class HurtMePlentyTest {

    private WebDriver driver;

    @BeforeMethod(alwaysRun = true)
    public void browserSetup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void hurtMePlentyTest() {
        String expectedVMClass = "VM class: regular";
        String expectedInstanceType = "Instance type: n1-standard-8";
        String expectedRegion = "Region: Frankfurt";
        String expectedLocalSSD = "Local SSD: 2x375 GiB";
        String expectedCommitmentTerm = "Commitment term: 1 Year";

        String searchTerm = "Google Cloud Platform Pricing Calculator";
        String numberOfInstances = "4";

        GoogleCloudPlatformPricingCalculatorHome calculator = new CloudGoogleHomePage(driver)
                .openPage()
                .searchForTerm(searchTerm)
                .selectSearchLink()
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
                .addToEstimate();

        Assert.assertEquals(calculator.getVMClass(), expectedVMClass);
        Assert.assertEquals(calculator.getInstanceType(), expectedInstanceType);
        Assert.assertEquals(calculator.getRegion(), expectedRegion);
        Assert.assertEquals(calculator.getLocalSSD(), expectedLocalSSD);
        Assert.assertEquals(calculator.getCommitmentTerm(), expectedCommitmentTerm);
    }

    @AfterMethod(alwaysRun = true)
    public void browserTearDown() {
        driver.quit();
        driver = null;
    }
}
