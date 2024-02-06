package stepsDefinitions;

import context.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.CartPage;
import pages.CheckoutPage;
import pages.PageFactoryManager;

public class CheckoutStepDefinitions {




    private final CheckoutPage checkoutPage;
    private final TestContext context;

    public CheckoutStepDefinitions(TestContext context){
        this.context = context;
        checkoutPage = PageFactoryManager.getCheckoutPage(context.driver);
    }




    @When("I'm place an order")
    public void iMPlaceAnOrder() {
       checkoutPage.placeOrder();
    }

    @Then("The order should be placed successfully")
    public void theOrderShouldBePlacedSuccessfully() throws InterruptedException {

        String successMsgPlacedOrderExpected = "Thank you. Your order has been received.";

        Assert.assertEquals(checkoutPage.getSuccessMsg(), successMsgPlacedOrderExpected);

    }


    @When("I provide the billing details")
    public void iProvideTheBillingDetails(){
        checkoutPage.setBillingDetails(context.billingDetails);




    }


}
