/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pconquest.persona;

import com.mycompany.pconquest.naves.Nave;
import com.mycompany.pconquest.naves.NaveXWing;

/**
 *
 * @author jose
 */
public class ConstructorMaestro extends Constructor  {

   
    @Override
    public String getNivel() {
           return "TIENE EXPERIENCIA, PERO NO TIEN BUENA MEMORIA";
    }

    @Override
    public int getConstruirEnTurnos() {
        return 2;
    }

    @Override
    public int getPrecioCompra() {
        return 100;
    }

    @Override
    public int getPrecioVenta() {
           return 70;
    }

    @Override
    public Nave getNave() {
          return new NaveXWing();
    }
    
}
