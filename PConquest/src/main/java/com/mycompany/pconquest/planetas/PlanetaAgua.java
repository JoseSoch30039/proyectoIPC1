/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pconquest.planetas;

import com.mycompany.pconquest.persona.Guerrero;
import com.mycompany.pconquest.persona.GuerreroNemo;
import java.util.Random;

/**
 *
 * @author jose
 */
public class PlanetaAgua extends Planeta{

    public PlanetaAgua(String dueño,String nombre, int cantidadDeDinero, int cantidadDeConstructor, int cantidadDeNave, int cantidadDeGuerrero) {
        super(dueño,nombre, cantidadDeDinero, cantidadDeConstructor, cantidadDeNave, cantidadDeGuerrero);
    }

    public PlanetaAgua() {
        
    }

    
    

    @Override
    public String getLine1() {
        return getCuadroColor()+getCuadroColor()+getCuadroColor()+getCuadroColor()+getCuadroColor()+getCuadroColor()+
                getCuadroColor()+getCuadroColor()+getCuadroColor()+getCuadroColor()+getCuadroColor()+getCuadroColor()+
                getCuadroColor()+getCuadroColor();
    }

    @Override
    public String getLine2() {
        return getCuadroColor()+getCuadroColor()+getName()+
                getCuadroColor()+getCuadroColor();
    }

    @Override
    public String getLine3() {
        return getCuadroColor()+getCuadroColor()+getDueño()+getCuadroColor()+
                getCuadroColor()+getCuadroColor();
    }

  @Override
    public String getName() {
        
        char [] letra={'a','b','c','d','e','f','g','h','i'
        ,'j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        int a=0;
        int b=26;
        
       if(nombre!=null){
           
           return "name:"+nombre; 
    }  
       else{ 
           return "NOMBRE : " +letra[random(a, b)];
       }
    }
   
    @Override
    public String getDueño() {
       
        if(dueño!=null)
        return "de:"+dueño;
        else
           
            return "de: neutral";
    }
    
    
     @Override
    public String getCuadroColor(){
        return ANSI_BLUE+CUADRO;
    }

    @Override
    public int getCantidadDeGuerrero() {
   return getCantidadDineroProducido();
    }

    @Override
    public int getCantidadGuerreroProducido() {
   return random(12, 11);
    }

    @Override
    public int getCantidadDineroProducido() {
   return random(60,60);
    }

    @Override
    public int getProbabilidadAparecer() {
        return random(1,25);
    
    }

    public int random(int a, int b){
     Random aleatorio=new Random();
      int numero=a+aleatorio.nextInt(b);
      return numero;
    
    }

    @Override
    public Guerrero[] getTipoGuerrero(int number) {
        Guerrero[] guerreroNemo=new Guerrero[number];
        for (int i = 0; i < guerreroNemo.length; i++) {
           guerreroNemo[i]=new GuerreroNemo();
            
        }
       /* for (int i = 0; i < guerreroNemo.length; i++) {
            System.out.println( guerreroNemo[i].mostrarGuerrero());
            
        }*/
    return guerreroNemo;
    }
    
    
    
}
