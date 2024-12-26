package com.api.base;

import com.api.model.request.LoginRequest;
import io.restassured.response.Response;

import java.util.HashMap;

public class AuthService extends baseService{
    public Response Login(Object payload){
        return postRequest(payload,"api/auth/login");
    }
    public Response Signup(Object payload){
        return postRequest(payload,"api/auth/signup");
    }
    public Response forgotPassword(String email){
        HashMap<String, String>payload= new HashMap<String,String>();
        payload.put("email",email);
        return postRequest(payload,"api/auth/forgot-password");

    }
}
