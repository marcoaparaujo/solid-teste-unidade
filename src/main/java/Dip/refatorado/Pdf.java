// DIP - Dependency Inversion Principle 
// Princípio da Inversão de Dependência

package Dip.refatorado;

public class Pdf implements Formato {

    public String imprimir(String conteudo) {
        return "PDF: " + conteudo;
    }
}
