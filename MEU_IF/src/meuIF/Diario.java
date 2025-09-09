package meuIF;

import java.util.*;

public class Diario {
    private Professor professorResponsavel;
    private List<Estudante> estudantes;
    private List<Aula> aulas;

    public Diario(Professor professorResponsavel) {
        this.professorResponsavel = professorResponsavel;
        this.estudantes = new ArrayList<>();
        this.aulas = new ArrayList<>();
    }

    public void adicionarEstudante(Estudante e) {
        estudantes.add(e);
    }

    public void adicionarEstudante(List<Estudante> lista) {
        estudantes.addAll(lista);
    }

    public void adicionarAula(Aula aula) {
        aulas.add(aula);
    }

    public void exibirDiario() {
        System.out.println("\n📘 Diário do Professor:");
        professorResponsavel.exibirInfo();

        System.out.println("Estudantes:");
        for (Estudante e : estudantes) {
            e.exibirInfo();
        }

        System.out.println("Aulas Registradas:");
        for (Aula a : aulas) {
            a.exibirAula();
        }
    }
}
