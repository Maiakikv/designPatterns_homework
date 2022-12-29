
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pagefactory.FormsPageFactory;
import pagefactory.HomePageFactory;
import pagefactory.PracticeFormPageFactory;

import java.util.concurrent.TimeUnit;

public class FormsTestFactory {
    WebDriver driver;

    @BeforeClass
    public void configTests() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void test() {
        HomePageFactory home = new HomePageFactory(driver);
        home.clickOnForms();
        FormsPageFactory formsPageFactory = new FormsPageFactory(driver);
        formsPageFactory.clickOnForms();
        PracticeFormPageFactory practiceForm = new PracticeFormPageFactory(driver);
        practiceForm.setFirstName("Maia");
        practiceForm.setLastName("kikvadze");
        practiceForm.setMobileNumber("59999999888");
        practiceForm.setGenders("Female");


        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement ad = driver.findElement(By.id("adplus-anchor"));
        js.executeScript("return arguments[0].remove(); ", ad);
        js.executeScript("document.body.style.zoom='67%'");

        practiceForm.setSubmit();
        practiceForm.nameAssertion();
        practiceForm.lastNameAssertion();
        practiceForm.mobileAssertion();
        practiceForm.genderAssertion();

    }

    @AfterClass
    public void close(){
        driver.close();
    }
}
