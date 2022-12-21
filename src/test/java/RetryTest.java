import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryTest {
    static int i = 0;
    @Test(retryAnalyzer = myRetry.class)
    public void retryFail(){
        i++;
        if (!(i ==6)){
            Assert.fail();

        }


    }
}
