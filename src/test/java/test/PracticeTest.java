package test;
import io.qameta.allure.*;
import main.pages.PracticeFormPage;
import main.steps.FormsPageStep;
import main.steps.HomePageStep;
import main.steps.PracticeFormsPageStep;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;


@Listeners(Config.class)
@Epic("Fluent api, Factory")
@Feature("fill the form")
@Story("click on forms, then practice form, fill the form and ensure, that all values are correct")
public class PracticeTest extends BaseTest {

    @BeforeTest
    public void setup(){
        BaseTest baseTest=new BaseTest();
        baseTest.initialize();
        driver=getDriver();

    }


    @Flaky
    @Test(description = "test")
    @Description("click on forms, chlick on practice forms, fill the form, submit and ensure, that all values are correct")
    @Severity(SeverityLevel.MINOR)
    public void test (){
        PracticeFormPage practiceFormPage=new PracticeFormPage(driver);
        HomePageStep homePageStep=new HomePageStep(driver);
        FormsPageStep formsPageStep=new FormsPageStep(driver);
        PracticeFormsPageStep practiceFormsPageStep =new PracticeFormsPageStep(driver);
        homePageStep.clickOnForms();
        formsPageStep.clickOnPracticeForm();
        practiceFormsPageStep.setFirstName()
                .setLasstName()
                .setMobileNumber()
                .setGender("Female");


        //remove ads and submit, სხვანაირად ვერ ვაკლიკავ
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement ad = driver.findElement(By.id("adplus-anchor"));
        js.executeScript("return arguments[0].remove(); ", ad);
        js.executeScript("document.body.style.zoom='67%'");
        js.executeScript("arguments[0].scrollIntoView();", practiceFormPage.getSubmit());
        js.executeScript("arguments[0].click();", practiceFormPage.getSubmit());


        practiceFormsPageStep.nameAssertion()
                .LastNameAssertion()
                .genderAssertion("Female")
                .MobileAssertion();

    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}