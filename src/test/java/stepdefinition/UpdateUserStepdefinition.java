package stepdefinition;

import com.github.javafaker.Faker;
import model.UserDTO;
import requests.UpdateUser;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;

public class UpdateUserStepdefinition {

    UpdateUser updateUserRequest = new UpdateUser();
    Response response;
    static Faker faker = new Faker();

    @Dado("que um usuario deseja alterar um usuario")
    public void que_um_usuario_deseja_alterar_um_usuario() {
    }

    @Quando("e realizado a solicitacao e enviada para o endpoint PATCH USERS {int}")
    public void e_realizado_a_solicitacao_e_enviada_para_o_endpoint_patch_users(Integer int1) {
        response = updateUserRequest.PatchtUser(UserDTO.builder().name(faker.name().firstName().toLowerCase()).job(faker.job().title().toLowerCase()).build(), int1);
    }
    @Entao("o codigo de status da resposta deve ser {int} e o corpo da resposta deve conter os detalhes do usuario recem-alterado")
    public void o_codigo_de_status_da_resposta_deve_ser_e_o_corpo_da_resposta_deve_conter_os_detalhes_do_usuario_recem_alterado(Integer int1) {
        response.then().log().all()
                .statusCode(int1)
                .body(JsonSchemaValidator.matchesJsonSchemaInClasspath("patchUserSchema.json"));
    }

}