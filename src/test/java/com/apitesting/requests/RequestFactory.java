package com.apitesting.requests;

import com.apitesting.pojo.ApitestingClass;
import com.apitesting.tests.TestBase;

import io.qameta.allure.Step;
import io.restassured.response.Response;

import java.util.List;

public class RequestFactory extends TestBase {


  RestClient restClient = new RestClient();

  @Step("Getting all the student information from the database")
  public Response getAllStudents() {

    Response response = restClient.doGetRequest("/list");
    return response;

  }

  @Step("Creating a new student : {0} , {1} , {2} ,{3} , {4}")
  public Response createNewStudent(String url, String firstName, String lastName, String email, String programme, List<String> courses) {

    ApitestingClass body = new ApitestingClass();
    body.setFirstName(firstName);
    body.setLastName(lastName);
    body.setEmail(email);
    body.setProgramme(programme);
    body.setCourses(courses);

    return restClient.doPostRequest(url, body);
  }

  @Step("Updating student information with studentId: {0}, firstName: {1}, lastName: {2}, email: {3}, programme: {4}, courses: {5}")
  public Response updateStudent(int studentid, String firstName, String lastName, String email, String programme, List<String> courses) {

    ApitestingClass student = new ApitestingClass();
    student.setFirstName(firstName);
    student.setLastName(lastName);
    student.setEmail(email);
    student.setProgramme(programme);
    student.setCourses(courses);

    return restClient.doPutRequest("/" + studentid, student);

  }

  @Step("Deleting student info with Id: {0}")
  public Response deleteStudent(int studentId) {

    return restClient.doDeleteRequest("/" + studentId);

  }

  public Response getStudentById(int studentId) {

    return restClient.doGetRequest("/" + studentId);


  }

}
