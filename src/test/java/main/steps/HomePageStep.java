package main.steps;

import io.qameta.allure.Step;
import main.data.HomePageData;
import main.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePageStep extends HomePage{
    public HomePageStep(WebDriver driver) {
        super(driver);
    }

    @Step
    public HomePageStep clickOnForms(){
        super.getForms().click();
        return this;
    }
}
