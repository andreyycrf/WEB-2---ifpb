package meuIF;

public class Main {
    public static void main(String[] args) {
    	
        Professor prof = new Professor("Carlos Silva", "111.111.111-11", "carlos@if.edu", "Doutorado", "Computação");

        Estudante e1 = new Estudante("Ana Souza", "222.222.222-22", "ana@if.edu", "2023001", "Informática");
        Estudante e2 = new Estudante("João Pereira", "333.333.333-33", "joao@if.edu", "2023002", "Informática");

        Diario diario = new Diario(prof);
        diario.adicionarEstudante(e1);
        diario.adicionarEstudante(e2);
        diario.adicionarAula(new Aula("09/09/2025", "Introdução à Programação"));
        diario.adicionarAula(new Aula("10/09/2025", "POO - Herança"));

        diario.exibirDiario();

        Funcionario f1 = new Funcionario("Marcos Lima", "444.444.444-44", "marcos@if.edu", "Biblioteca", 2500);
        TecnicoAdministrativo t1 = new TecnicoAdministrativo("Paula Castro", "555.555.555-55", "paula@if.edu", "Secretaria", 3000, "Assistente Acadêmico", "Nível II");

        f1.exibirInfo();
        t1.exibirInfo();

        Projeto pesquisa = new Pesquisa("IA aplicada", "Estudo sobre redes neurais");
        pesquisa.adicionarParticipante(prof);
        pesquisa.adicionarParticipante(e1);

        Projeto extensao = new Extensao("Robótica nas Escolas", "Levar a robótica para ensino médio");
        extensao.adicionarParticipante(prof);
        extensao.adicionarParticipante(e2);
        extensao.adicionarParticipante(t1);

        pesquisa.exibirProjeto();
        extensao.exibirProjeto();
    }
}
