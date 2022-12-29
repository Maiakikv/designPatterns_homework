package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class FormsPageFactory {
    private WebDriver driver;
    @FindBy(how = How.XPATH, using = "//span[text() ='Practice Form']")
    private WebElement practiceForms;

    public FormsPageFactory(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnForms(){
        practiceForms.click();
    }
}
