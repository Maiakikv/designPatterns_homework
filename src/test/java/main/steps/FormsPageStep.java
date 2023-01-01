package main.steps;

import io.qameta.allure.Step;
import main.pages.FormsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class FormsPageStep extends  FormsPage{
    public FormsPageStep(WebDriver driver) {
        super(driver);
    }

    @Step
    public FormsPageStep clickOnPracticeForm(){
        super.getPracticeForms().click();
        return this;
    }
}
