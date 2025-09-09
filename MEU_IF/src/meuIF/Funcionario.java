package meuIF;

public class Funcionario extends Pessoa {
    protected String setor;
    protected double salario;

    public Funcionario(String nome, String cpf, String email, String setor, double salario) {
        super(nome, cpf, email);
        this.setor = setor;
        this.salario = salario;
    }

    @Override
    public void exibirInfo() {
        System.out.println("👔 Funcionário: " + nome + " | Setor: " + setor + " | Salário: R$" + salario);
    }
}
