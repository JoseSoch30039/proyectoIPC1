/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pconquest.persona;

/**
 *
 * @author jose
 */
public class GuerreroMagma extends Guerrero{
 @Override
    public String getAtaqueEspecial() {
   return "ATAQUE ESPECIAL: LANZA BOLAS DE LAVA";
    }

    @Override
    public double getFactorDeMuerte() {
           return 1.75;
    }

    @Override
    public int getLugarOcupa() {
            return 2;
    }
    
}
