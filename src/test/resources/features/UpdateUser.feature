# language: pt
Funcionalidade: Validar o metodo PATCH para alterar um usuario
  Cenario: Alterar um usuario
    Dado que um usuario deseja alterar um usuario
    Quando e realizado a solicitacao e enviada para o endpoint PATCH USERS 2
    Entao o codigo de status da resposta deve ser 200 e o corpo da resposta deve conter os detalhes do usuario recem-alterado