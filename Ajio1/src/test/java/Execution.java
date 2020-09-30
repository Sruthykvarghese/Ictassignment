import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.concurrent.TimeUnit;

public class Execution {

    ExtentReports reports;
    ExtentSparkReporter extentSparkReporter;
    ExtentTest extentTest;

    @Test(priority = 1)
    public void LoginTest() throws IOException {

        String path = System.getProperty("user.dir");
        reports = new ExtentReports();
        extentSparkReporter = new ExtentSparkReporter(path + "\\report\\report.html");
        reports.setSystemInfo("Machine Name", InetAddress.getLocalHost().getHostName());
        reports.attachReporter(extentSparkReporter);
        extentTest = reports.createTest("LoginTest");
        WebDriver driver = Driver.openBrowser("chrome", "https://www.ajio.com/login");
        Loginpage login = new Loginpage(driver);
        login.Loginpage("8281652099", "password");
        extentTest.log(Status.PASS, "Login successfully");
        extentTest.addScreenCaptureFromPath(Driver.takeScreenshot());
         Driver.closeBrowser();
        reports.flush();

    }
   @Test(priority = 4)
    public void SearchTest() throws IOException {

        String path = System.getProperty("user.dir");
        reports = new ExtentReports();
        extentSparkReporter = new ExtentSparkReporter(path + "\\report\\report.html");
        reports.setSystemInfo("Machine Name", InetAddress.getLocalHost().getHostName());
        reports.attachReporter(extentSparkReporter);
        extentTest = reports.createTest("SearchTest");
        WebDriver driver = Driver.openBrowser("chrome", "https://www.ajio.com/");
        Search Searchpage = new Search(driver);
        Searchpage.Search("Heels");
        extentTest.log(Status.PASS, "Login successfully");
        extentTest.addScreenCaptureFromPath(Driver.takeScreenshot());
         Driver.closeBrowser();
       reports.flush();
    }
   @Test(priority = 5)
   public void ChooseTest() throws IOException {

       String path = System.getProperty("user.dir");
        reports = new ExtentReports();
        extentSparkReporter = new ExtentSparkReporter(path + "\\report\\report.html");
        reports.setSystemInfo("Machine Name", InetAddress.getLocalHost().getHostName());
        reports.attachReporter(extentSparkReporter);
        extentTest = reports.createTest("ChooseTest");
        WebDriver driver = Driver.openBrowser("chrome", "https://www.ajio.com/search/?text=heels");
        Additem Addprod = new Additem(driver);
        Addprod.Additem();
        extentTest.log(Status.PASS, "Login successfully");
        extentTest.addScreenCaptureFromPath(Driver.takeScreenshot());
         Driver.closeBrowser();
        reports.flush();
    }

    WebDriver driver = Driver.openBrowser("chrome", "https://www.ajio.com/search/?text=heels");

    @Test(priority = 1)
    public void MultTest() throws IOException {

        String path = System.getProperty("user.dir");
        reports = new ExtentReports();
        extentSparkReporter = new ExtentSparkReporter(path + "\\report\\report.html");
        reports.setSystemInfo("Machine Name", InetAddress.getLocalHost().getHostName());
        reports.attachReporter(extentSparkReporter);
        extentTest = reports.createTest("MultTest");
        WebDriver driver = Driver.openBrowser("chrome", "https://www.ajio.com/search/?text=heels");
        Multiple Multiprod = new Multiple(driver);
        Multiprod.Multiple();
        extentTest.log(Status.PASS, "Login successfully");
        extentTest.addScreenCaptureFromPath(Driver.takeScreenshot());
        // Driver.closeBrowser();
        reports.flush();
    }

    @Test(priority = 2)
    public void BagTest() throws IOException {
        String path = System.getProperty("user.dir");
        reports = new ExtentReports();
        extentSparkReporter = new ExtentSparkReporter(path + "\\report\\report.html");
        reports.setSystemInfo("Machine Name", InetAddress.getLocalHost().getHostName());
        reports.attachReporter(extentSparkReporter);
        extentTest = reports.createTest("BagTest");
        WebDriver driver = Driver.openBrowser("chrome", null);
        MyBag Check = new MyBag(driver);
        Check.MyBag();
        extentTest.log(Status.PASS, "Login successfully");
        extentTest.addScreenCaptureFromPath(Driver.takeScreenshot());
        // Driver.closeBrowser();
        reports.flush();
    }
    @Test(priority = 3)
    public void OrdrsumTest() throws IOException {
        String path = System.getProperty("user.dir");
        reports = new ExtentReports();
        extentSparkReporter = new ExtentSparkReporter(path + "\\report\\report.html");
        reports.setSystemInfo("Machine Name", InetAddress.getLocalHost().getHostName());
        reports.attachReporter(extentSparkReporter);
        extentTest = reports.createTest("OrdrTest");
        WebDriver driver = Driver.openBrowser("chrome", null);
        Ordersummary Check = new Ordersummary(driver);
        Check.Ordersummary();
        extentTest.log(Status.PASS, "Login successfully");
        extentTest.addScreenCaptureFromPath(Driver.takeScreenshot());
        // Driver.closeBrowser();
        reports.flush();
 }
    Test(priority = 1)
    public void Ordervalue() throws IOException {

        String path = System.getProperty("user.dir");
        reports = new ExtentReports();
        extentSparkReporter = new ExtentSparkReporter(path + "\\report\\report.html");
        reports.setSystemInfo("Machine Name", InetAddress.getLocalHost().getHostName());
        reports.attachReporter(extentSparkReporter);
        extentTest = reports.createTest("OrderTest");
        WebDriver driver = Driver.openBrowser("chrome", "https://www.ajio.com/");
        Ordervalue order = new Ordervalue(driver);
        order.Ordervalue();
        extentTest.log(Status.PASS, "Login successfully");
        extentTest.addScreenCaptureFromPath(Driver.takeScreenshot());
        Driver.closeBrowser();
        reports.flush();

        Test(priority = 5)
        public void Totsaving() throws IOException {

            String path = System.getProperty("user.dir");
            reports = new ExtentReports();
            extentSparkReporter = new ExtentSparkReporter(path + "\\report\\report.html");
            reports.setSystemInfo("Machine Name", InetAddress.getLocalHost().getHostName());
            reports.attachReporter(extentSparkReporter);
            extentTest = reports.createTest("savTest");
            WebDriver driver = Driver.openBrowser("chrome", "https://www.ajio.com/");
            Totsaving tot = new Totsaving(driver);
            tot.Totsaving();
            extentTest.log(Status.PASS, "Login successfully");
            extentTest.addScreenCaptureFromPath(Driver.takeScreenshot());
            Driver.closeBrowser();
            reports.flush();

