package main.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PracticeFormPage {
    private WebDriver driver;
    @FindBy(how = How.ID, using = "firstName")
    private WebElement firstName;
    @FindBy(how = How.ID, using = "lastName" )
    private WebElement lastName;
    @FindBy(how = How.XPATH, using = "//input[@id = 'userNumber']")
    private WebElement mobileNumber;
    @FindBy(how = How.XPATH, using = "//label[contains(@for, 'gender-radio')]")
    private List<WebElement> genders;
    @FindBy(how =How.ID, using = "submit")
    private WebElement submit;
    @FindBy(how = How.CLASS_NAME, using ="modal-content")
    private WebElement submitWindow;

    public PracticeFormPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public WebElement getFirstName() {
        return firstName;
    }

    public WebElement getLastName() {
        return lastName;
    }

    public WebElement getMobileNumber() {
        return mobileNumber;
    }

    public List<WebElement> getGenders() {
        return genders;
    }

    public WebElement getSubmit() {
        return submit;
    }

    public WebElement getSubmitWindow() {
        return submitWindow;
    }
}
