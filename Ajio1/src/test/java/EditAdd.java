mport org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EditAdd {
    private By proceedShipping=By.xpath("//button[@class='rilrtl-button button shipping-button']");
    private By address=By.id("add")
    private By newAddress=By.id("modalId")
    private By proceed=By.className("login-btn");

}
    public void VerifyAdd(){

        driver.findElement(proceedShipping).click();
        driver.findElement(address).sendKeys(address);
        driver.findElement(newaddress).sendKeys(newaddress);
        driver.findElement(proceed).click();
    }

}
}
