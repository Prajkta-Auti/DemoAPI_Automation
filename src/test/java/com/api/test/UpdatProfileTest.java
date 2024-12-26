package com.api.test;

import com.api.base.AuthService;
import com.api.base.UserProfileManagementService;
import com.api.model.request.LoginRequest;
import com.api.model.request.ProfileRequest;
import io.restassured.response.Response;
import com.api.response.LoginResponse;
import org.testng.annotations.Test;

public class UpdatProfileTest {
    @Test(description = "Verify update profile in API")
    public void updateProfile() {
        AuthService authService = new AuthService();
        LoginRequest loginTest = new LoginRequest("uday1234", "uday1234");
        Response response = authService.Login(loginTest);
        LoginResponse loginResponse = response.as(LoginResponse.class);
        UserProfileManagementService userProfileManagementService = new UserProfileManagementService();
        //response= userProfileManagementService.getProfile(loginResponse.getToken());
        ProfileRequest profileRequest =new ProfileRequest.Builder().email("rish@gmail.com").lastName("bhat").firstName("risha").mobileNumber("9422754747").build();
        response= userProfileManagementService.updateProfile(profileRequest,loginResponse.getToken());
        System.out.println(response.asPrettyString());
        System.out.println(response.statusCode());

    }



}
