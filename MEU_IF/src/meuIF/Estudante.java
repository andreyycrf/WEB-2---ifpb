package meuIF;

public class Estudante extends Pessoa {
    private String matricula;
    private String curso;

    public Estudante(String nome, String cpf, String email, String matricula, String curso) {
        super(nome, cpf, email);
        this.matricula = matricula;
        this.curso = curso;
    }

    @Override
    public void exibirInfo() {
        System.out.println("🎓 Estudante: " + nome + " | Matrícula: " + matricula + " | Curso: " + curso);
    }
}
