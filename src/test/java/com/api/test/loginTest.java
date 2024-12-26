package com.api.test;

import com.api.base.AuthService;
import com.api.model.request.LoginRequest;
import io.restassured.response.Response;
import com.api.response.LoginResponse;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.post;
@Listeners(com.api.Listeners.TestListeners.class)

public class loginTest {

    AuthService authService=new AuthService();
    @Test(description = "Verify login API works or not")
    public void CheckloginTest(){
    LoginRequest loginTest=new LoginRequest("uday1234","uday1234");
    Response response= authService.Login(loginTest);
        System.out.println(response.statusCode());
    System.out.println(response.asPrettyString());
     LoginResponse loginResponse= response.as(LoginResponse.class);
     System.out.println(loginResponse.getToken());
        Assert.assertNotNull(loginResponse.getToken());

    }
}
