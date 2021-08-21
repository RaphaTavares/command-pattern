package com.company;

public class MoverItensParaEstanteTarefa implements Tarefa{

    private Quarto quarto;

    public MoverItensParaEstanteTarefa(Quarto quarto){
        this.quarto = quarto;
    }

    @Override
    public void executar() {
        this.quarto.levarParaEstante();
    }

    @Override
    public void cancelar() {
        this.quarto.levarParaGaveta();
    }
}
