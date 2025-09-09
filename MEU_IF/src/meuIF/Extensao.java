package meuIF;

public class Extensao extends Projeto {
    public Extensao(String titulo, String descricao) {
        super(titulo, descricao);
    }

    @Override
    public void exibirProjeto() {
        System.out.println("\n🌍 Projeto de Extensão: " + titulo + " | " + descricao);
        for (Pessoa p : participantes) {
            p.exibirInfo();
        }
    }
}
