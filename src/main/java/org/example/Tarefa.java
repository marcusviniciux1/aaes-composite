package org.example;

public class Tarefa extends ItemTarefa {

    private String descricao;

    public Tarefa(String nome, String descricao) {
        super(nome);
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getConteudo() {
        return "Tarefa: " + this.getNome() + " - Descrição: " + this.descricao + "\n";
    }

}