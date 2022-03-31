package Udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.sound.midi.Soundbank;


public class chromedriver {
    public static void main(String[] args) {

        // System Property for Chrome Driver
        System.setProperty("WebDriver.chrome.driver", "G:\\ChromeDriver\\chromedriver.exe");

        // Instantiate a ChromeDriver class.
        WebDriver driver = new ChromeDriver();

        // Launch Website
        driver.navigate().to("http://www.javatpoint.com/");

        //Maximize the browser
        driver.manage().window().maximize();

        //Scroll down the webpage by 5000 pixels
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("scrollBy(0, 5000)");

        //Get title
        String text = driver.getTitle();
        System.out.println("Title of page is: "+ text);

        //Verify Title


        // Click on the Search button
        driver.findElement(By.xpath("//img[@alt='java']")).click();
        driver.close();

    }

}
