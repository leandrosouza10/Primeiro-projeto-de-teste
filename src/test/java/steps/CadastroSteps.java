package steps;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pages.CadastroPage;
import runner.CucumberTest;

// PARTE DO CADASTRO
public class CadastroSteps extends CucumberTest {

    CadastroPage cadastroPage = new CadastroPage(driver);

    String nome = "Manuel";
    String sobreNome= " Pereira";

    @Quando("^eu preencho o formulário de cadastro$")
    public void preencho_todos_os_campos_solicitados()  {
    cadastroPage.selectTitle(1);
    cadastroPage.firstName(nome);
    cadastroPage.lastName(sobreNome);
    cadastroPage.password("radakbcjhabc1255");
    cadastroPage.dateOfBirth(2,7,"1984");
    cadastroPage.fillInAddress("Rua Rodrigo Vietri,nº 123");
    cadastroPage.fillInCity("Denver");
    cadastroPage.fillInState("Colorado");
    cadastroPage.fillInPostalCode("04210");
    cadastroPage.fillInMobilePhone("+55 11 999999999");
    }

    @Quando("^clico em registrar$")
    public void clico_em_registrar() {
        cadastroPage.submitButton();
    }

    @Entao("^vejo cadastro realizado com sucesso$")
    public void vejo_cadastro_realizado_com_sucesso(){
        cadastroPage.validatesRegistration(nome,sobreNome);
    }
}
