package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import support.Utils;

// MAPEANDO O CADASTRO DE FORMULÁRIO
public class CadastroPage extends Utils {

    WebDriver driver;

    private By titleM = By.id("id_gender1");
    private By titleF = By.id("id_gender2");
    private By firstNameField = By.id("customer_firstname");
    private By lastNameField = By.id("customer_lastname");
    private By passwordField = By.id("passwd");

    private By select_day = By.id("days");
    private By select_month = By.id("months");
    private By select_year = By.id("years");

    private By address_field = By.id("address1");
    private By city = By.id("city");
    private By state = By.id("id_state");
    private By postal_code = By.id("postcode");
    private By mobile_phone = By.id("phone_mobile");
    private By register = By.id("submitAccount");



    public CadastroPage(WebDriver driver) {
        this.driver = driver;

    }
    public void selectTitle(Integer type){
        waitElementBePresent(titleM,35);
        if(type == 1){
           driver.findElement(titleM).click();
        }else if(type == 2){
            driver.findElement(titleF ).click();
        }
    }
    public void firstName(String firstName){ //primeiro nome
        driver.findElement(firstNameField).sendKeys(firstName);
    }
    public void lastName(String lastName){ // segundo nome
        driver.findElement(lastNameField).sendKeys(lastName);
    }
    public void password(String password){ // senha
        driver.findElement(passwordField).sendKeys(password);
    }

    // Dia,mês e ano do aniversário
    public void dateOfBirth(Integer day,Integer month,String year){
        Select selectDay = new Select(driver.findElement(select_day));
        selectDay.selectByIndex(day);

        Select selectMonth = new Select(driver.findElement(select_month));
        selectMonth.selectByIndex(month);

        Select selectYear = new Select(driver.findElement(select_year));
        selectYear.selectByValue(year);
    }

    public void fillInAddress(String address){
        driver.findElement(address_field).sendKeys(address);
    }
    public void fillInCity(String cityOn){
        driver.findElement(city).sendKeys(cityOn);
    }
    public void fillInState(String stateOn){
        Select selectStateOn = new Select(driver.findElement(state));
        selectStateOn.selectByVisibleText(stateOn);
    }
    public void fillInPostalCode(String postal){
        driver.findElement(postal_code).sendKeys(postal);
    }

    public void fillInMobilePhone(String phone){
        driver.findElement(mobile_phone).sendKeys(phone);
    }


    public void submitButton(){
        driver.findElement(register).click();
    }
    public void validatesRegistration(String nome, String sobreNome){
        waitElementBePresent(By.className("button-search"),20);
        String resultado_atual = driver.findElement(By.cssSelector("#header > div.nav > div > div > nav > div:nth-child(1) > a > span")).getText();
        Assert.assertEquals(nome + "" + sobreNome,resultado_atual);
    }

}
