package com.company;

public class MoverItensParaGavetaTarefa implements Tarefa{

    private Quarto quarto;

    public MoverItensParaGavetaTarefa(Quarto quarto){
        this.quarto = quarto;
    }

    @Override
    public void executar() {
        this.quarto.levarParaGaveta();
    }

    @Override
    public void cancelar() {
        this.quarto.levarParaEstante();
    }
}
