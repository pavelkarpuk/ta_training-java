package page;

import model.GoogleCloudPricingCalculator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.CommonUtils;

import static utils.CommonUtils.scrollToElementUp;
import static utils.CommonUtils.waitForElementClickable;
import static utils.CommonUtils.waitForElementLocated;

public class GoogleCloudPlatformPricingCalculatorHome extends AbstractPage {

    private final By frameFirst = By.xpath("//*[@id='cloud-site']/devsite-iframe/iframe");
    private final By frameSecond = By.xpath("//*[@id='myFrame']");

    private final By pageLoadingLocator = By.xpath("//*[@template='page']");

    private final By computeEngineButton = By.xpath("//div[@title='Compute Engine']/parent::div[contains(@class,'buttons')]");

    private final By numberOfInstancesInput = By.xpath("//*[contains(@ng-model,'quantity')]");

    private final By operatingSystemDropdown = By.xpath("//*[@ng-model='listingCtrl.computeServer.os']");

    private final By machineClassDropdown = By.xpath("//*[@placeholder='VM Class']");

    private final By seriesDropdown = By.xpath("//*[@placeholder='Series']");

    private final By machineTypeDropdown = By.xpath("//*[@placeholder='Instance type']");

    private final By addGPUsButton = By.xpath("//*[@ng-model='listingCtrl.computeServer.addGPUs']//*[@class='md-container md-ink-ripple']");

    private final By gpuTypeDropdown = By.xpath("//*[contains(@class,'placeholder')]/*[@placeholder='GPU type']");

    private final By numberOfGPUDropdown = By.xpath("//*[@placeholder='Number of GPUs']");

    private final By localSSDDropdown = By.xpath("//*[contains(@ng-if,'Ssd')]//*[@placeholder='Local SSD']");

    private final By datacenterLocationDropdown = By.xpath("//*[@placeholder='Datacenter location'][contains(@ng-model,'computeServer.location')]");

    private final By committedUsageDropdown = By.xpath("//*[@placeholder='Committed usage'][contains(@ng-model,'compute')]");

    private final By addToEstimateButton = By.xpath("//*[@aria-label='Add to Estimate'][contains(@ng-click,'Compute')]");

    private final By emailEstimateButton = By.xpath("//button[@aria-label='Email Estimate']");

    private final By emailInput = By.xpath("//*[@type='email']");

    private final By sendEmailButton = By.xpath("//*[@aria-label='Send Email']");

    private final By totalEstimatedCost = By.xpath("//*[contains(text(),'Total Estimated Cost')]");

    public GoogleCloudPlatformPricingCalculatorHome(WebDriver driver) {
        super(driver);
    }

    @Override
    public GoogleCloudPlatformPricingCalculatorHome openPage() {
        waitForElementLocated(pageLoadingLocator, driver);
        return this;
    }

    public String getURL() {
        return driver.getCurrentUrl();
    }

    public GoogleCloudPlatformPricingCalculatorHome goToChildFrame() {
        driver.switchTo().frame(driver.findElement(frameFirst));
        driver.switchTo().frame(driver.findElement(frameSecond));
        return this;
    }

    public GoogleCloudPlatformPricingCalculatorHome activateComputeEngineMode() {
        driver.findElement(computeEngineButton).click();
        return this;
    }

    public GoogleCloudPlatformPricingCalculatorHome setNumberOfInstances(GoogleCloudPricingCalculator calculator) {
        driver.findElement(numberOfInstancesInput).sendKeys(calculator.getNumberOfInstances());
        return this;
    }

    public GoogleCloudPlatformPricingCalculatorHome selectOperatingSystem(GoogleCloudPricingCalculator calculator) {
        driver.findElement(operatingSystemDropdown).click();
        By dropdownOption = By.xpath("//*[contains(@class,'clickable')]//*[contains(text(),'" + calculator.getOperatingSystem() + "')]");
        waitForElementClickable(dropdownOption, driver);
        driver.findElement(dropdownOption).click();
        return this;
    }

    public GoogleCloudPlatformPricingCalculatorHome selectMachineClass(GoogleCloudPricingCalculator calculator) {
        driver.findElement(machineClassDropdown).click();
        By dropdownOption = By.xpath("//*[contains(@class,'clickable')]//*[contains(text(),'" + calculator.getMachineClass() + "')]");
        waitForElementClickable(dropdownOption, driver);
        driver.findElement(dropdownOption).click();
        return this;
    }

    public GoogleCloudPlatformPricingCalculatorHome selectSeries(GoogleCloudPricingCalculator calculator) {
        driver.findElement(seriesDropdown).click();
        By dropdownOption = By.xpath("//*[contains(text(),'" + calculator.getSeries() + "')]");
        waitForElementClickable(dropdownOption, driver);
        driver.findElement(dropdownOption).click();
        return this;
    }

    public GoogleCloudPlatformPricingCalculatorHome selectMachineType(GoogleCloudPricingCalculator calculator) {
        driver.findElement(machineTypeDropdown).click();
        By dropdownOption = By.xpath("//*[contains(text(),'" + calculator.getMachineType() + "')]");
        waitForElementClickable(dropdownOption, driver);
        driver.findElement(dropdownOption).click();
        return this;
    }

    public GoogleCloudPlatformPricingCalculatorHome activateAddGPUs() {
        driver.findElement(addGPUsButton).click();
        return this;
    }

    public GoogleCloudPlatformPricingCalculatorHome selectGPUType(GoogleCloudPricingCalculator calculator) {
        driver.findElement(gpuTypeDropdown).click();
        By dropdownOption = By.xpath("//*[contains(text(),'" + calculator.getGpuType() + "')]");
        waitForElementClickable(dropdownOption, driver);
        driver.findElement(dropdownOption).click();
        return this;
    }

    public GoogleCloudPlatformPricingCalculatorHome selectNumberOfGPU(GoogleCloudPricingCalculator calculator) {
        driver.findElement(numberOfGPUDropdown).click();
        By dropdownOption = By.xpath("//*[contains(@ng-disabled,'GPU')]/*[contains(text(),'" + calculator.getNumberOfGPU() + "')]");
        waitForElementClickable(dropdownOption, driver);
        driver.findElement(dropdownOption).click();
        return this;
    }

    public GoogleCloudPlatformPricingCalculatorHome selectLocalSSD(GoogleCloudPricingCalculator calculator) {
        driver.findElement(localSSDDropdown).click();
        By dropdownOption = By.xpath("//*[@ng-value='item.value']/child::div[contains(text(),'" + calculator.getLocalSSD() + "')]");
        waitForElementClickable(dropdownOption, driver);
        driver.findElement(dropdownOption).click();
        return this;
    }

    public GoogleCloudPlatformPricingCalculatorHome selectDatacenterLocation(GoogleCloudPricingCalculator calculator) {
        driver.findElement(datacenterLocationDropdown).click();
        By dropdownOption = By.xpath("//*[contains(@class,'clickable')]//*[contains(text(),'" + calculator.getDatacenterLocation() + "')]");
        waitForElementClickable(dropdownOption, driver);
        driver.findElement(dropdownOption).click();
        return this;
    }

    public GoogleCloudPlatformPricingCalculatorHome selectCommittedUsage(GoogleCloudPricingCalculator calculator) {
        driver.findElement(committedUsageDropdown).click();
        By dropdownOption = By.xpath("//*[contains(@class,'clickable')]//*[contains(text(),'" + calculator.getCommittedUsage() + "')]");
        waitForElementClickable(dropdownOption, driver);
        driver.findElement(dropdownOption).click();
        return this;
    }

    public GoogleCloudPlatformPricingCalculatorHome addToEstimate() {
        driver.findElement(addToEstimateButton).click();
        return this;
    }

    public GoogleCloudPlatformPricingCalculatorHome selectEmailEstimate() {
        waitForElementClickable(emailEstimateButton, driver);
        driver.findElement(emailEstimateButton).click();
        return this;
    }

    public GoogleCloudPlatformPricingCalculatorHome enterEmailAddress(String emailAddress) {
        driver.findElement(emailInput).sendKeys(emailAddress);
        return this;
    }

    public GoogleCloudPlatformPricingCalculatorHome sendEmailWithEstimate() {
        scrollToElementUp(sendEmailButton, driver);
        waitForElementClickable(sendEmailButton, driver);
        driver.findElement(sendEmailButton).click();
        return this;
    }

    public String getTotalEstimatedCost() {
        scrollToElementUp(totalEstimatedCost, driver);
        waitForElementLocated(totalEstimatedCost, driver);
        return CommonUtils.trimUnnecessaryTextFromTotalEstimatedCost(driver.findElement((totalEstimatedCost)).getText());
    }
}
