import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Couponcheck {
    private WebDriver driver;

    private By Coupon = by.id("couponCodeInput")
    private By txtcontinue = By.className("login-btn");

    public Multiple(WebDriver driver) {
        this.driver = driver;
    }

    public void Couponsum() {
        driver.findElement(Couponsum).sendKeys(username);
        driver.findElement(txtcontinue).click();
    }
    {
        if(couponvaluve != couponcode)
            System.out.Println("InCorrect couponcode");
        else
            System.out.Println("correct couponcode");
    }
}
}
