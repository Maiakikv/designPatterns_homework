package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class HomePageFactory {
    private WebDriver driver;
    private static String homepageURL = "https://demoqa.com/";

    @FindBy(how = How.XPATH, using = "//h5[contains(text(),'Forms')]//ancestor::div[@class = 'card mt-4 top-card']")
    private WebElement forms;

    public HomePageFactory(WebDriver driver){

        this.driver=driver;
        driver.get(homepageURL);
        PageFactory.initElements(driver, this);
    }

    public void clickOnForms(){
        forms.click();
    }

}
