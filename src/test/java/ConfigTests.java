import com.codeborne.selenide.AssertionMode;
import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;


public class ConfigTests {
    @BeforeSuite
    public void configTests() {
        Configuration.browserSize="2000x1800";
        Configuration.savePageSource =false;
        Configuration.timeout= 12000;
        Configuration.holdBrowserOpen=false;
        Configuration.reopenBrowserOnFail = true;
        Configuration.assertionMode = AssertionMode.SOFT;



    }
}
