/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pconquest.diseño;

import com.mycompany.pconquest.planetas.Planeta;
import com.mycompany.pconquest.planetas.PlanetaAgua;
import com.mycompany.pconquest.planetas.PlanetaFuego;
import com.mycompany.pconquest.planetas.PlanetaOrganico;
import com.mycompany.pconquest.planetas.PlanetaRadioactivo;
import com.mycompany.pconquest.planetas.PlanetaTierra;

/**
 *
 * @author jose
 */
public class Galaxia {
    
    protected final char FONDO=(char)185;
    protected static final String ANSI_CYAN= "\u001B[36m";
    private Planeta planeta;

    public Galaxia(){//inicializas la galaxia para que no tenga ningun valor
        planeta=null;
    }

    public Planeta getPlaneta() {
        return planeta;
    }

    public void setPlaneta(Planeta planeta) {
        this.planeta = planeta;
    }

    public void iniciarTierra(PlanetaTierra tierra){

        //atributo planeta tomara el valor de un planeta fuego
        planeta=tierra;
    }
    public void iniciarAgua(PlanetaAgua agua){
        //atributo planeta tomara el valor de un planeta agua
        planeta=agua;
    }
     public void iniciarFuego(PlanetaFuego fuego){
        //atributo planeta tomara el valor de un planeta agua
        planeta=fuego;
    }
      public void iniciarOrganico(PlanetaOrganico organico){
        //atributo planeta tomara el valor de un planeta agua
        planeta=organico;
    }
       public void iniciarRadioactivo(PlanetaRadioactivo radioactivo){
        //atributo planeta tomara el valor de un planeta agua
        planeta=radioactivo;
    }

    /**
     *
     * @return
     */
    public String getline1(){
        if(Verificar()){
           return "|----------|";
        }else {
            return planeta.getLine1();
        }
    }

    public String getline2(){
        if (Verificar())return "|----------|";
        else return planeta.getLine2();
    }

    public String getline3(){
        if (Verificar())return "|----------|";
        else return planeta.getLine3();
    }

    public boolean Verificar(){
        if(planeta==null){
            return true;

        }else{
            return false;
        }

    }
    
    public static String getColor() {
        return ANSI_CYAN;
    }

     public String getFondoColor(){
        return getColor()+FONDO;
    }

    
}
