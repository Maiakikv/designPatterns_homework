package main.pages;

import main.data.HomePageData;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class HomePage {
    private WebDriver driver;
    @FindBy(how = How.XPATH, using = "//h5[contains(text(),'Forms')]//ancestor::div[@class = 'card mt-4 top-card']")
    private WebElement forms;

    public WebElement getForms() {
        return forms;
    }

    public HomePage(@NotNull WebDriver driver) {
        this.driver = driver;
        driver.get(HomePageData.getHomepageURL());
        PageFactory.initElements(driver, this);

    }
}
