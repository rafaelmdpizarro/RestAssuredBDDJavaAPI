package requests;
import io.restassured.response.Response;
import model.UserDTO;

import static io.restassured.RestAssured.given;

public class UpdateUser {

    private final String PATH_PATCH_USER= "/users/";

    public Response PatchtUser(UserDTO body, int id){

        return given()
                .log().all()
                .body(body)
                .when()
                .patch(PATH_PATCH_USER + id);
    }

}
