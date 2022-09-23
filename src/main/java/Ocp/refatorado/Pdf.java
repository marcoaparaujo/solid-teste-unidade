// OCP - Open Closed Principle 
// Princípio Aberto/Fechado

package Ocp.refatorado;

public class Pdf implements Dispositivo {

    public String imprimir(String conteudo) {
        return "PDF: " + conteudo;
    }
}
