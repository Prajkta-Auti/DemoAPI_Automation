package com.api.test;

import com.api.base.AuthService;
import com.api.model.request.signupRequest;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(com.api.Listeners.TestListeners.class)
public class AccountCreationTest {


    @Test
    public void createAccountTest() {
        signupRequest signupReq = new signupRequest.Builder().username("Nisha1234").email("nish12@gmail.com").firstName("nisha").Password("Nisha123").lastName("parmer").mobileNumber("9944556667").build();
        AuthService authService = new AuthService();
        Response response=authService.Signup(signupReq);
        System.out.println(response.asPrettyString());
        Assert.assertEquals(response.asPrettyString(),"User registered successfully!");
    }
}
