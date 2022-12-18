import com.codeborne.selenide.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RadioButtonTests {
//    @BeforeTest
//    public void webdriverInstance() {
//        System.setProperty("webdriver.chrome.driver", "C:\\");
//        WebDriver driver = new ChromeDriver();
//    }


    @BeforeMethod(groups = "radio")
    public void setUp() {
        //       WebDriver driver =WebDriverRunner.getWebDriver();
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.reportsFolder = "src/main/resources/RadioButtonFailedTests";
        Configuration.screenshots = true;
    }


    @Test(groups = "radio", priority = 0)
    public void yesButtonTest() {
        SoftAssert softAssert = new SoftAssert();
        open("/radio-button");
        SelenideElement yesButton = $("[for='yesRadio']");
        yesButton.click();
        SelenideElement text = $(".text-success");
        softAssert.assertEquals(text.getText(), "Yes");
        softAssert.assertAll();

    }

    @Test(groups = "radio", priority = 1)
    public void noButtonTest() {
        SoftAssert softAssert = new SoftAssert();
        open("/radio-button");
        SelenideElement noButton = $("[for='#noRadio']");
        softAssert.assertTrue(noButton.isEnabled());
        softAssert.assertAll();


    }
}
