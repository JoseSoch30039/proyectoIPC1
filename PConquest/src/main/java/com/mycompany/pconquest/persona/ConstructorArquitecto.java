/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pconquest.persona;

import com.mycompany.pconquest.naves.Nave;
import com.mycompany.pconquest.naves.NaveMillenialFalcon;

/**
 *
 * @author jose
 */
public class ConstructorArquitecto extends Constructor {
   
    @Override
    public String getNivel() {
           return "TIENE MUVHA EXPERIENCIA,\nCONOCE TODO DE MEMORIA"+
                   " PERO NO LE GUSTA HACER MEJORAS";
    }

    @Override
    public int getConstruirEnTurnos() {
        return 1;
    }

    @Override
    public int getPrecioCompra() {
        return 250;
    }

    @Override
    public int getPrecioVenta() {
           return 175;
    }

    @Override
    public Nave getNave() {
          return new NaveMillenialFalcon();
    }
}
