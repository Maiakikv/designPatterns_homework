package main.pages;

import main.data.HomePageData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class FormsPage {
    private WebDriver driver;
    HomePageData home = new HomePageData();
    @FindBy(how = How.XPATH, using = "//span[text() ='Practice Form']")
    private WebElement practiceForms;

    public WebElement getPracticeForms() {
        return practiceForms;
    }

    public FormsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }




}
