# Testes-Junit-Selenium-
Repositório que serve como contêiner de projetos de estudos baseados em Junit - Selenium

LEIA COM ATENÇÃO!

Nas classes com *Validation* trocar os campos de E-MAIL e SENHA corretos para que o teste seja executado com êxito!

Para rodar a classe que contém os testes, basta clicar com o botão direito do mouse na classe (que tem a notação @Test), ir em RUN AS, e depois, Junit Test.

Como o Github limita o upload de arquivos com menos de 25 mb, tive que colocar os plugins em uma pasta avulsa (drivers Selenium), basta baixá-los e colocá-los na pasta src/main/resources do projeto


-----------------------------------------------------------------------------------------------------------------------------------
PARA CRIAR QUALQUER PROJETO DE TESTES, É ACONSELHÁVEL CRIAR OS PACOTES:

- br.com.nomeDoProjeto.commom
(que conterá as classes das páginas com os locators e selectors, junto com as classes de suporte do projeto);

- br.com.nomeDoProjeto.test
(que conterá as classes de BaseTestCase - indispensável em qualquer projeto - e as classes de validação, por exemplo, das páginas mapeadas no pacote ...commom);

- br.com.nomeDoProjeto.test.suite
(que conterá a classe AllTests - indispensável a qualquer projeto -, que será responsável por indicar uma @BeforeClass e uma @AfterClass).
