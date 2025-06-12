package org.example;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.testng.annotations.Test;
import pojo.classes.ResponsePojo;

import static io.restassured.RestAssured.given;

public class Outh2_Pojo {
    String Access_token;

    @Test
    public void getAccessToken() {
        RestAssured.baseURI = "https://rahulshettyacademy.com/oauthapi/oauth2/resourceOwner/token";
        String response = given().formParam("client_id", "692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com")
                .formParam("client_secret", "erZOWM9g3UtwNRj340YYaK_W")
                .formParam("grant_type", "client_credentials")
                .formParam("scope", "trust")
                .when().post().asString();
        JsonPath js = new JsonPath(response);
        Access_token = js.getString("access_token");
    }

    @Test
    public void getDta() {
        RestAssured.baseURI = "https://rahulshettyacademy.com";
        ResponsePojo res = given().queryParam("access_token", Access_token)
                .when().log().all().get("/oauthapi/getCourseDetails")
                .as(ResponsePojo.class);
        res.getServices();


    }
}
