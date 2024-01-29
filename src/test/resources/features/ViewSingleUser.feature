# language: pt
Funcionalidade: Validar o metodo GET SINGLE USER
  Cenario: Recuperar detalhes de um usuario especifico
    Dado que possua usuarios cadastrados
    Quando e realizado a solicitacao e enviada para o endpoint GET SINGLE USER 2
    Entao o sistema deve retornar o statuscode 200 e os detalhes do usuario