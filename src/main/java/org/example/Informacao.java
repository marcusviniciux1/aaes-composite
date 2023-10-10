package org.example;

public class Informacao {

    private ItemTarefa dados;

    public String getDados() {
        if (this.dados == null) {
            throw new NullPointerException("Informacao sem dados");
        }
        return this.dados.getConteudo();
    }

    public void setDados(ItemTarefa dados) {
        this.dados = dados;
    }
}