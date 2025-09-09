package meuIF;

import java.util.*;

public abstract class Projeto {
    protected String titulo;
    protected String descricao;
    protected List<Pessoa> participantes;

    public Projeto(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.participantes = new ArrayList<>();
    }

    public void adicionarParticipante(Pessoa p) {
        participantes.add(p);
    }

    public abstract void exibirProjeto();
}
