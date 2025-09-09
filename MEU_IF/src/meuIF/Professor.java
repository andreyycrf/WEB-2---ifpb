package meuIF;

public class Professor extends Pessoa {
    private String formacao;
    private String areaAtuacao;

    public Professor(String nome, String cpf, String email, String formacao, String areaAtuacao) {
        super(nome, cpf, email);
        this.formacao = formacao;
        this.areaAtuacao = areaAtuacao;
    }

    @Override
    public void exibirInfo() {
        System.out.println("👨‍🏫 Professor: " + nome + " | Formação: " + formacao + " | Área: " + areaAtuacao);
    }
}
