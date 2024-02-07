package stepsDefinitions;

import constants.EndPoints;
import context.TestContext;
import domainObjects.BillingDetails;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

import pages.PageFactoryManager;
import pages.StorePage;



public class CustomerStepDefinitions {



    private final TestContext context;
    private final StorePage storePage;



   public CustomerStepDefinitions(TestContext context){
       this.context = context;
       storePage = PageFactoryManager.getStorePage(context.driver);


    }
//
//    @When("I provide the billing details")
//    public void iProvideTheBillingDetails(List<Map<String, String>> billingDetails){
//
//
//        checkoutPage.setBillingDetails(billingDetails.get(0).get("firstName"),
//                billingDetails.get(0).get("lastName"),
//                billingDetails.get(0).get("companyName"),
//                billingDetails.get(0).get("countryName"),
//                billingDetails.get(0).get("streetAddressLine1"),
//                billingDetails.get(0).get("streetAddressLine2"),
//                billingDetails.get(0).get("cityName"),
//                billingDetails.get(0).get("stateName"),
//                billingDetails.get(0).get("zipCode"),
//                billingDetails.get(0).get("phoneNumber"),
//                billingDetails.get(0).get("emailID")
//        );
//
//
//    }



    @Given("I'm a quest customer")
    public void iMAQuestCustomer() {
//        driver = DriverFactory.getDriver();
        storePage.load(EndPoints.STORE.url);

    }


    @And("my billing details are")
    public void myBillingDetailsAre(BillingDetails billingDetails) {
        context.billingDetails = billingDetails;
    }
}
