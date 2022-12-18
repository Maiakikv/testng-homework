import com.codeborne.selenide.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class CheckboxTests {
 //   All tests should be started with new webdriver instance * - აქ ვიფიქრე, ეს იგულისხმებოდა, მაგრამ ტესტის გაშვებას ხელს უშლიდა და იყოს ასე
//
//    @BeforeTest
//    public void webdriverInstance() {
//        System.setProperty("webdriver.chrome.driver", "C:\\");
//        WebDriver driver = new ChromeDriver();
//    }


    @BeforeMethod(groups = "checkbox")
    public void setUp() {

        Configuration.baseUrl = "http://the-internet.herokuapp.com";
        Configuration.reportsFolder = "src/main/resources/CheckboxFailedTests";
        Configuration.screenshots = true;

    }

    @Test(groups = "checkbox", priority = 0)
    public void unCheckBox() {
        SoftAssert softAssert = new SoftAssert();
        open("/checkboxes ");
        ElementsCollection checkBoxes = $("#checkboxes").findAll("input");
        checkBoxes.stream().forEach(che -> che.setSelected(false));
        for (SelenideElement ch : checkBoxes
        ) {
            softAssert.assertFalse(ch.isSelected());
        }
        softAssert.assertAll();
    }

    @Test(groups = "checkbox", priority = 1)
    public void checkbox() {
        open("/checkboxes ");
        SoftAssert softAssert = new SoftAssert();
        ElementsCollection checkBoxes = $("#checkboxes").findAll("input");
        for (SelenideElement el : checkBoxes
        ) {
            el.setSelected(true);
        }
        for (SelenideElement ch : checkBoxes
        ) {
            softAssert.assertTrue(ch.isSelected());
        }
        softAssert.assertAll();
    }


}

