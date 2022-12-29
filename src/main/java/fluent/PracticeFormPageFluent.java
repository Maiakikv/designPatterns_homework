package fluent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class PracticeFormPageFluent {
    private WebDriver driver;

    public PracticeFormPageFluent(WebDriver driver) {
        this.driver = driver;

    }

    By firstName = By.id("firstName");
    By lastName =By.id("lastName");
    By mobileNumber =By.xpath("//input[@id = 'userNumber']");
    List <WebElement> genders =driver.findElements(By.xpath("//label[contains(@for, 'gender-radio')]"));
    By submit =By.id("submit");
    By submitWindow =By.className("modal-content");




    public PracticeFormPageFluent enterFirstName (String fname){
        driver.findElement(firstName).sendKeys(fname);
        return this;
    }
    public PracticeFormPageFluent enterLastName (String lname){
        driver.findElement(lastName).sendKeys(lname);
        return this;
    }
    public PracticeFormPageFluent enterMobileNumber (String mobile){
        driver.findElement(mobileNumber).sendKeys(mobile);
        return this;
    }

    public PracticeFormPageFluent setGenders(String gender) {
        if (gender == "Male"){
            genders.get(0).click();
        }
        else if(gender == "Female"){
            genders.get(1).click();
        }
        else if(gender == "Other"){
            genders.get(2).click();
        }
        return this;
    }

    public void adBlock(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement ad = driver.findElement(By.id("adplus-anchor"));
        js.executeScript("return arguments[0].remove(); ", ad);
        js.executeScript("document.body.style.zoom='67%'");

    }
    public void setSubmit (){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        WebDriverWait wait =new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(submit)));
        js.executeScript("arguments[0].scrollIntoView();", driver.findElement(submit));
        js.executeScript("arguments[0].click();", driver.findElement(submit));
}

    public boolean nameAssertion (){
        return driver.findElement(submitWindow).getText().contains(driver.findElement(firstName).getText());

    }
    public boolean lastNameAssertion (){
        return driver.findElement(submitWindow).getText().contains(driver.findElement(lastName).getText());

    }
    public boolean mobileAssertion (){
        return driver.findElement(submitWindow).getText().contains(driver.findElement(mobileNumber).getText());

    }
    public boolean genderAssertion (){
        return driver.findElement(submitWindow).getText().contains("Female");
    }
}
