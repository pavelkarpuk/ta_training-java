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
    private static final String DROPDOWN_OPTION_OPERATING_SYSTEM = "//*[contains(@class,'clickable')]//*[contains(text(),'%s')]";

    private final By machineClassDropdown = By.xpath("//*[@placeholder='VM Class']");
    private static final String DROPDOWN_OPTION_MACHINE_CLASS = "//*[contains(@class,'clickable')]//*[contains(text(),'%s')]";

    private final By seriesDropdown = By.xpath("//*[@placeholder='Series']");
    private static final String DROPDOWN_OPTION_SERIES = "//*[contains(text(),'%s')]";

    private final By machineTypeDropdown = By.xpath("//*[@placeholder='Instance type']");
    private static final String DROPDOWN_OPTION_MACHINE_TYPE = "//*[contains(text(),'%s')]";

    private final By addGPUsButton = By.xpath("//*[@ng-model='listingCtrl.computeServer.addGPUs']//*[@class='md-container md-ink-ripple']");

    private final By gpuTypeDropdown = By.xpath("//*[contains(@class,'placeholder')]/*[@placeholder='GPU type']");
    private static final String DROPDOWN_OPTION_GPU_TYPE = "//*[contains(text(),'%s')]";

    private final By numberOfGPUDropdown = By.xpath("//*[@placeholder='Number of GPUs']");
    private static final String DROPDOWN_OPTION_NUMBER_OF_GPU = "//*[contains(@ng-disabled,'GPU')]/*[contains(text(),'%s')]";

    private final By localSSDDropdown = By.xpath("//*[contains(@ng-if,'Ssd')]//*[@placeholder='Local SSD']");
    private static final String DROPDOWN_OPTION_LOCAL_SSD = "//*[@ng-value='item.value']/child::div[contains(text(),'%s')]";

    private final By datacenterLocationDropdown = By.xpath("//*[@placeholder='Datacenter location'][contains(@ng-model,'computeServer.location')]");
    private static final String DROPDOWN_OPTION_DATACENTER_LOCATION = "//*[contains(@class,'clickable')]//*[contains(text(),'%s')]";

    private final By committedUsageDropdown = By.xpath("//*[@placeholder='Committed usage'][contains(@ng-model,'compute')]");
    private static final String DROPDOWN_OPTION_COMMITTED_USAGE = "//*[contains(@class,'clickable')]//*[contains(text(),'%s')]";

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
        By dropdownOption = By.xpath(String.format(DROPDOWN_OPTION_OPERATING_SYSTEM, calculator.getOperatingSystem()));
        waitForElementClickable(dropdownOption, driver);
        driver.findElement(dropdownOption).click();
        return this;
    }

    public GoogleCloudPlatformPricingCalculatorHome selectMachineClass(GoogleCloudPricingCalculator calculator) {
        driver.findElement(machineClassDropdown).click();
        By dropdownOption = By.xpath(String.format(DROPDOWN_OPTION_MACHINE_CLASS, calculator.getMachineClass()));
        waitForElementClickable(dropdownOption, driver);
        driver.findElement(dropdownOption).click();
        return this;
    }

    public GoogleCloudPlatformPricingCalculatorHome selectSeries(GoogleCloudPricingCalculator calculator) {
        driver.findElement(seriesDropdown).click();
        By dropdownOption = By.xpath(String.format(DROPDOWN_OPTION_SERIES, calculator.getSeries()));
        waitForElementClickable(dropdownOption, driver);
        driver.findElement(dropdownOption).click();
        return this;
    }

    public GoogleCloudPlatformPricingCalculatorHome selectMachineType(GoogleCloudPricingCalculator calculator) {
        driver.findElement(machineTypeDropdown).click();
        By dropdownOption = By.xpath(String.format(DROPDOWN_OPTION_MACHINE_TYPE, calculator.getMachineType()));
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
        By dropdownOption = By.xpath(String.format(DROPDOWN_OPTION_GPU_TYPE, calculator.getGpuType()));
        waitForElementClickable(dropdownOption, driver);
        driver.findElement(dropdownOption).click();
        return this;
    }

    public GoogleCloudPlatformPricingCalculatorHome selectNumberOfGPU(GoogleCloudPricingCalculator calculator) {
        driver.findElement(numberOfGPUDropdown).click();
        By dropdownOption = By.xpath(String.format(DROPDOWN_OPTION_NUMBER_OF_GPU, calculator.getNumberOfGPU()));
        waitForElementClickable(dropdownOption, driver);
        driver.findElement(dropdownOption).click();
        return this;
    }

    public GoogleCloudPlatformPricingCalculatorHome selectLocalSSD(GoogleCloudPricingCalculator calculator) {
        driver.findElement(localSSDDropdown).click();
        By dropdownOption = By.xpath(String.format(DROPDOWN_OPTION_LOCAL_SSD, calculator.getLocalSSD()));
        waitForElementClickable(dropdownOption, driver);
        driver.findElement(dropdownOption).click();
        return this;
    }

    public GoogleCloudPlatformPricingCalculatorHome selectDatacenterLocation(GoogleCloudPricingCalculator calculator) {
        driver.findElement(datacenterLocationDropdown).click();
        By dropdownOption = By.xpath(String.format(DROPDOWN_OPTION_DATACENTER_LOCATION, calculator.getDatacenterLocation()));
        waitForElementClickable(dropdownOption, driver);
        driver.findElement(dropdownOption).click();
        return this;
    }

    public GoogleCloudPlatformPricingCalculatorHome selectCommittedUsage(GoogleCloudPricingCalculator calculator) {
        driver.findElement(committedUsageDropdown).click();
        By dropdownOption = By.xpath(String.format(DROPDOWN_OPTION_COMMITTED_USAGE, calculator.getCommittedUsage()));
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
