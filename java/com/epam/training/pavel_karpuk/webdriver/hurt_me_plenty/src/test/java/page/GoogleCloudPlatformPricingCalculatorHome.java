package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.CommonUtils;

public class GoogleCloudPlatformPricingCalculatorHome extends AbstractPage {

    private String frameFirst = "//*[@id='cloud-site']/devsite-iframe/iframe";
    private String frameSecond = "//*[@id='myFrame']";

    private String loadingPageLocator = "//*[@template='page']";

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

    private String vmClassInEstimate = "//*[contains(text(),'VM class:')]";
    private String instanceTypeInEstimate = "//*[contains(text(),'Instance type:')]";
    private String unnecessaryTextFromChildNodeInstanceType = "//*[contains(text(),'Instance type:')]//*[contains(text(),'Discount')]";
    private String regionInEstimate = "//*[contains(text(),'Region:')]";
    private String localSSDInEstimate = "//*[contains(text(),'Local SSD:')]";
    private String unnecessaryTextFromChildNodeLocalSSD = "//*[contains(text(),'Local SSD:')]//*[contains(text(),'Discount')]";
    private String commitmentTermInEstimate = "//*[contains(text(),'Commitment term:')]";

    public GoogleCloudPlatformPricingCalculatorHome(WebDriver driver) {
        super(driver);
    }

    public GoogleCloudPlatformPricingCalculatorHome activateComputeEngineMode() {
        CommonUtils.waitForElementLocated(loadingPageLocator, driver);
        goToChildFrame();
        driver.findElement(By.xpath(computeEngineButton)).click();
        return this;
    }

    public GoogleCloudPlatformPricingCalculatorHome setNumberOfInstances(String numberOfInstances) {
        driver.findElement(By.xpath(numberOfInstancesInput)).sendKeys(numberOfInstances);
        return this;
    }

    public GoogleCloudPlatformPricingCalculatorHome selectOperatingSystem() {
        driver.findElement(By.xpath(operatingSystemDropdown)).click();
        CommonUtils.waitForElementClickable(selectFreeOperatingSystem, driver);
        driver.findElement(By.xpath(selectFreeOperatingSystem)).click();
        return this;
    }

    public GoogleCloudPlatformPricingCalculatorHome selectMachineClass() {
        driver.findElement(By.xpath(machineClassDropdown)).click();
        CommonUtils.waitForElementClickable(selectRegularMachineClass, driver);
        driver.findElement(By.xpath(selectRegularMachineClass)).click();
        return this;
    }

    public GoogleCloudPlatformPricingCalculatorHome selectSeries() {
        driver.findElement(By.xpath(seriesDropdown)).click();
        CommonUtils.waitForElementClickable(selectN1Series, driver);
        driver.findElement(By.xpath(selectN1Series)).click();
        return this;
    }

    public GoogleCloudPlatformPricingCalculatorHome selectMachineType() {
        driver.findElement(By.xpath(machineTypeDropdown)).click();
        CommonUtils.waitForElementClickable(selectStandard8MachineType, driver);
        driver.findElement(By.xpath(selectStandard8MachineType)).click();
        return this;
    }

    public GoogleCloudPlatformPricingCalculatorHome activateAddGPUs() {
        driver.findElement(By.xpath(addGPUsButton)).click();
        return this;
    }

    public GoogleCloudPlatformPricingCalculatorHome selectGPUType() {
        driver.findElement(By.xpath(gpuTypeDropdown)).click();
        CommonUtils.waitForElementClickable(selectTeslaV100GPUType, driver);
        driver.findElement(By.xpath(selectTeslaV100GPUType)).click();
        return this;
    }

    public GoogleCloudPlatformPricingCalculatorHome selectNumberOfGPU() {
        driver.findElement(By.xpath(numberOfGPUDropdown)).click();
        CommonUtils.waitForElementClickable(select1NumberOfGPU, driver);
        driver.findElement(By.xpath(select1NumberOfGPU)).click();
        return this;
    }

    public GoogleCloudPlatformPricingCalculatorHome selectLocalSSD() {
        driver.findElement(By.xpath(localSSDDropdown)).click();
        CommonUtils.waitForElementClickable(select2x375GbLocalSSD, driver);
        driver.findElement(By.xpath(select2x375GbLocalSSD)).click();
        return this;
    }

    public GoogleCloudPlatformPricingCalculatorHome selectDatacenterLocation() {
        driver.findElement(By.xpath(datacenterLocationDropdown)).click();
        CommonUtils.waitForElementClickable(selectFrankfurtLocation, driver);
        driver.findElement(By.xpath(selectFrankfurtLocation)).click();
        return this;
    }

    public GoogleCloudPlatformPricingCalculatorHome selectCommittedUsage() {
        driver.findElement(By.xpath(committedUsageDropdown)).click();
        CommonUtils.waitForElementClickable(select1YearCommittedUsage, driver);
        driver.findElement(By.xpath(select1YearCommittedUsage)).click();
        return this;
    }

    public GoogleCloudPlatformPricingCalculatorHome addToEstimate() {
        driver.findElement(By.xpath(addToEstimateButton)).click();
        return this;
    }

    public String getVMClass() {
        CommonUtils.waitForElementLocated(vmClassInEstimate, driver);
        return driver.findElement(By.xpath(vmClassInEstimate)).getText().trim();
    }

    public String getInstanceType() {
        CommonUtils.waitForElementLocated(instanceTypeInEstimate, driver);
        String text = driver.findElement(By.xpath(instanceTypeInEstimate)).getText();
        String unnecessaryText = driver.findElement(By.xpath(unnecessaryTextFromChildNodeInstanceType)).getText();
        return text.replace(unnecessaryText, "").trim();
    }

    public String getRegion() {
        CommonUtils.waitForElementLocated(regionInEstimate, driver);
        return driver.findElement(By.xpath(regionInEstimate)).getText().trim();
    }

    public String getLocalSSD() {
        CommonUtils.waitForElementLocated(localSSDInEstimate, driver);
        String text = driver.findElement(By.xpath(localSSDInEstimate)).getText();
        String unnecessaryText = driver.findElement(By.xpath(unnecessaryTextFromChildNodeLocalSSD)).getText();
        return text.replace(unnecessaryText, "").trim();
    }

    public String getCommitmentTerm() {
        CommonUtils.waitForElementLocated(commitmentTermInEstimate, driver);
        return driver.findElement(By.xpath(commitmentTermInEstimate)).getText().trim();
    }

    private void goToChildFrame() {
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath(frameFirst)));
        driver.switchTo().frame(driver.findElement(By.xpath(frameSecond)));
    }

    @Override
    public GoogleCloudPlatformPricingCalculatorHome openPage() {
        return this;
    }
}
