import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;

public class Loginpage {
    private WebDriver driver;

    private By txtUserName=By.name("username");
    private By txtcontinue=By.className("login-btn");
    private By txtPassword=By.name("password");
    private By txtstartshop=By.xpath("//div[@class='box-margin']/child::input");
    public Loginpage(WebDriver driver){
        this.driver=driver;
    }

    public void Loginpage(String username, String password){
        driver.findElement(txtUserName).sendKeys(username);
        driver.findElement(txtcontinue).click();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
        driver.findElement(txtPassword).sendKeys(password);
        driver.findElement(txtstartshop).click();
    }



}
