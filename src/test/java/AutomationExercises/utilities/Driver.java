package AutomationExercises.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

//public class Driver {
//    private static WebDriver webDriver;
//    private Driver() {}
//
//    public static WebDriver getDriver() {
//        if (webDriver == null) {
//            String browser = ConfigurationReader.getProperty("browser");
//            ChromeOptions options = new ChromeOptions();
//            options.addArguments("--incognito");
//            options.addArguments("lang=en-GB");
//
//            switch (browser) {
//                case "chrome":
//                    WebDriverManager.chromedriver().setup();
//                    driverPool.set(new ChromeDriver());
//                    break;
//                case "firefox":
//                    WebDriverManager.firefoxdriver().setup();
//                    driverPool = new FirefoxDriver();
//                    break;
//                case "edge":
//                    WebDriverManager.edgedriver().setup();
//                    driverPool = new EdgeDriver();
//                    break;
//                case "safari":
//                    WebDriverManager.safaridriver().setup();
//                    driverPool = new SafariDriver();
//                    break;
//                case "opera":
//                    WebDriverManager.operadriver().setup();
//                    driverPool = new OperaDriver();
//                    break;
//                case "explorer":
//                    WebDriverManager.iedriver().setup();
//                    driverPool = new InternetExplorerDriver();
//                    break;
//                default:
//                    throw new IllegalArgumentException("unknown browser type - " + browser);
//            }
//            driverPool.manage().window().maximize();
//            driverPool.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//        }
//
//        return driverPool;
//    }
//
//    public static void closeDriver() {
//        if (driverPool != null)
//            driverPool.quit(); // this will kill the session but driver will not be null
//            driverPool = null;
//    }
//}
//

public class Driver {

    /*
     * Making our driver "driver" instance private, so that it is not reachable from outside the class
     * We make it static, because we want it to run before anything else, also we will use it in static method
     * */
    private static InheritableThreadLocal<WebDriver> driverPool = new InheritableThreadLocal<>();

    /*
     * Creating a private constructor, so we are closing access to the object this class from outside any class
     * */
    private Driver() {
    }

    /*
     * Create re-usable utility method which will return some driver instance when we call it.
     * */
    public static WebDriver getDriver() {
        if (driverPool.get() == null) { // if driver/browser was never opened
            String browserType = ConfigurationReader.getProperty("browser");

            /*
             * Depending on the browserType our switch statement will determine to open specific type of browser/driver
             * */
            switch (browserType) {
                case "chrome": {
                    WebDriverManager.chromedriver().setup();
                    driverPool.set(new ChromeDriver());
                    break;
                }
                case "firefox": {
                    WebDriverManager.firefoxdriver().setup();
                    driverPool.set(new FirefoxDriver());
                    break;
                }
            }
            driverPool.get().manage().window().maximize();
            driverPool.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }

        /*
         * Some driver instance will be returned every time we call Driver.getDriver() method
         * */
        return driverPool.get();
    }

    public static void closeDriver() {
        if (driverPool.get() != null) {
            driverPool.get().quit(); // this line will kill the session, value will not be null
            driverPool.set(null);
        }
    }
}
