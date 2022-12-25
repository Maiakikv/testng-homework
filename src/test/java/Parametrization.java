import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


public class Parametrization {
    @BeforeMethod
    public void setUp() {
        Configuration.browserSize = "2000x1800";
        Configuration.savePageSource = false;
        Configuration.timeout = 10000;
        Configuration.holdBrowserOpen = true;
        Configuration.reopenBrowserOnFail = true;
    }

    @Test
    @Parameters({"firstName", "lastName", "gender", "mobileNumber"})
    public void parameters(String firstname, String lastName, String gender, String mobileNumber) {
        open("https://demoqa.com/automation-practice-form");
        $("#firstName").sendKeys(firstname);
        $("#lastName").sendKeys(lastName);
        $(byText(gender)).click();
        $("[placeholder='Mobile Number']").sendKeys(mobileNumber);
        Assert.assertEquals(firstname, $("#firstName").getValue());




    }
}
