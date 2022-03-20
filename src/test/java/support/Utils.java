package support;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import runner.CucumberTest;

import java.util.Random;


public class Utils extends CucumberTest {

    public void waitElementBePresent(By element, Integer tempo){
        WebDriverWait wait = new WebDriverWait(driver, tempo);
        wait.until(ExpectedConditions.elementToBeClickable(element));

    }
    public String getRandomEmail(){
        String email_init ="tulio";
        String email_Final ="@gmail.com";

        Random randon = new Random();
        int  minimo = 1;
        int maximo = 999999999;
        int resultado = randon.nextInt(maximo-minimo) + minimo;
        return email_init + resultado + email_Final;
    }
}
