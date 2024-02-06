package customTypes;

import domainObjects.BillingDetails;
import io.cucumber.java.DataTableType;

import java.util.Map;

public class CustomDataTableType {


    @DataTableType
    public BillingDetails billingDetailsEntry(Map<String, String> entry){
        return new BillingDetails(entry.get("firstName"),
                entry.get("lastName"),
                entry.get("companyName"),
                entry.get("countryName"),
                entry.get("streetAddressLine1"),
                entry.get("streetAddressLine2"),
                entry.get("cityName"),
                entry.get("stateName"),
                entry.get("zipCode"),
                entry.get("phoneNumber"),
                entry.get("emailID"));
    }


}
