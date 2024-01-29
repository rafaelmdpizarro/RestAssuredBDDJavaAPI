# language: pt
Funcionalidade: Validar o metodo POST para adicionar um novo usuario
  Cenario: Adicionar um novo usuario
    Dado que um usuario deseja adicionar um novo usuario
    Quando e realizado a solicitacao e enviada para o endpoint POST USERS
    Entao o codigo de status da resposta deve ser 201 e o corpo da resposta deve conter os detalhes do usuario recem-adicionado