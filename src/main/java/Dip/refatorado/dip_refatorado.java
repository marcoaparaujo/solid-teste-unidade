// DIP - Dependency Inversion Principle 
// Princípio da Inversão de Dependência

package Dip.refatorado;

public class dip_refatorado {

    public static void main(String args[]) {

        Arquivo arquivo = new Arquivo(new Xml());
        arquivo.setConteudo("texto");
        arquivo.imprimir();
        
    }
}
