
Desafio

API (Rest Assured - BDD - Cucumber): Desenvolva uma automação de testes para a API cuja documentação está descrita no site (https://reqres.in/).

O projeto deve conter ao menos um cenário para cada um dos seguintes métodos do endpoint USERS:
2.1 - Validar o método POST
2.2 - Validar o método GET SINGLE USER

CENÁRIOS BÔNUS:
2.3 - Valide o método GET LIST USERS
2.4 - Valide o método PATCH

Como executar o projeto:
Importar na IDE de preferencia o projeto como maven java
Abrir o arquivo \src\test\java\TestRunner\TestRunner.java e executar.

Arquitetura do Projeto
Pacotes:

•src/main/resources: Onde são armazenados os schemas do response em formato Json. 

•src/test/java/Data: Classes responsaveis pela criação (Posts). 

•src/test/java/DTO: Classes que possui atributos que correspondem aos dados. 

•src/test/java/Helpers: Classes responsaveis por gerenciar os testes. BaseTest, gerenciamento do relatorio e funções uteis. 

•src/test/java/Requests: Classes responsaveis por realizar as requests. 

•src/test/java/TestRunner: Pacote responsavel pela parte das classes de execuções. 

•src/test/java/TestRunner: Pacote responsavel para guardar todas as classes que contenham metodos que possam ser usadas por varios métodos ou classes.

•src/test/java/TestRunner: Pacote responsavel para guardar as Classes de Steps, as quais são geradas pelo cucumber. Nessas classes são chamadas as ações das paginas através das pages e validações.

•src/test/resources/features: Diretório responsável para guardar os arquivos .feature, onde estão gravados os arquivos relacionados ao cucumber e as escrita em gherkin

•target\HtmlReport.html: Após a execução será criado um relatório de execução de testes no repositório 'target'

Libs utilizadas

Cucumber: Dependencia responsável pela leitura dos arquivos .feature escritos em gherkin e realizacao da conversao em metodos.
Maven: Responsavel por gerenciar as dependencias utilizadas no projeto.

Bibliotescas utilizadas:

selenium-java (Versão: 4.11)

cucumber-junit

cucumber-junit

testng

faker