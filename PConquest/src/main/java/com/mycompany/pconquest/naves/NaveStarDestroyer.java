/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pconquest.naves;

/**
 *
 * @author jose
 */
public class NaveStarDestroyer extends Nave{

  
    @Override
    public String getNivel() {
        return "MUY AVANZADO";
    }

    @Override
    public int getEspacios() {
         return 80;
    }

    @Override
    public int getCosto() {
        return 100;
    }

    @Override
    public double getVelocidad() {
    return 1.75;
    }
}
