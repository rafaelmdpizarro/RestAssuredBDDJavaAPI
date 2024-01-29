# language: pt
@GetList
Funcionalidade: Validar o metodo GET LIST USERS
  Cenario: Recuperar detalhes de um usuario especifico
    Dado que possua usuarios cadastrados
    Quando e realizado a solicitacao e enviada para o endpoint GET LIST USERS
    Entao o sistema deve retornar o statuscode 200 e os detalhes de todos os usuarios