import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.sql.Driver;

public class TestClass extends BaseTest {

    //Page page = new Page(driver);

    @Test
    public void isDisplay(){
        
        Assertions.assertEquals(true, driver.findElement(By.xpath("*[@id=\"searchBox\"]")).isDisplayed());
    }





//    Assertions.assertEquals(true,app.button.isDisplayed());



}
