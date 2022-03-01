package executores;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import robos.GaiaRobo;

public class PaginaInicialTest {

    @Test
    @DisplayName("Testando a Página Inicial")
    public void validarTituloDaPagina(){
        GaiaRobo gaiaTiaDoJonas = new GaiaRobo();

        gaiaTiaDoJonas.acessarSiteChamadoTaskit();
        String tituloDaPagina = gaiaTiaDoJonas.pegarOTituloDaPagina();
        Assertions.assertEquals("Task it!",tituloDaPagina);

        gaiaTiaDoJonas.acessarSiteChamadoGoogle();

    }

    @Test
    @DisplayName("Validar Campo na Tela")
    public void validarCampoNaTela(){

    }
}
