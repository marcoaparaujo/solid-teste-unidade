package Ocp.refatorado;

public class Doc implements Dispositivo{

    @Override
    public String imprimir(String conteudo) {
        return "Doc: " + conteudo;
    }
}
