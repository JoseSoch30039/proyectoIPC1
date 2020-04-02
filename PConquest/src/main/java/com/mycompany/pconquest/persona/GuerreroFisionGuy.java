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
public class GuerreroFisionGuy extends Guerrero {

 @Override
    public String getAtaqueEspecial() {
   return "ATAQUE ESPECIAL: DISPARA RAYOS GAMA QUE DERRITEN AL ENEMIGO ";
    }

    @Override
    public double getFactorDeMuerte() {
           return 1.95;
    }

    @Override
    public int getLugarOcupa() {
            return 4;
    }
    
}
