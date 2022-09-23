// OCP - Open Closed Principle 
// Princípio Aberto/Fechado

package Ocp.refatorado;

public class Arquivo {

    private String conteudo;
    private Dispositivo dispositivo;

    public Arquivo(String nomeDispositivo) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("Ocp.refatorado." + nomeDispositivo);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new NullPointerException("Tipo dispositivo inexistente");
        }
        if (!(objeto instanceof Dispositivo)) {
           throw new NullPointerException("Tipo dispositivo invalido");
        }
        this.dispositivo = (Dispositivo) objeto;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public String imprimir() {
        return this.dispositivo.imprimir(conteudo);
    }

}
