// OCP - Open Closed Principle 
// Princípio Aberto/Fechado

package Ocp.original;

public class ocp_original {

    public static void main(String args[]) {
        
        Arquivo arquivo = new Arquivo ("Html");
        arquivo.setConteudo("texto");
        arquivo.imprimir();
        
    }
}
