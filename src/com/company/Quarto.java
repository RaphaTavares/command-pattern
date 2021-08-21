package com.company;

public class Quarto {

    private Boolean gaveta;
    private Boolean estante;

    public Quarto(Boolean gaveta, Boolean estante){
        this.gaveta = gaveta;
        this.estante = estante;
    }

    public String getSituacao()
    {
        if(gaveta){
            return "Objetos na gaveta";
        }
        else if(estante){
            return "Objetos na estante";
        }
        return "Objetos bagunçados";
    }

    public void levarParaGaveta(){
        this.gaveta = true;
        this.estante = false;
    }

    public void levarParaEstante(){
        this.gaveta = false;
        this.estante = true;
    }
}
