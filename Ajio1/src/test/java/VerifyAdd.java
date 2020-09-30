mport org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VerifyAdd {
    private By proceedShipping=By.xpath("//button[@class='rilrtl-button button shipping-button']");
    private By address = by.id("add")
    private By proceed = By.className("login-btn");

}
    public void VerifyAdd(){

        driver.findElement(proceedShipping).click();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
        driver.findElement(address).sendKeys(address);
        driver.findElement(proceed).click();
    }



}