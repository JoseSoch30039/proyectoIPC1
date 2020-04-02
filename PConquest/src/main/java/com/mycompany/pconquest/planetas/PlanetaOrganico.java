/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pconquest.planetas;

import com.mycompany.pconquest.persona.Guerrero;
import com.mycompany.pconquest.persona.GuerreroGroot;
import java.util.Random;

/**
 *
 * @author jose
 */
public class PlanetaOrganico extends Planeta{

    public PlanetaOrganico(String dueño,String nombre, int cantidadDeDinero, int cantidadDeConstructor, int cantidadDeNave, int cantidadDeGuerrero) {
        super(dueño,nombre, cantidadDeDinero, cantidadDeConstructor, cantidadDeNave, cantidadDeGuerrero);
    }

    public PlanetaOrganico() {
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
        return ANSI_GREEN+CUADRO;
    }

    @Override
    public int getCantidadDeGuerrero() {
   return getCantidadDineroProducido();
    }

    @Override
    public int getCantidadGuerreroProducido() {
   return random(5, 10);
    }

    @Override
    public int getCantidadDineroProducido() {
   return random(80,80);
    }

    @Override
    public int getProbabilidadAparecer() {
        return random(1,10);
    
    }

 

    public int random(int a, int b){
     Random aleatorio=new Random();
      int numero=a+aleatorio.nextInt(b);
      return numero;
    
    }

    @Override
    public Guerrero[] getTipoGuerrero(int number) {
       Guerrero[] guerreroGroot=new Guerrero[number];
        for (int i = 0; i < guerreroGroot.length; i++) {
           guerreroGroot[i]=new GuerreroGroot();
            
        }
    return guerreroGroot;
    } 
    
    
}
