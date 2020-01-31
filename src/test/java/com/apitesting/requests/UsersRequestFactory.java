package com.apitesting.requests;

import com.apitesting.tests.TestBase;

import io.qameta.allure.Step;
import io.restassured.response.Response;

public class UsersRequestFactory extends TestBase {

  RestClient restClient = new RestClient();

  @Step("Getting User Me from Backend")
  public Response getUsersMe() {
    return restClient.doGetRequest("/v1/users/me?queryParams=undefined");
  }

}
