package org.example;

public abstract class ItemTarefa {

    private String nome;

    public ItemTarefa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract String getConteudo();
}