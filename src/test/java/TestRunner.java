import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(DictionaryTester.class);

        // Print failed tests
        for (Failure failure : result.getFailures()) {
            System.out.println("Test Failed for Non-English word: "+failure.toString());
        }

        // Print success tests
        System.out.println("Test Successful for English Word: " + result.wasSuccessful() + " Executed  " + result.getRunCount() + " tests");
    }
}  