package pagefactory;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;

public class PracticeFormPageFactory {
    private WebDriver driver;
    @FindBy(how = How.ID, using = "firstName")
    private WebElement firstName;
    @FindBy(how = How.ID, using = "lastName" )
    private WebElement lastName;
    @FindBy(how = How.XPATH, using = "//input[@id = 'userNumber']")
    private WebElement mobileNumber;
    @FindBy(how = How.XPATH, using = "//label[contains(@for, 'gender-radio')]")
    private List <WebElement> genders;
    @FindBy(how =How.ID, using = "submit")
    private WebElement submit;
    @FindBy(how = How.CLASS_NAME, using ="modal-content")
    private WebElement submitWindow;





    public PracticeFormPageFactory(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    public void setFirstName(String fName) {
        firstName.sendKeys(fName);
    }

    public void setLastName(String lName) {
        lastName.sendKeys(lName);
    }

    public void setMobileNumber(String mobile) {
        mobileNumber.sendKeys(mobile);
    }

    public void setGenders(String gender) {
        if (gender == "Male"){
            genders.get(0).click();
        }
        else if(gender == "Female"){
            genders.get(1).click();
        }
        else if(gender == "Other"){
            genders.get(2).click();
        }
    }



    public void setSubmit (){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        WebDriverWait wait =new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(submit));
        js.executeScript("arguments[0].scrollIntoView();", submit);
        js.executeScript("arguments[0].click();", submit);

    }
    public boolean nameAssertion (){
        return submitWindow.getText().contains(firstName.getText());

    }
    public boolean lastNameAssertion (){
        return submitWindow.getText().contains(lastName.getText());

    }
    public boolean mobileAssertion (){
        return submitWindow.getText().contains(mobileNumber.getText());

    }
    public boolean genderAssertion (){
        return submitWindow.getText().contains("Female");
    }




}
