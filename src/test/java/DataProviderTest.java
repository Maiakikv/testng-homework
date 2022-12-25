import com.codeborne.selenide.Configuration;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class DataProviderTest {
    @BeforeMethod
    public void setUp() {
        Configuration.browserSize = "2000x1800";
        Configuration.savePageSource = false;
        Configuration.timeout = 10000;
        Configuration.holdBrowserOpen = true;
        Configuration.reopenBrowserOnFail = true;
    }

    @Test(dataProvider = "dataProvider", dataProviderClass = DataProvider.class)
    public void test(String firstname, String lastName, String gender, String mobileNumber){
        open("https://demoqa.com/automation-practice-form");
        $("#firstName").sendKeys(firstname);
        $("#lastName").sendKeys(lastName);
        $(byText(gender)).click();
        $("[placeholder='Mobile Number']").sendKeys(mobileNumber);
        Assert.assertEquals(firstname, $("#firstName").getValue());

    }
}
