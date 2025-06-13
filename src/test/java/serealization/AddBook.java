package serealization;

import io.restassured.RestAssured;
import io.restassured.mapper.ObjectMapper;
import org.testng.annotations.Test;
import serealization.pojo_classes.RequestPojo;

import static io.restassured.RestAssured.given;

public class AddBook {

    @Test
    public void addBook(){
RequestPojo reqBody=new RequestPojo();
RestAssured.baseURI="https://rahulshettyacademy.com";
        given().queryParam("key","qa123")
                .body(reqBody).log().all()
                .when().log().all().post("/maps/api/place/add/json");







    }





}
