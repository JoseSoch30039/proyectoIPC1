/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pconquest.planetas;

import com.mycompany.pconquest.persona.Guerrero;
import java.util.Random;

/**
 *
 * @author jose
 */
public abstract class Planeta {
    
    protected final char FONDO=(char)189;
    protected final char CUADRO=(char)182; //distinguir el tipo de caracter imprrime el caracter
    protected static final String ANSI_BLACK= "\u001B[30m";
    protected static final String ANSI_RED= "\u001B[31m";
    protected static final String ANSI_GREEN= "\u001B[32m";
    protected static final String ANSI_YELLOW= "\u001B[33m";
    protected static final String ANSI_BLUE= "\u001B[34m";
    protected static final String ANSI_PURPLE= "\u001B[35m";
    protected static final String ANSI_CYAN= "\u001B[36m";
    protected static final String ANSI_WHITE= "\u001B[37m";
   

  

    //atributos asignados o aleatorios
    protected String dueño;
    protected String nombre; //asigna letras del alfabeto a menos de que se indique en el diseño de mapa
    protected double porcentajeDeMuerte; //valor entre 0.1 y 0.9999
    protected int cantidadDeDinero; //entre 100 y 500  o especifique diseño mapa
    protected int cantidadDeConstructor; //inicia con 1 tipo obrero o especificar en diseño...
    protected int cantidadDeNave; //aleatorio entre 1 y 3 Naboo... o especificar a diseño mapa
    protected int cantidadDeGuerrero; //  valor inicial se genera aleatoriamente basado en la producción del tipo de planeta tipo de guerrero depende del tipo de planeta


    protected Guerrero [] tipoGuerrero;
    protected int probabilidadAparecer;
    protected int cantidadGuerreroProducido;
    protected int cantidadDineroProducido;
   
    public Planeta(String dueño, String nombre,int cantidadDeDinero,int cantidadDeConstructor,int cantidadDeNave,
                   int cantidadDeGuerrero){
        this.dueño=dueño;
        this.nombre=nombre;
        this.cantidadDeDinero=cantidadDeDinero;
        this.cantidadDeConstructor=cantidadDeConstructor;
        this.cantidadDeNave=cantidadDeNave;
        this.cantidadDeGuerrero=cantidadDeGuerrero;
        this.porcentajeDeMuerte=getPorcentajeDeMuerte();
        tipoGuerrero =new Guerrero[this.cantidadDeGuerrero];
        this.tipoGuerrero=getTipoGuerrero(getCantidadDeGuerrero());
    }



    public Planeta(){
        
        this.cantidadDeDinero=getCantidadDeDinero();
        this.cantidadDeConstructor=1;
        this.cantidadDeNave=getCantidadDeNave();
        this.cantidadDeGuerrero=getCantidadDeGuerrero();
        this.porcentajeDeMuerte=getPorcentajeDeMuerte();
        this.tipoGuerrero=getTipoGuerrero(this.cantidadDeGuerrero);
    }

    /**
     *
     * @return
     */
    public abstract String getDueño();


    public abstract String getLine1();

    public abstract String getLine2();

    public abstract String getLine3();


     public abstract String getName();

     public String getCuadroColor(){
        return ANSI_BLUE+CUADRO;
    }

    public int getCantidadDeDinero() {
      Random aleatorio=new Random();
      int dinero=100+aleatorio.nextInt(400);
      return dinero;
    }

    public int getCantidadDeNave() {
      Random aleatorio=new Random();
      int naves=1+aleatorio.nextInt(3);
      return naves;
    }

    
    public double getPorcentajeDeMuerte() {
       double muerte=Math.random();
       return muerte;
    }

   
    public abstract int getCantidadGuerreroProducido();
    

    public abstract int getCantidadDeGuerrero();

    public abstract int getCantidadDineroProducido();

    public abstract int getProbabilidadAparecer();

    public abstract Guerrero [] getTipoGuerrero(int number);
    

public String imprimirDatosPlanetas(){
   return "nombre del planeta "+getName()+"dinero: "+getCantidadDeDinero()+
            "constructores: "+this.cantidadDeConstructor+"\nnaves: "+getCantidadDeNave()+" guerrero: "+getCantidadDeGuerrero()+" g:"+getTipoGuerrero(this.cantidadDeGuerrero);
}
  
    
}
