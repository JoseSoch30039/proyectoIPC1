/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pconquest.diseño;

import com.mycompany.pconquest.planetas.Planeta;
import com.mycompany.pconquest.planetas.PlanetaAgua;
import com.mycompany.pconquest.planetas.PlanetaFuego;
import com.mycompany.pconquest.planetas.PlanetaOrganico;
import com.mycompany.pconquest.planetas.PlanetaRadioactivo;
import com.mycompany.pconquest.planetas.PlanetaTierra;

/**
 *
 * @author jose
 */
public class Juego {
    
    protected int fila;
    protected int columna;
    protected int planetasNeutrales;
    private Planeta[] planetasInicial;
    private Planeta[] arregloPlanetas;
  
    Galaxia[][] tablero;

    public Juego(int fila, int columna, int planetasNeutrales) {
        planetasInicial = new Planeta[2];
        tablero = new Galaxia[this.fila = fila][this.columna = columna];
        this.planetasNeutrales = planetasNeutrales;
        arregloPlanetas=new Planeta[planetasNeutrales];
    }

    public void jugar() {
        iniciarTablero();
        pintarTablero();

    }

    public Planeta[] getArregloPlanetas() {
        return arregloPlanetas;
    }

    public void setArregloPlanetas(Planeta[] arregloPlanetas) {
        this.arregloPlanetas = arregloPlanetas;
    }

    
    public Planeta[] getPlanetas() {
        return planetasInicial;
    }

    public void setPlanetas(Planeta[] planetasInicial) {
        this.planetasInicial = planetasInicial;
    }


    public void iniciarTablero() {

        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {

                tablero[i][j] = new Galaxia();

            }
        }
        boolean empty = true;
        for (int i = 0; i < planetasInicial.length; i++) {
            empty = true;
            switch (planetasInicial[i].getClass().getSimpleName()) {
                case "PlanetaTierra":
                    while (empty) {
                        int x = (int) (Math.random() * fila);
                        int y = (int) (Math.random() * columna);
                        if (tablero[x][y].getPlaneta() == null) {
                            tablero[x][y].iniciarTierra((PlanetaTierra) planetasInicial[i]);
                            empty = false;
                        }
                    }
                    break;
                case "PlanetaAgua":
                    while (empty) {
                        int x = (int) (Math.random() * fila);
                        int y = (int) (Math.random() * columna);
                        if (tablero[x][y].getPlaneta() == null) {
                            tablero[x][y].iniciarAgua((PlanetaAgua) planetasInicial[i]);
                            empty = false;
                        }
                    }
                    break;
                    case "PlanetaFuego":
                    while (empty) {
                        int x = (int) (Math.random() * fila);
                        int y = (int) (Math.random() * columna);
                        if (tablero[x][y].getPlaneta() == null) {
                            tablero[x][y].iniciarFuego((PlanetaFuego) planetasInicial[i]);
                            empty = false;
                        }
                    }
                    break;
                    case "PlanetaOrganico":
                    while (empty) {
                        int x = (int) (Math.random() * fila);
                        int y = (int) (Math.random() * columna);
                        if (tablero[x][y].getPlaneta() == null) {
                            tablero[x][y].iniciarOrganico((PlanetaOrganico) planetasInicial[i]);
                            empty = false;
                        }
                    }
                    break;
                    case "PlanetaRadioactivo":
                    while (empty) {
                        int x = (int) (Math.random() * fila);
                        int y = (int) (Math.random() * columna);
                        if (tablero[x][y].getPlaneta() == null) {
                            tablero[x][y].iniciarRadioactivo((PlanetaRadioactivo) planetasInicial[i]);
                            empty = false;
                        }
                    }
                    break;
            }

        }
        
         for (int i = 0; i < arregloPlanetas.length; i++) {
            empty = true;
            switch (arregloPlanetas[i].getClass().getSimpleName()) {
                case "PlanetaTierra":
                    while (empty) {
                        int x = (int) (Math.random() * fila);
                        int y = (int) (Math.random() * columna);
                        if (tablero[x][y].getPlaneta() == null) {
                            tablero[x][y].iniciarTierra((PlanetaTierra) arregloPlanetas[i]);
                            empty = false;
                        }
                    }
                    break;
                case "PlanetaAgua":
                    while (empty) {
                        int x = (int) (Math.random() * fila);
                        int y = (int) (Math.random() * columna);
                        if (tablero[x][y].getPlaneta() == null) {
                            tablero[x][y].iniciarAgua((PlanetaAgua) arregloPlanetas[i]);
                            empty = false;
                        }
                    }
                    break;
                    case "PlanetaFuego":
                    while (empty) {
                        int x = (int) (Math.random() * fila);
                        int y = (int) (Math.random() * columna);
                        if (tablero[x][y].getPlaneta() == null) {
                            tablero[x][y].iniciarFuego((PlanetaFuego) arregloPlanetas[i]);
                            empty = false;
                        }
                    }
                    break;
                    case "PlanetaOrganico":
                    while (empty) {
                        int x = (int) (Math.random() * fila);
                        int y = (int) (Math.random() * columna);
                        if (tablero[x][y].getPlaneta() == null) {
                            tablero[x][y].iniciarOrganico((PlanetaOrganico) arregloPlanetas[i]);
                            empty = false;
                        }
                    }
                    break;
                    case "PlanetaRadioactivo":
                    while (empty) {
                        int x = (int) (Math.random() * fila);
                        int y = (int) (Math.random() * columna);
                        if (tablero[x][y].getPlaneta() == null) {
                            tablero[x][y].iniciarRadioactivo((PlanetaRadioactivo) arregloPlanetas[i]);
                            empty = false;
                        }
                    }
                    break;
            }

        }
         
          
    }

    public void pintarTablero() {

        String linea1 = "";
        String linea2 = "";
        String linea3 = "";
        String linea4 = "";
char [] letra={'a','b','c','d','e','f','g','h','i'
        ,'j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
       
        for (int i = 0; i < fila; i++) {
            
            for (int j = 0; j < columna; j++) {
                linea1 += tablero[i][j].getline1();
                linea2 += tablero[i][j].getline2();
                linea3 += tablero[i][j].getline3();

                if (j == columna - 1) {
                    linea2 += "  " + (letra[i]);
                }
                if (i == fila - 1) {
                    linea4 += "      " + (j + 1) + "     ";
                }
            }
            System.out.println(linea1);
            System.out.println(linea2);
            System.out.println(linea3);
            linea1 = "";
            linea2 = "";
            linea3 = "";
            

        }
        System.out.println(linea4);
       
    }
    
   
    
}

