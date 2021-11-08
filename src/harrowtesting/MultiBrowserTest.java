package harrowtesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class MultiBrowserTest {
        static String browser = "Chrome";
        static String baseUrl = "https://www.harrow.gov.uk/";
        static WebDriver driver;

        public static void main(String[] args) {
            if (browser.equalsIgnoreCase("chrome")) {
                System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
                driver = new ChromeDriver();
            } else if (browser.equalsIgnoreCase("firefox")) {
                System.setProperty("webdriver.gecko.driver", "");
                driver = new FirefoxDriver();
            } else if (browser.equalsIgnoreCase("edge")) {
                System.setProperty("webdriver.edge.driver", "");
                driver = new EdgeDriver();
            } else if (browser.equalsIgnoreCase("opera")) {
                System.setProperty("webdriver.opera.driver", "");
                driver = new OperaDriver();
            } else {
                System.out.println("Browser name is wrong");
            }
            driver.get(baseUrl);
        }
    }

