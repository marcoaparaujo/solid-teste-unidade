// DIP - Dependency Inversion Principle 
// Princípio da Inversão de Dependência

package Dip.refatorado;

public class Html implements Formato {
   
    public String imprimir(String conteudo) {
        return "HTML: " + conteudo;
    }
}
