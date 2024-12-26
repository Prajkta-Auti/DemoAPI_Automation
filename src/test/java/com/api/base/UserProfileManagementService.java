package com.api.base;

import com.api.model.request.ProfileRequest;
import io.restassured.response.Response;

public class UserProfileManagementService extends baseService{
    public Response getProfile(String token){
        setToken(token);
        return getRequest("api/users/profile");
    }
    public Response updateProfile(ProfileRequest payload, String token){
        setToken(token);
        return putRequest(payload,"api/users/profile");
    }

}
