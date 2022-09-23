// ISP - Interface Segregation Principle 
// Princípio da Segregação de Interface

package Isp.refatorado;

public class Arquivo {

    private String conteudo;
    private String dispositivo;

    public Arquivo(String nomeDispositivo) {
        this.dispositivo = nomeDispositivo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public void imprimir() {
        if (this.dispositivo.equals("Pdf")) {
            Pdf pdf = new Pdf();
            pdf.imprimir(this.conteudo);
        } else {
            if (this.dispositivo.equals("Html")) {
                Html html = new Html();
                html.imprimir(this.conteudo);
            } else {
                if (this.dispositivo.equals("Email")) {
                    Email email = new Email();
                    email.configurar("");
                    email.imprimir(this.conteudo);
                }
            }
        }
    }
}
