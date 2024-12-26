package com.api.base;

import com.api.filters.LoggingFilter;
import com.api.model.request.LoginRequest;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class baseService {
    private  static final String BASEURI="http://64.227.160.186:8080/";
    private RequestSpecification requestSpecification;
    {
        RestAssured.filters(new LoggingFilter());
    }
    public baseService(){
        requestSpecification= RestAssured.given().baseUri(BASEURI);
    }
    protected Response postRequest(Object payload, String endpoint){
        return requestSpecification.contentType(ContentType.JSON).body(payload).post(endpoint);
    }
    protected Response postRequest(String baseurl, Object payload, String endpoint){
        return requestSpecification.baseUri(baseurl).contentType(ContentType.JSON).body(payload).post(endpoint);
    }
    protected Response getRequest( String endpoint){
        return requestSpecification.get(endpoint);
    }
    protected void setToken(String token){
        requestSpecification.header("Authorization","Bearer "+token);
    }

    protected Response putRequest(Object payload, String endpoint){
        return requestSpecification.contentType(ContentType.JSON).body(payload).put(endpoint);
    }
}
