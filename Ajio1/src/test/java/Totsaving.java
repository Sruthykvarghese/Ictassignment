mport org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Totsaving {
    private By Bagtotal = By.xpath("//section[@id='bagTotal']/span[2]");
    private By discount = By.xpath("//section[@id='bagDiscount']/span[2]");
    private By OrderTotal = By.xpath("//section[@id='orderTotal']/span[2]");
    private By afBagtotal = By.xpath("//section[@id='bagTotal']/span[2]");
    private By afBagdiscount = By.xpath("//section[@id='bagDiscount']/span[2]");


    public Totsaving(WebDriver driver) {
        this.driver = driver;
    }

    public void Totsaving() {

        String bagtl = driver.findElement(Bagtotal).getText();
        System.out.println("Bag Total: " + bagtl);
        String bagdis = driver.findElement(Bagdiscount).getText();
        System.out.println("Bag Discount: " + bagdis);
        String ordrTotal = driver.findElement(OrderTotal).getText();
        System.out.println("Order Total: " + ordrTotal);

        driver.navigate().refresh();

        driver.findElement(Dltprd).click();
        driver.findElement(Dltbtn).click();

        driver.navigate().refresh();

        String afbagtl = driver.findElement(afBagtotal).getText();
        System.out.println("Bag Total after delete: " + afbagtl);
        String afbagdis = driver.findElement(afBagdiscount).getText();
        System.out.println("Bag discount after delete : " + afbagdis);
        String afordrTotal = driver.findElement(afOrderTotal).getText();
        System.out.println("Order Total after Delete: " + afordrTotal);



    }
}