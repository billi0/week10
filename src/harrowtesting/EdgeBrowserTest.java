package harrowtesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowserTest {
    public static void main(String[]args){
        String baseUrl = "https://www.harrow.gov.uk/";
        System.setProperty("webdriver.edge.driver","driver/edgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get(baseUrl);
        String getTitle = driver.getTitle();
        System.out.println(getTitle);
        driver.close();

    }
}
