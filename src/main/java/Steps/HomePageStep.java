package Steps;

import Pages.HomePage;

public class HomePageStep {
    HomePage home = new HomePage();

    public HomePageStep openForm(){
        home.forms.click();
        return this;
    }
}
