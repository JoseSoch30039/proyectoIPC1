/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pconquest.persona;

import com.mycompany.pconquest.naves.Nave;
import com.mycompany.pconquest.naves.NaveNabooN1;

/**
 *
 * @author jose
 */
public class ConstructorObrero extends Constructor {

    @Override
    public String getNivel() {
           return "APRENDIZ, LE LLEVA MAS TIEMPO TRABAJAR";
    }

    @Override
    public int getConstruirEnTurnos() {
        return 3;
    }

    @Override
    public int getPrecioCompra() {
        return 50;
    }

    @Override
    public int getPrecioVenta() {
           return 40;
    }

    @Override
    public Nave getNave() {
            return new NaveNabooN1();
    }
    
}
