package com.company.tests;

import com.company.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QuartoTest {

    Quarto quarto;
    MaquinaOrganizadora maquina;

    @BeforeEach
    void setUp(){
        quarto = new Quarto(false, false);
        maquina = new MaquinaOrganizadora();
    }

    @Test
    void deveMoverParaGaveta(){
        Tarefa moverParaGaveta = new MoverItensParaGavetaTarefa(quarto);
        maquina.executarTarefa(moverParaGaveta);

        assertEquals("Objetos na gaveta", quarto.getSituacao());
    }

    @Test
    void deveMoverParaEstante(){
        Tarefa moverParaEstante = new MoverItensParaEstanteTarefa(quarto);
        maquina.executarTarefa(moverParaEstante);

        assertEquals("Objetos na estante", quarto.getSituacao());
    }

    @Test
    void deveDeixarBaguncado(){
        assertEquals("Objetos bagunçados", quarto.getSituacao());
    }

    @Test
    void deveCancelarMoverParaEstante(){
        Tarefa moverParaEstante = new MoverItensParaEstanteTarefa(quarto);
        Tarefa moverParaGaveta = new MoverItensParaGavetaTarefa(quarto);

        maquina.executarTarefa(moverParaGaveta);
        maquina.executarTarefa(moverParaEstante);

        maquina.cancelarUltimaTarefa();

        assertEquals("Objetos na gaveta", quarto.getSituacao());
    }
}
