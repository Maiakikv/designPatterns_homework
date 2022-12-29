import fluent.FormsPageFluent;
import fluent.HomePageFluent;
import fluent.PracticeFormPageFluent;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class FormsTestFl {
  WebDriver driver;

    @Test
    public void fluentTest() {
        WebDriverManager.chromedriver().setup();
        this.driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://demoqa.com/");
        HomePageFluent home = new HomePageFluent(driver);
        FormsPageFluent formsPage = new FormsPageFluent(driver);
        PracticeFormPageFluent practicePage = new PracticeFormPageFluent(driver);
        home.clickOnForms();
        formsPage.clickOnPracticeForm();
        practicePage.enterFirstName("Maia")
                .enterLastName("Kikvadze").enterMobileNumber("59000000000").setGenders("Female");
        practicePage.adBlock();
        practicePage.setSubmit();
        practicePage.nameAssertion();
        practicePage.lastNameAssertion();
        practicePage.mobileAssertion();
        practicePage.genderAssertion();
        driver.quit();
    }
}