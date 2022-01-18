package page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleCloudPlatformPricingCalculatorHome extends AbstractPage {

    private String frameFirst = "//*[@id='cloud-site']/devsite-iframe/iframe";
    private String frameSecond = "//*[@id='myFrame']";

    private String computeEngineButton = "//div[@title='Compute Engine']/parent::div[contains(@class,'buttons')]";

    private String numberOfInstancesInput = "//*[contains(@ng-model,'quantity')]";

    private String operatingSystemDropdown = "//*[@ng-model='listingCtrl.computeServer.os']";
    private String selectFreeOperatingSystem = "//*[contains(@class,'clickable')]//*[@value='free']";

    private String machineClassDropdown = "//*[@placeholder='VM Class']";
    private String selectRegularMachineClass = "//*[contains(@class,'clickable')]//*[@value='regular']";

    private String seriesDropdown = "//*[@placeholder='Series']";
    private String selectN1Series = "//*[contains(text(),'N1')]";

    private String machineTypeDropdown = "//*[@placeholder='Instance type']";
    private String selectStandard8MachineType = "//*[contains(text(),'n1-standard-8 (vCPUs: 8, RAM: 30GB)')]";

    private String addGPUsButton = "//*[@ng-model='listingCtrl.computeServer.addGPUs']//*[@class='md-container md-ink-ripple']";

    private String gpuTypeDropdown = "//*[contains(@class,'placeholder')]/*[@placeholder='GPU type']";
    private String selectTeslaV100GPUType = "//*[contains(text(),'NVIDIA Tesla V100')]";

    private String numberOfGPUDropdown = "//*[@placeholder='Number of GPUs']";
    private String select1NumberOfGPU = "//*[contains(@ng-disabled,'GPU')]/*[contains(text(),'1')]";

    private String localSSDDropdown = "//*[contains(@ng-if,'Ssd')]//*[@placeholder='Local SSD']";
    private String select2x375GbLocalSSD = "//*[contains(text(),'2x375 GB')]";

    private String datacenterLocationDropdown = "//*[@placeholder='Datacenter location'][contains(@ng-model,'computeServer.location')]";
    private String selectFrankfurtLocation = "//*[contains(@class,'clickable')]//*[contains(text(),'Frankfurt (europe-west3)')]";

    private String committedUsageDropdown = "//*[@placeholder='Committed usage'][contains(@ng-model,'compute')]";
    private String select1YearCommittedUsage = "//*[contains(@class,'clickable')]//*[contains(text(),'1 Year')]";

    private String addToEstimateButton = "//*[@aria-label='Add to Estimate'][contains(@ng-click,'Compute')]";

    private String emailEstimateButton = "//button[@aria-label='Email Estimate']";

    private String emailInput = "//*[@type='email']";

    private String sendEmailButton = "//*[@aria-label='Send Email']";

    private String totalEstimatedCost = "//*[contains(text(),'Total Estimated Cost')]";

    public GoogleCloudPlatformPricingCalculatorHome(WebDriver driver) {
        super(driver);
    }

    @Override
    public GoogleCloudPlatformPricingCalculatorHome openPage() {
        waiterElementLocated("//*[@template='page']");
        return this;
    }

    public GoogleCloudPlatformPricingCalculatorHome goToChildFrame() {
        driver.switchTo().frame(driver.findElement(By.xpath(frameFirst)));
        driver.switchTo().frame(driver.findElement(By.xpath(frameSecond)));
        return this;
    }

    public GoogleCloudPlatformPricingCalculatorHome activateComputeEngineMode() {
        driver.findElement(By.xpath(computeEngineButton)).click();
        return this;
    }

    public GoogleCloudPlatformPricingCalculatorHome setNumberOfInstances(String numberOfInstances) {
        driver.findElement(By.xpath(numberOfInstancesInput)).sendKeys(numberOfInstances);
        return this;
    }

    public GoogleCloudPlatformPricingCalculatorHome selectOperatingSystem() {
        driver.findElement(By.xpath(operatingSystemDropdown)).click();
        waiterElementClickable(selectFreeOperatingSystem);
        driver.findElement(By.xpath(selectFreeOperatingSystem)).click();
        return this;
    }

    public GoogleCloudPlatformPricingCalculatorHome selectMachineClass() {
        driver.findElement(By.xpath(machineClassDropdown)).click();
        waiterElementClickable(selectRegularMachineClass);
        driver.findElement(By.xpath(selectRegularMachineClass)).click();
        return this;
    }

    public GoogleCloudPlatformPricingCalculatorHome selectSeries() {
        driver.findElement(By.xpath(seriesDropdown)).click();
        waiterElementClickable(selectN1Series);
        driver.findElement(By.xpath(selectN1Series)).click();
        return this;
    }

    public GoogleCloudPlatformPricingCalculatorHome selectMachineType() {
        driver.findElement(By.xpath(machineTypeDropdown)).click();
        waiterElementClickable(selectStandard8MachineType);
        driver.findElement(By.xpath(selectStandard8MachineType)).click();
        return this;
    }

    public GoogleCloudPlatformPricingCalculatorHome activateAddGPUs() {
        driver.findElement(By.xpath(addGPUsButton)).click();
        return this;
    }

    public GoogleCloudPlatformPricingCalculatorHome selectGPUType() {
        driver.findElement(By.xpath(gpuTypeDropdown)).click();
        waiterElementClickable(selectTeslaV100GPUType);
        driver.findElement(By.xpath(selectTeslaV100GPUType)).click();
        return this;
    }

    public GoogleCloudPlatformPricingCalculatorHome selectNumberOfGPU() {
        driver.findElement(By.xpath(numberOfGPUDropdown)).click();
        waiterElementClickable(select1NumberOfGPU);
        driver.findElement(By.xpath(select1NumberOfGPU)).click();
        return this;
    }

    public GoogleCloudPlatformPricingCalculatorHome selectLocalSSD() {
        driver.findElement(By.xpath(localSSDDropdown)).click();
        waiterElementClickable(select2x375GbLocalSSD);
        driver.findElement(By.xpath(select2x375GbLocalSSD)).click();
        return this;
    }

    public GoogleCloudPlatformPricingCalculatorHome selectDatacenterLocation() {
        driver.findElement(By.xpath(datacenterLocationDropdown)).click();
        waiterElementClickable(selectFrankfurtLocation);
        driver.findElement(By.xpath(selectFrankfurtLocation)).click();
        return this;
    }

    public GoogleCloudPlatformPricingCalculatorHome selectCommittedUsage() {
        driver.findElement(By.xpath(committedUsageDropdown)).click();
        waiterElementClickable(select1YearCommittedUsage);
        driver.findElement(By.xpath(select1YearCommittedUsage)).click();
        return this;
    }

    public GoogleCloudPlatformPricingCalculatorHome addToEstimate() {
        driver.findElement(By.xpath(addToEstimateButton)).click();
        return this;
    }

    public GoogleCloudPlatformPricingCalculatorHome selectEmailEstimate() {
        waiterElementClickable(emailEstimateButton);
        driver.findElement(By.xpath(emailEstimateButton)).click();
        return this;
    }

    public GoogleCloudPlatformPricingCalculatorHome enterEmailAddress(String emailAddress) {
        driver.findElement(By.xpath(emailInput)).sendKeys(emailAddress);
        return this;
    }

    public GoogleCloudPlatformPricingCalculatorHome sendEmailWithEstimate() {
        scrollToElement(sendEmailButton);
        waiterElementClickable(sendEmailButton);
        driver.findElement(By.xpath(sendEmailButton)).click();
        return this;
    }

    public String getTotalEstimatedCost() {
        scrollToElement(totalEstimatedCost);
        waiterElementLocated(totalEstimatedCost);
        return trimUnnecessaryTextFromTotalEstimatedCost(driver.findElement((By.xpath(totalEstimatedCost))).getText());
    }

    private String trimUnnecessaryTextFromTotalEstimatedCost(String cost) {
        String unnecessaryTextBeforeCost = "Total Estimated Cost: ";
        String unnecessaryTextAfterCost = " per 1 month";
        cost = cost.replace(unnecessaryTextBeforeCost, "");
        cost = cost.replace(unnecessaryTextAfterCost, "");
        return cost;
    }

    private void waiterElementClickable(String xpath) {
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS)
                .until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
    }

    private void waiterElementLocated(String xpath) {
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
    }

    private void scrollToElement(String xpath) {
        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].scrollIntoView(false);", driver.findElement(By.xpath(xpath)));
    }
}
