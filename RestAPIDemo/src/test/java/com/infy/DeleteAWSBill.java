package com.infy;

import static io.restassured.RestAssured.given;
import org.testng.annotations.Test;

public class DeleteAWSBill {
	
	@Test
	void deleteAWSBill()
	{
		{
			given()
			.pathParam("org", "90495713501")
			.pathParam("azure_csp_partner", "Balaji")
			.pathParam("id", "9049").log().all()
			.when().get("https://reference.rightscale.com/cost_management/#/AzureCSPCustomers/AzureCSPCustomers_delete/orgs/{org}/azure_csp_partners/{azure_csp_partner}/customers/{id}")
			.then().statusCode(200);
		}

		
	}

}
