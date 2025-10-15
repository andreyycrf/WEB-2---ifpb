package meuIF;

public class Aula {
    private String data;
    private String conteudo;

    public Aula(String data, String conteudo) {
        this.data = data;
        this.conteudo = conteudo;
    }

    public void exibirAula() {
        System.out.println("📚 Aula em " + data + " | Conteúdo: " + conteudo);
    }
}
