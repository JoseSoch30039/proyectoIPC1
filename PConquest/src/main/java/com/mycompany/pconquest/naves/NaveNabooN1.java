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
public class NaveNabooN1 extends Nave {
    
      @Override
    public String getNivel() {
        return "BASICO";
    }

    @Override
    public int getEspacios() {
         return 25;
    }

    @Override
    public int getCosto() {
        return 40;
    }

    @Override
    public double getVelocidad() {
            return 1.00;
    }
    
    
}
