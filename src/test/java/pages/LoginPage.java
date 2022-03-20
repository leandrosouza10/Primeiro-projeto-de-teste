package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import support.Utils;

public class LoginPage extends Utils {

    WebDriver driver;
    private By create_email_field = By.id("email_create");
    private By create_email_button = By.id("SubmitCreate");


    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    public void acessarTelaLogin(){
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        waitElementBePresent(create_email_field,20);
    }
    public void preencherCampoEmail(){
    driver.findElement(create_email_field ).sendKeys(getRandomEmail());

    }
    public void clicarCriarConta(){
        driver.findElement(create_email_button).click();

    }

}
