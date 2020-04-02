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
public abstract class Nave {
    
    protected String nivel;
    protected int espacios;
    protected int costo;
    protected double velocidad;

    public abstract String getNivel();

    public abstract int getEspacios();

    public abstract int getCosto();

    public abstract double getVelocidad();
    
    
}
