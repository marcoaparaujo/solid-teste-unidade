package Ocp.refatorado;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JsonTest {

    @Test
    public void deveVerificarDispositivoInvalido() {
        try {
            Arquivo arquivo = new Arquivo("Json");
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Tipo dispositivo invalido", e.getMessage());
        }
    }
}