package oauth_concept;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.testng.annotations.Test;
import oauth_pojo_classes.ResponsePojo;
import oauth_pojo_classes.WebAutomation;

import java.util.List;

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
        System.out.println( res.getServices());
//operation on the json response
        //get the  data for the response
        System.out.println(res.getLinkedIn());
        System.out.println(res.getCourses().getApi().get(2).getCourseTitle());
        // printing all webAutomation titles
       List<WebAutomation> webAu =res.getCourses().getWebAutomation();
       for(int i=0;i< webAu.size();i++){
           System.out.println( webAu.get(i).getCourseTitle());


       }
    }
}
