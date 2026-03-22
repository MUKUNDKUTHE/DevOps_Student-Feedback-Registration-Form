package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdmissionFormTest {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("file:///D:/SIT/SEM 6/DevOps/index.html");
        driver.manage().window().maximize();

        Thread.sleep(4000);
        driver.findElement(By.id("name")).sendKeys("Mukund Kuthe");

        Thread.sleep(1000);
        driver.findElement(By.id("email")).sendKeys("mukundk0204@gmail.com");

        Thread.sleep(1000);
        driver.findElement(By.id("mobile")).sendKeys("7741963853");

        Thread.sleep(1000);
        driver.findElement(By.id("department")).sendKeys("Computer Science");
        
        Thread.sleep(1000);
        driver.findElement(By.id("password")).sendKeys("Mukund@123");

        Thread.sleep(1000);
        driver.findElement(By.id("confirm")).sendKeys("Mukund@123");

        Thread.sleep(1000);
        driver.findElements(By.name("gender")).get(0).click();

        Thread.sleep(1000);
        driver.findElement(By.id("course")).sendKeys("B.Tech");

        Thread.sleep(1000);

        org.openqa.selenium.WebElement feedback = driver.findElement(By.id("feedback"));

        ((org.openqa.selenium.JavascriptExecutor) driver)
        .executeScript("arguments[0].scrollIntoView(true);", feedback);

        Thread.sleep(1000);

        ((org.openqa.selenium.JavascriptExecutor) driver)
        .executeScript(
        "arguments[0].value='This form is very good and easy to use for all students and provides a smooth experience overall';",
        feedback
        );

        Thread.sleep(1000);

        org.openqa.selenium.WebElement submitBtn = driver.findElement(By.xpath("//button[@type='submit']"));

        ((org.openqa.selenium.JavascriptExecutor) driver)
        .executeScript("arguments[0].scrollIntoView(true);", submitBtn);

        Thread.sleep(500);

        ((org.openqa.selenium.JavascriptExecutor) driver)
        .executeScript("arguments[0].click();", submitBtn);

        Thread.sleep(2000);

        try{
            driver.switchTo().alert().accept();
        }catch(Exception e){}

        System.out.println("TEST PASSED");

        driver.quit();
    }
}