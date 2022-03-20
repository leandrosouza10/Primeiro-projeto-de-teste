package steps;

import cucumber.api.java.es.Dado;
import pages.LoginPage;
import runner.CucumberTest;

// LOGIN DO USUÁRIO
public class LoginSteps extends CucumberTest {

    LoginPage loginPage =  new LoginPage(driver);

    @Dado("^que estou na tela de login$")
    public void que_estou_na_tela_de_login()  {
        loginPage.acessarTelaLogin();

    }

    @Dado("^acesso o cadastro de usuário$")
    public void acesso_o_cadastro_de_usuário() {
        loginPage.preencherCampoEmail();
        loginPage.clicarCriarConta();

    }
}
