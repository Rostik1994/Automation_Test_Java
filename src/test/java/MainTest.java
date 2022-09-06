import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.BookingPage;

public class MainTest {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = prepareDriver();

       BookingPage bookingPage = new BookingPage(driver);

       bookingPage.goToMainPage();

       bookingPage.choosesCity();

       bookingPage.choosesDateRange();

       bookingPage.clickSearch();

       bookingPage.printResults();

       driver.close();

       driver.quit();
    }

    static WebDriver prepareDriver() {
        String projectPath = System.getProperty("user.dir");
        System.out.println(projectPath);

        System.setProperty("webdriver.chrome.driver", projectPath + "/drivers/chromedriver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        return driver;
    }

}


