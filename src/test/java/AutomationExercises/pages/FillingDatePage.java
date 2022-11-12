package AutomationExercises.pages;

import AutomationExercises.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class FillingDatePage {

    public FillingDatePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

}
