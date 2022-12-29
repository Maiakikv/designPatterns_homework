package fluent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePageFluent {
    private WebDriver driver;

    public HomePageFluent(WebDriver driver) {
        this.driver = driver;

    }
    By forms =By.xpath("//h5[contains(text(), 'Forms')]//ancestor::div[@class = 'card mt-4 top-card']");

    public HomePageFluent clickOnForms (){
        driver.findElement(forms).click();
        return this;
    }
}
