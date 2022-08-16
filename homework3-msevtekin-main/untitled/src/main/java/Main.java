import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Main {

        public static void main(String[] args) {
            //Chrome driver path verildi
            System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");

            //Chrome Options Settings
            ChromeOptions options = new ChromeOptions();

            options.addArguments("--start-maximized");

            String profilePath = "C:\\Users\\msevtAppData\\Local\\Google\\Chrome\\User Data";

            options.addArguments("user-data-dir="+profilePath);

            // driver instance yaratıldı
            WebDriver driver = new ChromeDriver(options);

            //  istenilen website Chrome'da profil ile açıldı
            String BASE_URL = "https://www.enuygun.com";
            driver.get(BASE_URL);

        }
}
