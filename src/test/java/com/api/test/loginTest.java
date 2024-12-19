package com.api.test;

import com.api.base.AuthService;
import com.api.model.request.LoginRequest;
import io.restassured.response.Response;
import model.response.LoginResponse;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.post;
@Test
public class loginTest {

    AuthService authService=new AuthService();
    @Test(description = "Verify login API works or not")
    public void CheckloginTest(){
    LoginRequest loginTest=new LoginRequest("emilys","emilyspass");
    Response response= authService.Login(loginTest);
        System.out.println(response.statusCode());
    System.out.println(response.asPrettyString());
        LoginResponse loginResponse= response.as(LoginResponse.class);
        System.out.println(loginResponse.getAccessToken());
//    Response response=
//    RestAssured.given().baseUri("https://dummyjson.com/").header("Content-Type","application/json").body("{\"username\":\"emilys\",\"password\":\"emilyspass\"}").post("auth/login");
//    Assert.assertEquals(response.statusCode(),200);
//    System.out.println(response.asPrettyString());

    }
}
