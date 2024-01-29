package requests;
import io.restassured.response.Response;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class ViewUsers {

    private final String PATH_GET_LIST_USERS= "/users";

    private final String PATH_GET_SINGLE_USER= "/users/";

    public Response GETListUsers(){

        return given()
                .log().all()
                .when()
                .get(PATH_GET_LIST_USERS);
    }

    public Response GETSingleUsers(int id){

        return given()
                .log().all()
                .when()
                .get(PATH_GET_SINGLE_USER + id);
    }

}
