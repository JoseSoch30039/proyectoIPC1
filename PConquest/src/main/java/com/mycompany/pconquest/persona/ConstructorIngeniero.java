/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pconquest.persona;

import com.mycompany.pconquest.naves.Nave;
import com.mycompany.pconquest.naves.NaveStarDestroyer;

/**
 *
 * @author jose
 */
public class ConstructorIngeniero extends Constructor {

      
    @Override
    public String getNivel() {
           return "SE LA SABE TODAS Y NO TIENE MIEDO DE HACER LO QUE SEA NECESARIO";
    }

    @Override
    public int getConstruirEnTurnos() {
        return 1;
    }

    @Override
    public int getPrecioCompra() {
        return 300;
    }

    @Override
    public int getPrecioVenta() {
           return 200;
    }

    @Override
    public Nave getNave() {
          return new NaveStarDestroyer();
    }
}
