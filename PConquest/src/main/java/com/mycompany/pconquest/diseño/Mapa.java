/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pconquest.diseño;

import com.mycompany.pconquest.planetas.Planeta;

/**
 *
 * @author jose
 */
public class Mapa {
    
    private int filas;
    private int columnas;
    private int numeroMapasNeutrales;
    private Planeta[] planetas;
    private Planeta[] arreglosPlanetas;
  
    
    
    public Mapa(int filas,int columnas,int numeroMapasNeutrales){
       
        planetas=new Planeta[2];
        this.filas=filas;
        this.columnas=columnas;
        this.numeroMapasNeutrales=numeroMapasNeutrales;
        arreglosPlanetas=new Planeta[numeroMapasNeutrales];
    }
/**
     *
     * @param arregloPlanetas
     */
    public void setArregloPlanetas(Planeta[] arregloPlanetas) {
        this.arreglosPlanetas = arregloPlanetas;
    }

    
    /**
     *
     * @param planetas
     */
    public void setPlanetas(Planeta[] planetas) {
    this.planetas = planetas;
    }
    /**
     *
     * @return
     */
    public int getFilas() {
        return filas;
    }

    public void setFilas(int filas) {
        this.filas = filas;
    }

    public int getColumnas() {
        return columnas;
    }

    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }

    public int getNumeroMapasNeutrales() {
        return numeroMapasNeutrales;
    }

    public void setNumeroMapasNeutrales(int numeroMapasNeutrales) {
        this.numeroMapasNeutrales = numeroMapasNeutrales;
    }


    public void inicializarJuego(){
        Juego juego=new Juego(filas,columnas, numeroMapasNeutrales);
        juego.setPlanetas(planetas);
        juego.setArregloPlanetas(arreglosPlanetas);
        juego.jugar();

    }
    
}
