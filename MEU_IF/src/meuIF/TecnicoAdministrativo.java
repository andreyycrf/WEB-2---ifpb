package meuIF;

public class TecnicoAdministrativo extends Funcionario {
    private String cargo;
    private String nivel;

    public TecnicoAdministrativo(String nome, String cpf, String email, String setor, double salario, String cargo, String nivel) {
        super(nome, cpf, email, setor, salario);
        this.cargo = cargo;
        this.nivel = nivel;
    }

    @Override
    public void exibirInfo() {
        System.out.println("🛠 Técnico Administrativo: " + nome + " | Cargo: " + cargo + " | Nível: " + nivel);
    }
}
