import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class RohitShatty_SignUp {
    public static void main(String[] args) {

        
        WebDriverManager.chromedriver().setup();

  
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--window-size=1920,1080");
        options.addArguments("--disable-gpu");

        WebDriver driver = new ChromeDriver(options);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        try {
          
            driver.get("https://rahulshettyacademy.com/locatorspractice/");
            System.out.println("Website khul gayi: " + driver.getTitle());

            //Enter Username
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("inputUsername")))
                .sendKeys("Alice");
            System.out.println("Username enter kiya");

            // Enter Password 
            driver.findElement(By.name("inputPassword")).sendKeys("123456");
            System.out.println("Password enter kiya");

            // Forgot password link click 
            driver.findElement(By.linkText("Forgot your password?")).click();
            System.out.println("Forgot password click kiya");

            // New form filling
            wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//input[@type='text']")))
                .sendKeys("BOB");
            System.out.println("Name enter kiya");

            // Enter Email
            driver.findElement(By.xpath("//input[@placeholder='Email']"))
                .sendKeys("vipin@gmail.com");
            System.out.println("Email enter kiya");

            // Enter Phone number 
            driver.findElement(By.xpath("//input[@placeholder='Phone Number']"))
                .sendKeys("63500");
            System.out.println("Phone enter kiya");

            System.out.println("=== TEST PASS - Sab fields bhar diye! ===");

        } catch (Exception e) {
            System.out.println("=== TEST FAIL: " + e.getMessage() + " ===");
            System.exit(1);

        } finally {
            driver.quit();
            System.out.println("Browser band kar diya");
        }
    }
}
