package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InformacoesTest {

    @Test
    void deveRetornarUrgenciaTarefa() {
        Projeto projetoPrincipal = new Projeto("Projeto 01");
        Tarefa tarefa01 = new Tarefa("Tarefa 01", "Descrição da Tarefa 01");
        projetoPrincipal.addItem(tarefa01);

        Projeto projetoSecundario = new Projeto("Projeto 02");
        Tarefa tarefa02 = new Tarefa("Tarefa 02", "Descrição da Tarefa 02");
        Tarefa tarefa03 = new Tarefa("Tarefa 03", "Descrição da Tarefa 03");
        projetoSecundario.addItem(tarefa02);
        projetoSecundario.addItem(tarefa03);
        projetoPrincipal.addItem(projetoSecundario);

        Informacoes informacoes = new Informacoes();
        informacoes.setDados(projetoPrincipal);

        assertEquals("Projeto: Projeto 01\n" +
                "Tarefa: Tarefa 01 - Descrição: Descrição da Tarefa 01\n" +
                "Projeto: Projeto 02\n" +
                "Tarefa: Tarefa 02 - Descrição: Descrição da Tarefa 02\n" +
                "Tarefa: Tarefa 03 - Descrição: Descrição da Tarefa 03\n", informacoes.getDados());
    }

    @Test
    void deveRetornarExecacaoPrioridadeSemUrgencia() {
        try {
            Informacoes informacoes = new Informacoes();
            informacoes.getDados();
            fail();
        } catch (NullPointerException e) {
            assertEquals("Informacoes sem dados", e.getMessage());
        }
    }
}