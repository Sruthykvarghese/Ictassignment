
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Additem {
    private WebDriver driver;

    private By txtselect=By.xpath("//img[@alt='STEVE MADDEN Black Textured Peep-Toe Stilettos']");
    private By txtaddcart=By.xpath("//div[@class='pdp-addtocart-button']");

    public Additem(WebDriver driver){
        this.driver=driver;
    }

    public void Additem(){
        driver.findElement(txtselect).click();
        ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(newTab.get(1));
        driver.findElement(txtaddcart).click();
        driver.close();
        driver.switchTo().window(newTab.get(0));

    }



}
