package stepsDefinitions;

import constants.EndPoints;
import context.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.PageFactoryManager;
import pages.StorePage;

public class StoreStepDefinitions {


    private final StorePage storePage;


    public  StoreStepDefinitions(TestContext context){

        storePage = PageFactoryManager.getStorePage(context.driver);
    }


    @Given("I'm on the Store Page")
    public void iMOnTheStorePage() {
//        driver = DriverFactory.getDriver();
        storePage.load(EndPoints.STORE.url);
//        new StorePage(driver).load(AppEndPoints.store);
    }

    @When("I add a {string} to the cart")
    public void iAddAToTheCart(String productName) throws InterruptedException {

        storePage.addToCart(productName);
    }



    @Given("I have a product in the cart")
    public void iHaveAProductInTheCart(){

        //   By addToCartBtn = By.cssSelector("a[aria-label='Add “Blue Shoes” to your cart']");
        storePage.addToCart("Blue Shoes");

    }
}
