package Ocp.refatorado;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PdfTest {

    @Test
    public void deveRetornarSucesso() {
        Arquivo arquivo = new Arquivo("Pdf");
        arquivo.setConteudo("texto");
        assertEquals("PDF: texto", arquivo.imprimir());
    }

}