package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.alertIsPresent;

public class Temp {
    public static void main(String[] args) {

        WebDriver webDriver;
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
        webDriver.navigate().to("https://www.google.com/");
        test();
        Actions actions = new Actions(webDriver);

        WebDriverWait wait = new WebDriverWait(webDriver,Duration.ofSeconds(5));
        Alert alert = wait.until(alertIsPresent());
        alert.accept();
        alert.dismiss();

    }

    @FindBy(xpath = "(//input[@name='btnK'])[2]")
    static WebElement webElement;


    public static void test() {
        String printAttribute = webElement.getAttribute("defaultValue");
        System.out.println(printAttribute);
        webElement.getText();
        webElement.getCssValue("setValue");


    }
}
