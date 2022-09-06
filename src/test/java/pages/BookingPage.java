package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class BookingPage {
    WebElement search_city;
    WebDriver driver = null;
    public BookingPage(WebDriver driver) {
            this.driver = driver;
        }


        public void goToMainPage() {
        driver.get("https://goo.su/Qi1K");
    }

    public void choosesCity() throws InterruptedException {

        search_city = driver.findElement(By.id("ss"));
        Thread.sleep(2000);
        search_city.sendKeys("New York");
        Thread.sleep(2000);
    }

    public void choosesDateRange() throws InterruptedException {
        driver.findElement(By.xpath("//div[@class='xp__dates-inner']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='bui-calendar__control bui-calendar__control--next']")).click();
        driver.findElement(By.xpath("//div[@class='bui-calendar__control bui-calendar__control--next']")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//td[@data-date='2022-12-01']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//td[@data-date='2022-12-31']")).click();
        Thread.sleep(2000);
    }

    public void clickSearch() throws InterruptedException {
        driver.findElement(By.xpath("//span[@class='js-sb-submit-text ']")).click();
        Thread.sleep(4000);
    }

    public void printResults() {
        List<WebElement> cities = driver.findElements(By.xpath("//span[@class='f4bd0794db b4273d69aa'][@data-testid=\"address\"]"));
        for (int i = 0; i < cities.size(); i++) {
            System.out.println(cities.get(i).getText());
        }
    }



}
