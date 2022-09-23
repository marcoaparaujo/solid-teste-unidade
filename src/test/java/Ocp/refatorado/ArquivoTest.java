package Ocp.refatorado;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArquivoTest {

    @Test
    public void deveVerificarDispositivoInexistente() {
        try {
            Arquivo arquivo = new Arquivo("Xml");
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Tipo dispositivo inexistente", e.getMessage());
        }
    }

}