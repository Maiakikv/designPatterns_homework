package Steps;

import Data.PracticeFormData;
import Pages.PracticeFormPage;

public class FillFormStep {
    PracticeFormPage practiceFormPage = new PracticeFormPage();
    PracticeFormData practiceFormData = new PracticeFormData();

    public FillFormStep setFirstName(){
        practiceFormPage.firstName.setValue(practiceFormData.firstName);
        return this;
    }

    public FillFormStep setLastName(){
        practiceFormPage.lastName.setValue(practiceFormData.lastName);
        return this;
    }

    public FillFormStep setMobileNumber(){
        practiceFormPage.mobileNumber.setValue(practiceFormData.mobileNumber);
        return this;
    }
    public FillFormStep setGender(String gender){
        if (gender==practiceFormData.gender[0]){
            practiceFormPage.gender.get(0).click(); }
        else if (gender==practiceFormData.gender[1]){
            practiceFormPage.gender.get(1).click(); }
        else if (gender==practiceFormData.gender[2]){
            practiceFormPage.gender.get(2).click(); }
        return this;
    }


        public FillFormStep submitForm(){
        practiceFormPage.sumbitButton.scrollTo().click();
        return this;
    }
}
