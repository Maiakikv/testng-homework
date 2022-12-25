import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class FactoryTest {
   private String firstname,lastName, gender, mobileNumber;

    public FactoryTest(String firstname, String lastName, String gender, String mobileNumber) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.gender = gender;
        this.mobileNumber = mobileNumber;
    }
    @Test
    public void parameters() {
        open("https://demoqa.com/automation-practice-form");
        $("#firstName").sendKeys(firstname);
        $("#lastName").sendKeys(lastName);
        $(byText(gender)).click();
        $("[placeholder='Mobile Number']").sendKeys(mobileNumber);
        Assert.assertEquals(firstname, $("#firstName").getValue());
    }
}
