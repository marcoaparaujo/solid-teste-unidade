// OCP - Open Closed Principle 
// Princípio Aberto/Fechado

package Ocp.refatorado;

public class Html implements Dispositivo {
   
    public String imprimir(String conteudo) {
        return "HTML: " + conteudo;
    }
}
