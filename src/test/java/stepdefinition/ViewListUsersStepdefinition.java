package stepdefinition;

import requests.ViewUsers;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;

public class ViewListUsersStepdefinition {
	ViewUsers viewUsersRequest = new ViewUsers();
	Response response;

	@Dado("que possua usuarios cadastrados")
	public void que_possua_usuarios_cadastrados() {
	}

	@Quando("e realizado a solicitacao e enviada para o endpoint GET LIST USERS")
	public void e_realizado_a_solicitacao_e_enviada_para_o_endpoint_get_list_users() {
		response = viewUsersRequest.GETListUsers();
	}
	@Entao("o sistema deve retornar o statuscode {int} e os detalhes de todos os usuarios")
	public void o_sistema_deve_retornar_o_statuscode_e_os_detalhes_de_todos_os_usuarios(Integer int1) {
		response.then().log().all()
				.statusCode(int1)
				.body(JsonSchemaValidator.matchesJsonSchemaInClasspath("listUsersSchema.json"));
	}

}