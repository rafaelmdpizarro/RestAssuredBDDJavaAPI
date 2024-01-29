package stepdefinition;

import requests.ViewUsers;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class ViewSingleUserStepdefinition {

    ViewUsers viewUsersRequest = new ViewUsers();
    Response response;

    @Quando("e realizado a solicitacao e enviada para o endpoint GET SINGLE USER {int}")
    public void e_realizado_a_solicitacao_e_enviada_para_o_endpoint_get_single_user(Integer int1) {
        response = viewUsersRequest.GETSingleUsers(int1);
    }

    @Entao("o sistema deve retornar o statuscode {int} e os detalhes do usuario")
    public void o_sistema_deve_retornar_o_statuscode_e_os_detalhes_do_usuario(Integer int1) {
        response.then().log().all()
                .statusCode(int1)
                .body(JsonSchemaValidator.matchesJsonSchemaInClasspath("singleUserSchema.json"));
    }
}