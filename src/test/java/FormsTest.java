import Pages.PracticeFormPage;
import Steps.FillFormStep;
import Steps.FormsPageStep;
import Steps.HomePageStep;
import static com.codeborne.selenide.Condition.*;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.ElementsCollection.texts;
import static com.codeborne.selenide.Selenide.*;

public class FormsTest {
    @BeforeTest
    public void configTests() {
        Configuration.browserSize = "2000x1800";
        Configuration.savePageSource = false;
        Configuration.timeout = 10000;
        Configuration.holdBrowserOpen = true;
        Configuration.reopenBrowserOnFail = true;
    }

    @Test
    public void test(){
        HomePageStep homePageStep = new HomePageStep();
        FormsPageStep formsPageStep =new FormsPageStep();
        FillFormStep fillPracticeForm =new FillFormStep();
        PracticeFormPage practiceFormPage =new PracticeFormPage();
        open("https://demoqa.com/");

        homePageStep.openForm();
        formsPageStep.openPracticeForm();
        fillPracticeForm.setFirstName().setLastName().setMobileNumber().setGender("Female").submitForm();

        Assert.assertEquals(practiceFormPage.firstName.innerText(), "Maia");
        practiceFormPage.lastName.shouldHave(text("Kikvadze"));
        practiceFormPage.mobileNumber.shouldHave(text("599041180"));
        practiceFormPage.gender.get(1).isSelected();



    }
}
