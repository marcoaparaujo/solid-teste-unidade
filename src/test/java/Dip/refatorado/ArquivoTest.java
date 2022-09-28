package Dip.refatorado;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArquivoTest {

    @Test
    public void deveImprimirFormatoPdf() {
        Arquivo arquivo = new Arquivo(new Pdf());
        arquivo.setConteudo("texto");
        assertEquals("PDF: texto", arquivo.imprimir());
    }

    @Test
    public void deveImprimirFormatoHtml() {
        Arquivo arquivo = new Arquivo(new Html());
        arquivo.setConteudo("texto");
        assertEquals("HTML: texto", arquivo.imprimir());
    }

    @Test
    public void deveImprimirFormatoXml() {
        Arquivo arquivo = new Arquivo(new Xml());
        arquivo.setConteudo("texto");
        assertEquals("XML: texto", arquivo.imprimir());
    }

    @Test
    public void deveVerificarDispositivoNulo() {
        try {
            Arquivo arquivo = new Arquivo(null);
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Dispositivo invalido", e.getMessage());
        }
    }

}