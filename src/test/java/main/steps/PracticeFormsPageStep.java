package main.steps;

import io.qameta.allure.Step;
import main.data.PracticePageData;
import main.pages.PracticeFormPage;
import org.openqa.selenium.WebDriver;

import org.testng.Assert;

public class PracticeFormsPageStep extends PracticeFormPage {
    WebDriver driver;
    PracticePageData practicePageData =new PracticePageData();

    public PracticeFormsPageStep(WebDriver driver) {
        super(driver);
    }
   @Step
    public PracticeFormsPageStep setFirstName() {
        super.getFirstName().sendKeys(practicePageData.getFirstName());
        return this;
    }
    @Step
    public PracticeFormsPageStep setLasstName() {
        super.getLastName().sendKeys(practicePageData.getLastName());
        return this;
    }
    @Step
    public PracticeFormsPageStep setMobileNumber() {
        super.getMobileNumber().sendKeys(practicePageData.getMobileNumber());
        return this;
    }
    @Step
    public PracticeFormsPageStep setGender(String gender){
        if (gender==practicePageData.gender[0]){
            super.getGenders().get(0).click(); }
        else if (gender==practicePageData.gender[1]){
            super.getGenders().get(1).click(); }
        else if (gender==practicePageData.gender[2]){
            super.getGenders().get(2).click(); }
        return this;
    }

    @Step
       public PracticeFormsPageStep nameAssertion (){
        Assert.assertTrue(super.getSubmitWindow().getText().contains(practicePageData.getFirstName()));
        return this;

    }
    @Step
    public PracticeFormsPageStep LastNameAssertion (){
        Assert.assertTrue(super.getSubmitWindow().getText().contains(practicePageData.getLastName()));
        return this;

    }
    @Step
    public PracticeFormsPageStep MobileAssertion (){
        Assert.assertTrue(super.getSubmitWindow().getText().contains(practicePageData.getMobileNumber()));
        return this;

    }
    @Step ("enter gender value {0}")
    public PracticeFormsPageStep genderAssertion (String gender){
        Assert.assertTrue(super.getSubmitWindow().getText().contains(gender));
        return this;

    }

}
