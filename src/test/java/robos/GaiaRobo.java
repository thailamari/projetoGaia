package robos;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class GaiaRobo {

    public ChromeDriver thailaDriver;

    public GaiaRobo(){
        //O que estiver aqui será executado no new GaiaRobo
        WebDriverManager.chromedriver().setup();
        thailaDriver  = new ChromeDriver();
    }


    public void acessarSiteChamado(String site){
        thailaDriver.get(site);
    }

    public String pegarOTituloDaPagina(){
        return thailaDriver.getTitle();
    }

    public void fazerLogin(String login, String senha){

    }

    public void lancarNota(){

    }

}
