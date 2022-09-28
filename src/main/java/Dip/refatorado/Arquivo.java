// DIP - Dependency Inversion Principle 
// Princípio da Inversão de Dependência

package Dip.refatorado;

public class Arquivo {
    private String conteudo;
    private Formato dispositivo;
    
    public Arquivo(Formato dispositivo) {
        if (dispositivo == null) {
            throw new NullPointerException("Dispositivo invalido");
        }
        this.dispositivo = dispositivo;
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
