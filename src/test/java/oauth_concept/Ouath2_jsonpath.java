package oauth_concept;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.testng.annotations.Test;


import static io.restassured.RestAssured.given;

public class Ouath2_jsonpath {
    @Test
    public void getAccessToken() {
   RestAssured.baseURI="https://rahulshettyacademy.com/oauthapi/oauth2/resourceOwner/token";
      String stringResponse=  given().formParam("scope","trust")
                .formParam("grant_type","client_credentials")
                .formParam("client_secret","erZOWM9g3UtwNRj340YYaK_W")
                .formParam("client_id","692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com")
                .when().post().asString();
        System.out.println(stringResponse);
        JsonPath response = new JsonPath(stringResponse);
        String accessToken=response.getString("access_token");
//passing the Access token to another request
        System.out.println(  given().queryParam("access_token",accessToken)
                .when().get("https://rahulshettyacademy.com/oauthapi/getCourseDetails")
                .asString());
    }








}
