package com.apitesting.tests;

import static org.hamcrest.CoreMatchers.equalTo;

import com.apitesting.requests.UsersRequestFactory;
import com.apitesting.specs.SpecificationFactory;
import com.apitesting.tags.Smoke;

import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import io.qameta.allure.junit4.DisplayName;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.ResponseSpecification;

import org.junit.Test;
import org.junit.experimental.categories.Category;


@Story("This is a Users API testing story")
public class UsersApiTest extends TestBase {


  UsersRequestFactory requests = new UsersRequestFactory();

  @Category(Smoke.class)
  @Story("This is a Users ME testing story")
  @DisplayName("This a test to get users me from the backend")
  @Feature("Users-API")
  @Test
  public void call_users_api_when_using_ME_account_with_sucess() {
    requests.getUsersMe().then().spec(SpecificationFactory.getGenericResponseSpec()).statusCode(200);
  }

  @Category(Smoke.class)
  @Story("This is a Users ME testing story")
  @DisplayName("This a test to get users me given name is Grace")
  @Feature("Users-API")
  @Test
  public void call_users_api_when_using_ME_when_givenName_is_Grace() {

    ResponseSpecification responseSpec = new ResponseSpecBuilder().expectStatusCode(200).build();
    requests.getUsersMe().then().spec(responseSpec).body("givenName", equalTo("Grace"));
  }

  // @Category(Smoke.class)
  // @Story("This is a Users ME testing story")
  // @DisplayName("This a test to get users me from the backend")
  // @Feature("Users-API")
  // @Test
  // public void call_users_api_when_using_ME_when_givenName_is_not_Grace() {
  //
  // ResponseSpecification responseSpec = new ResponseSpecBuilder().expectStatusCode(200).build();
  // requests.getUsersMe().then().spec(responseSpec).body("givenName", equalTo("Dong"));
  // }

}
