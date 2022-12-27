package Steps;

import Pages.FormsPage;

public class FormsPageStep {
    FormsPage formsPage =new FormsPage();

    public FormsPageStep openPracticeForm(){
        formsPage.practiceForm.click();
        return this;
    }
}
