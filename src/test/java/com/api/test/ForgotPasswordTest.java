package com.api.test;

import com.api.base.AuthService;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class ForgotPasswordTest {
    @Test(description = "Forgot Password workflow ")
    public void ForgotPassword(){
        AuthService authService = new AuthService();
        Response response=authService.forgotPassword("nish12@gmail.com");
        System.out.println(response.asPrettyString());
    }
}
