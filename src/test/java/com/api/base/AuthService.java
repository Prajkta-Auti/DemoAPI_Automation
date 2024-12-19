package com.api.base;

import com.api.model.request.LoginRequest;
import io.restassured.response.Response;

public class AuthService extends baseService{
    public Response Login(Object payload){
        return postRequest(payload,"auth/login");

    }

}
