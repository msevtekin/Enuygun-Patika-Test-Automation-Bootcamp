import framework.ConfigReader;
import framework.DriverSetup;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageobjects.HomePage;

public class FavoritesTest {
    static WebDriver driver;
    HomePage homePage;
    String savedWishTitle = "";
    @BeforeClass
    public void setup(){
        driver = DriverSetup.initialize_Driver(ConfigReader.initialize_Properties().get("browser").toString());
        homePage = new HomePage(driver);
    }

    @Test(priority = 1)
    public void checkAddToWishListSuccessfully(){
        savedWishTitle = homePage.addItemToWishList();
    }

    @Test(priority = 2)
    public void checkWishList(){
        homePage.checkWishInFavorList(savedWishTitle);
    }

    @Test(priority = 3)
    public void signInToSite(){
        homePage.loginToSite();
        //Login yapıldıktan sonra /login enpointinden anasayfaya geçiş validate edildi
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.flocake.com/");

    }

    @Test(priority = 4)
    public void addItemFromSearchBox() throws InterruptedException {
        homePage.addItem();

    }
}
