/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pconquest.persona;

import com.mycompany.pconquest.naves.Nave;
import com.mycompany.pconquest.naves.NaveMillenialFalcon;
import com.mycompany.pconquest.naves.NaveNabooN1;
import com.mycompany.pconquest.naves.NaveStarDestroyer;
import com.mycompany.pconquest.naves.NaveXWing;

/**
 *
 * @author jose
 */
public abstract class Constructor {

    private String nivel;
    private int construirEnTurnos;
    private int precioCompra;
    private int precioVenta;
    protected Nave nave;
    
    public Constructor() {
        this.nivel = getNivel();
        this.construirEnTurnos = getConstruirEnTurnos();
        this.precioCompra = getPrecioCompra();
        this.precioVenta =getPrecioVenta();
        this.nave = getNave();
    }
    
    
    

    public abstract String getNivel();

    public abstract int getConstruirEnTurnos();

    public abstract int getPrecioCompra();

    public abstract  int getPrecioVenta();

   /* public void setNaveN(NaveNabooN1 nabooN1) {
        this.nave = nabooN1;
    }
    public void setNaveX(NaveXWing xWing) {
        this.nave = xWing;
    }
     public void setNaveM(NaveMillenialFalcon millenialFalcon) {
        this.nave = millenialFalcon;
    }
      public void setNaveS(NaveStarDestroyer starDestroyer) {
        this.nave = starDestroyer;
    }*/
    
    public abstract Nave getNave();
    
}
