import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BaseTest {
    // TEMA : cu ce metode vine webDriver in Java cu Selenium;

    // @Test
    public void goToWebsite() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.demoblaze.com/");
        /*
      DOM = XPath = //a[@id='signin2']
         */
    }

    @Test
    public void signInTest() throws InterruptedException {
        // a = Arrange
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.demoblaze.com/");
        driver.manage().window().maximize();

        // a = Act
        driver.findElement(By.xpath("//a[@id='signin2']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='sign-username']")).sendKeys("BobitaAOxutu");
        driver.findElement(By.xpath("//input[@id='sign-password']")).sendKeys("gamerulnervos");
        driver.findElement(By.xpath("//button[@onclick='register()']")).click();
        Thread.sleep(2000);

        // a = Assert
        String expectedMassage = "Sign up successful.";
        String actualMassage = driver.switchTo().alert().getText();
        Assert.assertEquals(expectedMassage, actualMassage);
        driver.switchTo().alert().accept();

    }

    @Test
    public void logInTest() throws InterruptedException {
        // a = Arrange
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.demoblaze.com/");
        driver.manage().window().maximize();

        // a = Act
        driver.findElement(By.xpath("//a[@id='login2']")).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath("//input[@id='loginusername']")).sendKeys("BobitaAOxutu");
        driver.findElement(By.xpath("//input[@id='loginpassword']")).sendKeys("gamerulnervos");
        driver.findElement(By.xpath("//button[@onclick='logIn()']")).click();

        // a = Assert
        String actualMassage = driver.findElement(By.cssSelector("#nameofuser")).getText();
        //String actualMassage1 = driver.findElement(By.xpath("//a[@id='nameofuser']")).getText();
          System.out.println(actualMassage);
        String expectedMassage = "Welcome BobitaAOxutu";
        Assert.assertEquals(expectedMassage, actualMassage);


    }



    /*
    Tema: WebDriver Methods
1. get() To enter the url

2 getTitle() To get the title of current web page

3 getCurrentUrl() To get the url of current web page

4 getPageSource() To get the page source of current web page

5 findElement() To get single webElements

6 findElements() To get multiple webElements

7 getWindowHandle() To get the id of parent window

8 getWindowHandles() To get the id of All windows

9 switchTo() Used to switch one window to other window

10 manage()
 a. Window
 b. Cookies

11 navigate()
 a. Enter the URL
 b. Navigate to previous page
 c. Navigate to next page
 d. Refresh current web page

12 close() To close the current/parent browser

13 quit() To close all the browsers opened by selenium

NAVIGATION COMMANDS:
1. Navigate().to()

2. Refresh()

3. Back()

4. Forword()/ ( Forward() ? )

     */

}
