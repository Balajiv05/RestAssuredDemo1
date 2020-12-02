package com.infy;

import static io.restassured.RestAssured.given;
import org.testng.annotations.Test;

public class CreateAzureCust {
	
	@Test
	void createCust()
	{
		{
			given()
			.pathParam("org", "9049571350")
			.pathParam("azure_csp_partner", "Balaji").log().all()
			.when().get("https://reference.rightscale.com/cost_management/#/AzureCSPCustomers/AzureCSPCustomers_create/orgs/{org}/azure_csp_partners/{azure_csp_partner}/customers")
			.then().statusCode(200);
		}

		
	}

}
