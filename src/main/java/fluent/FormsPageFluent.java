package fluent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormsPageFluent {
   private WebDriver driver;

    public FormsPageFluent(WebDriver driver) {
        this.driver = driver;

    }

    By practiceForm =By.xpath("//span[text() ='Practice Form']");

    public FormsPageFluent clickOnPracticeForm (){
        driver.findElement(practiceForm).click();
        return this;
    }
}
