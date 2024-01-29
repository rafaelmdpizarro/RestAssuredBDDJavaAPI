package requests;
import io.restassured.response.Response;
import model.UserDTO;

import static io.restassured.RestAssured.given;

public class CreateUser {

    private final String PATH_POST_USERS= "/users";

    public Response PostUser(UserDTO body){

        return given()
                .log().all()
                .body(body)
                .when()
                .post(PATH_POST_USERS);
    }

}