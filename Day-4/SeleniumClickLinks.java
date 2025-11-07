import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class SeleniumClickLinks {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AjaySomepalli\\Downloads\\Selenium\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://practicetestautomation.com/");
        Thread.sleep(2000);

        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Found " + links.size() + " links. Clicking first 3...");

        for (int i = 0; i < Math.min(3, links.size()); i++) {
            WebElement link = links.get(i);
            String text = link.getText().trim();
            if (!text.isEmpty()) {
                System.out.println("Clicking: " + text);
                link.click();
                Thread.sleep(2000);
                driver.navigate().back();
                Thread.sleep(2000);
            }
        }

        driver.quit();
    }
}
