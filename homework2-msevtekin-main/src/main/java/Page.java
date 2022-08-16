import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Page {

    WebDriver driver;
    By searchBoxLocator = By.id("searchBox");
    //WebElement button = driver.findElement(By.xpath("*[@id=\"searchBox\"]"));

    public Page(WebDriver driver){
        this.driver = driver;
    }

    public void setText(String nameString){
        WebElement nameSpace = driver.findElement(searchBoxLocator);
        nameSpace.click();
        nameSpace.sendKeys(nameString);
    }


}
