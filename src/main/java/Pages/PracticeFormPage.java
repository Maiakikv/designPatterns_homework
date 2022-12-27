package Pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;


public class PracticeFormPage {
    public SelenideElement firstName = $("#firstName"),
    lastName = $("#lastName"),
    mobileNumber = $("[placeholder='Mobile Number']"),
    sumbitButton =$("#submit");
    public ElementsCollection gender = $$(new By.ByXPath("//label[contains(@for, 'gender-radio')]"));
}
