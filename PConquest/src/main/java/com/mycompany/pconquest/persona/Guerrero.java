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
public abstract class Guerrero {
    
    protected String ataqueEspecial;
    protected int factorDeMuerte;
    protected int LugarOcupa;

    public Guerrero() {
        
        
    }

    public abstract String getAtaqueEspecial();

    public abstract double getFactorDeMuerte();

    public abstract int getLugarOcupa();
    
    public String mostrarGuerrero(){
    
    return "ataque"+getAtaqueEspecial()+" factor: "+getFactorDeMuerte()+" lugar: "+getLugarOcupa();
    }
    
    
}
