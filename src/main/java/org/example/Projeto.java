package org.example;

import java.util.ArrayList;
import java.util.List;

public class Projeto extends ItemTarefa {

    private List<ItemTarefa> itens;

    public Projeto(String nome) {
        super(nome);
        this.itens = new ArrayList<ItemTarefa>();
    }

    public void addItem(ItemTarefa item) {
        this.itens.add(item);
    }

    public String getConteudo() {
        String saida = "";
        saida = "Projeto: " + this.getNome() + "\n";
        for (ItemTarefa item : itens) {
            saida += item.getConteudo();
        }
        return saida;
    }
}