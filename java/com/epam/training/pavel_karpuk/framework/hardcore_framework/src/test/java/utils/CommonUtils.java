package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CommonUtils {

    private static final Duration WAIT_TIMEOUT_SECONDS = Duration.ofSeconds(10);

    public static void waitForElementLocated(By xpath, WebDriver driver) {
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS)
                .until(ExpectedConditions.presenceOfElementLocated(xpath));
    }

    public static void waitForElementClickable(By xpath, WebDriver driver) {
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS)
                .until(ExpectedConditions.elementToBeClickable(xpath));
    }

    public static void scrollToElementUp(By xpath, WebDriver driver) {
        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].scrollIntoView(false);", driver.findElement(xpath));
    }

    public static void scrollToElementDown(By xpath, WebDriver driver) {
        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].scrollIntoView(true); window.scrollBy(0, -window.innerHeight / 4);", driver.findElement(xpath));
    }

    public static String trimUnnecessaryTextFromTotalEstimatedCost(String cost) {
        String unnecessaryTextBeforeCost = "Total Estimated Cost: ";
        String unnecessaryTextAfterCost = " per 1 month";
        cost = cost.replace(unnecessaryTextBeforeCost, "");
        cost = cost.replace(unnecessaryTextAfterCost, "");
        return cost;
    }
}
