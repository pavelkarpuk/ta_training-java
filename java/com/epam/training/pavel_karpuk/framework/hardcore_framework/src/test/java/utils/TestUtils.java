package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;

import java.util.ArrayList;

public class TestUtils {

    public static void openNewTab(WebDriver driver) {
        driver.switchTo().newWindow(WindowType.TAB);
    }

    public static void switchBetweenTabs(int tabNumber, WebDriver driver) {
        driver.switchTo().window(new ArrayList<>(driver.getWindowHandles()).get(tabNumber));
    }
}
