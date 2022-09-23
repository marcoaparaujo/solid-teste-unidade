// OCP - Open Closed Principle 
// Princípio Aberto/Fechado

package Ocp.refatorado;

public class Email implements Dispositivo {
   
    public String imprimir(String conteudo) {
        return "E-mail: " + conteudo;
    }
}