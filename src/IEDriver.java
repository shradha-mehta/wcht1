import org.openqa.selenium.WebDriver;

import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class IEDriver {
    public static void main(String[] args) {
        String baseUrl = "https://www.wcht.org.uk";
        System.setProperty("webdriver.ie.driver", "driver/IEDriver.exe");
        WebDriver driver = new InternetExplorerDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(baseUrl);
        System.out.println("Main page + tittle");
        driver.quit();
    }
}

