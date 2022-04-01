package se.amanda.models;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTest {
    public static void main(String[] args)throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver  = new ChromeDriver();
        driver.get("https://biluppgifter.se/");

        Thread.sleep(3 * 1000);

        WebElement searchBox = driver.findElement(By.name("r"));

        searchBox.sendKeys("abc230");
        searchBox.submit();

        Thread.sleep(3 * 1000);

        WebElement carName = driver.findElement(By.className("card-title"));
        System.out.println(carName.getText());
        WebElement searchBtn = driver.findElement(By.id("modelregister-button"));
        searchBtn.click();

    }
}
