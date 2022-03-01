package executores;

import robos.GaiaRobo;

public class Executora {
    public static void main(String[] args) {
        GaiaRobo umaGaiaRobo = new GaiaRobo();


        umaGaiaRobo.acessarSiteChamado("http://www.google.com.br");
        umaGaiaRobo.fazerLogin("julio", "1234");
        GaiaRobo umaOutraGaiaRobo = new GaiaRobo();
        umaOutraGaiaRobo.acessarSiteChamado("http://www.juliodelima.com.br/taksit");



    }

}
