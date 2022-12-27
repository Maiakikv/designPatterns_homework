package Pages;
import static com.codeborne.selenide.Selenide.$;
import com.codeborne.selenide.*;
import static com.codeborne.selenide.Selectors.byText;

public class HomePage {
    public SelenideElement
            forms = $(byText("Forms"));
}
