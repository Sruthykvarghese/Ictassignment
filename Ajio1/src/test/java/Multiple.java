
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Multiple {
    private WebDriver driver;

    private By txtselect1=By.xpath("//img[@alt='STEVE MADDEN Black Textured Peep-Toe Stilettos']");
    private By txtselect2=By.xpath("//img[@alt='Tulsattva Black Mid-Rise Jeggings with Mock Buttons']");
    private By txtselect3=By.xpath("//img[@alt='Mayra Multicoloured Striped  Jumpsuit']");
    private By txtaddcart=By.xpath("//div[@class='pdp-addtocart-button']");

    public Multiple(WebDriver driver){
        this.driver=driver;
    }

    public void Multiple(){
        driver.findElement(txtselect1).click();
        ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(newTab.get(1));
        driver.findElement(txtaddcart).click();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS) ;
        driver.switchTo().window(newTab.get(0));
        driver.findElement(txtselect2).click();
        ArrayList<String> newTab2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(newTab2.get(2));
        driver.findElement(txtaddcart).click();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS) ;
        driver.switchTo().window(newTab.get(0));
        driver.findElement(txtselect3).click();
        ArrayList<String> newTab3 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(newTab3.get(3));
        driver.findElement(txtaddcart).click();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS) ;
        driver.switchTo().window(newTab.get(0));

 }



}
