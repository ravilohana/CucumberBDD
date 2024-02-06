package stepsDefinitions;

import context.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.CartPage;
import pages.PageFactoryManager;

public class CartStepDefinitions {




    private final CartPage cartPage;

    public  CartStepDefinitions(TestContext context){
        cartPage = PageFactoryManager.getCartPage(context.driver);
    }


    @Then("I should see {int} {string} in the cart")
    public void iShouldSeeInTheCart(int qty, String productName) {
        Assert.assertEquals(productName,cartPage.getProductName());
        Assert.assertEquals(qty,cartPage.getProductQty());

    }

    @Given("I'm on the Checkout Page")
    public void iMOnTheCheckoutPage() {
        cartPage.clickCheckoutBtn();

    }

}
