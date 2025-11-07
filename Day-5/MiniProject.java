import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MiniProject {
    public static void main(String[] args) throws InterruptedException {
        // --- String Analysis ---
        String input = "Selenium Automation";
        int length = input.length();
        String reversed = new StringBuilder(input).reverse().toString();

        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversed);
        System.out.println("Length: " + length);

        // --- Selenium Form Fill ---
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AjaySomepalli\\Downloads\\Selenium\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://practicetestautomation.com/practice-test-login/");
        Thread.sleep(2000);

        driver.findElement(By.id("username")).sendKeys("student");
        driver.findElement(By.id("password")).sendKeys("Password123");
        driver.findElement(By.id("submit")).click();
        Thread.sleep(2000);

        String successMsg = driver.findElement(By.className("post-title")).getText();
        System.out.println("Login Result: " + successMsg);

        driver.quit();
    }
}
