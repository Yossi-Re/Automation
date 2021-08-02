import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class BasicTest {
    @BeforeClass
    public static void runOnceBeforeClass() {
        ChromeDriver driver;
        System.setProperty("webdriver.chrome.driver“ , “C:\\Users\\sergey\\ChromeDriver.exe”);
                WebDriver driver = new ChromeDriver();
    }
}