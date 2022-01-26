package test;

import model.GoogleCloudPricingCalculator;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.CloudGoogleHomePage;
import page.GoogleCloudPlatformPricingCalculatorHome;
import page.YopmailHomePage;
import page.YopmailPageWithRandomEmail;
import service.CalculatorCreator;

import static utils.TestUtils.openNewTab;
import static utils.TestUtils.switchBetweenTabs;

public class GoogleCloudPlatformPricingCalculatorTest extends BaseTest {

    @Test
    public void sameTotalEstimatedCostInCalculatorAndInEmailTest() {
        GoogleCloudPricingCalculator testCalculator = CalculatorCreator.calculatorFeatures();

        GoogleCloudPlatformPricingCalculatorHome calculator = new CloudGoogleHomePage(driver)
                .openPage()
                .searchForTerm(SEARCH_TERM)
                .selectSearchLink()
                .openPage()
                .goToChildFrame()
                .activateComputeEngineMode()
                .setNumberOfInstances(testCalculator)
                .selectOperatingSystem(testCalculator)
                .selectMachineClass(testCalculator)
                .selectSeries(testCalculator)
                .selectMachineType(testCalculator)
                .activateAddGPUs()
                .selectGPUType(testCalculator)
                .selectNumberOfGPU(testCalculator)
                .selectLocalSSD(testCalculator)
                .selectDatacenterLocation(testCalculator)
                .selectCommittedUsage(testCalculator)
                .addToEstimate()
                .selectEmailEstimate();

        String totalEstimatedCostInCalculator = calculator.getTotalEstimatedCost();

        openNewTab(driver);

        YopmailPageWithRandomEmail pageWithRandomEmail = new YopmailHomePage(driver)
                .openPage()
                .generateRandomEmailAddress();
        String emailAddress = pageWithRandomEmail.getEmailAddress();

        switchBetweenTabs(0, driver);

        calculator.goToChildFrame()
                .enterEmailAddress(emailAddress)
                .sendEmailWithEstimate();

        switchBetweenTabs(1, driver);

        String totalEstimatedCostInEmail = pageWithRandomEmail
                .checkEmail()
                .getEstimatedMonthlyCost();

        Assert.assertEquals(totalEstimatedCostInCalculator, totalEstimatedCostInEmail);
    }
}
