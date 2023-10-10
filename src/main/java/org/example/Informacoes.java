package org.example;

public class Informacoes {

    private ItemTarefa dados;

    public String getDados() {
        if (this.dados == null) {
            throw new NullPointerException("Informacoes sem dados");
        }
        return this.dados.getConteudo();
    }

    public void setDados(ItemTarefa dados) {
        this.dados = dados;
    }
}