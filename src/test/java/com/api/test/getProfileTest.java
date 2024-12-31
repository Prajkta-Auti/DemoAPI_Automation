package com.api.test;

import com.api.base.AuthService;
import com.api.base.UserProfileManagementService;
import com.api.model.request.LoginRequest;
import io.restassured.response.Response;
import com.api.response.LoginResponse;
import com.api.response.UserProfileResponse;
import org.testng.annotations.Test;

public class getProfileTest {
    @Test(description = "Get profile details ")
    public void getProfile(){
        AuthService authService =new AuthService();
        LoginRequest loginTest=new LoginRequest("uday1234","uday1234");
        Response response= authService.Login(loginTest);
         LoginResponse loginResponse= response.as(LoginResponse.class);
        loginResponse.getToken();
        UserProfileManagementService userProfileManagementService =new UserProfileManagementService();
        response=userProfileManagementService.getProfile(loginResponse.getToken());
       System.out.println(response.asPrettyString());
        UserProfileResponse userProfileResponse=response.as(UserProfileResponse.class);
        System.out.println(userProfileResponse.getFirstName());

    }
}
