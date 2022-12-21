import com.codeborne.selenide.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RadioButtonTests {
    SoftAssert softAssert = new SoftAssert();
    @BeforeMethod(groups = {"FrontEnd", "BackEnd"})
    public void setUp() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.reportsFolder = "src/main/resources/RadioButtonFailedTests";
        Configuration.screenshots = true;
    }


    @Test(groups = "FrontEnd", priority = 1)
    public void yesButtonTest() {
        open("/radio-button");
        SelenideElement yesButton = $("[for='yesRadio']");
        yesButton.click();
        SelenideElement text = $(".text-success");
        softAssert.assertEquals(text.getText(), "Yes");
        softAssert.assertAll();

    }

    @Test(groups = "BackEnd", priority = 0)
    public void noButtonTest() {
        open("/radio-button");
        SelenideElement noButton = $("[for='#noRadio']");
        softAssert.assertTrue(noButton.isEnabled());
        softAssert.assertAll();
    }

   }
