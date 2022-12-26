import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class myRetry implements IRetryAnalyzer {
    private int retryNumb = 0;
    private static final int maxRetry = 6;

    @Override
    public boolean retry(ITestResult Result) {
        if (retryNumb < maxRetry) {
            retryNumb++;
            return true;
        }
        return false;
    }
}
