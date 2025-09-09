package meuIF;

public class Pesquisa extends Projeto {
    public Pesquisa(String titulo, String descricao) {
        super(titulo, descricao);
    }

    @Override
    public void exibirProjeto() {
        System.out.println("\n🔬 Projeto de Pesquisa: " + titulo + " | " + descricao);
        for (Pessoa p : participantes) {
            p.exibirInfo();
        }
    }
}
