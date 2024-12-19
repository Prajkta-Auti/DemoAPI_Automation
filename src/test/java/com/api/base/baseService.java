package com.api.base;

import com.api.model.request.LoginRequest;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class baseService {
    private  static final String BASEURI="https://dummyjson.com";
    private RequestSpecification requestSpecification;
    public baseService(){
        requestSpecification= RestAssured.given().baseUri(BASEURI);
    }
    protected Response postRequest(Object payload, String endpoint){
        return requestSpecification.contentType(ContentType.JSON).body(payload).post(endpoint);
    }
}
