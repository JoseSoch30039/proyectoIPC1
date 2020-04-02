/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pconquest.diseño;

import com.mycompany.pconquest.persona.Jugador;
import com.mycompany.pconquest.planetas.Planeta;
import com.mycompany.pconquest.planetas.PlanetaAgua;
import com.mycompany.pconquest.planetas.PlanetaFuego;
import com.mycompany.pconquest.planetas.PlanetaOrganico;
import com.mycompany.pconquest.planetas.PlanetaRadioactivo;
import com.mycompany.pconquest.planetas.PlanetaTierra;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author jose
 */
public class Diseño {

    Scanner entrada = new Scanner(System.in);

    int numeroMapas;
    int filas;
    int columnas;
    int numeroMapasNeutrales;
    String nombreJugadores;
    private int number;
    protected Mapa[] diseño;
    protected Jugador[] jugadors;
    protected Planeta[] planetasIniciales;
    protected Planeta[] arreglosPlanetas;

    public Diseño() {

    }
//  metodo que genera un listado de mapas creados ingresando su atributos como filas, columnas...

    public void ingresarDatos() {

        System.out.println("*************BIENVENIDO A KONQUEST**************");
        System.out.println();
        System.out.println("EL JUEGO CONSISTE EN CREAR MAPAS\nCADA MAPA CUENTA CON FILAS Y COLUMNAS\n"
                + "ESTAS DEFINEN EL TAMAÑO DEL MAPA\nDENTRO DE CADA MAPA SE UBICARAN PLANETAS DE MANERA ALEATORIA\n"
                + "CADA JUGADOR POSEERA AL INICIAR EL JUEGO CON UN PLANETA INICIAL\n"
                + "DESDE EL CUAL PODRA MOVILIZARSE A TRAVES DE NAVES HACIA LOS PLANETAS NEUTRALES\n"
                + "LOS CUALES NO LE PERTENECERAN A NINGUNO DE LOS DOS JUGADORES\n"
                + "EL JUEGO CONSISTE EN CONQUISTAR LOS PLANETAS NEUTRALES\nEL JUGADOR QUE CONQUISTE TODOS LOS PLANETAS SERA EL GANADOR\n"
                + "JUEGO PARA DOS PERSONAS\n");

        System.out.println("DISEÑAR MAPAS:\n");
        System.out.println("INGRESE EL NUMERO DE MAPAS QUE DESEA CREAR: ");
        numeroMapas = entrada.nextInt();

        diseño = new Mapa[numeroMapas];
        
        for (number = 0; number < diseño.length; number++) {
            System.out.println("MAPA NO. " + (number + 1));
            System.out.println("INGRESE EL NUMERO DE FILAS: ");
            filas = entrada.nextInt();

            System.out.println("INGRESE EL NUMERO DE COLUMNAS: ");
            columnas = entrada.nextInt();

            ingresarPlanetas();

            diseño[number] = new Mapa(filas, columnas, numeroMapasNeutrales);
            seleccionAtributos();
        }
        generarJugadores();
    }

    //metodo que valida el numerd e planetas neutrales, estos no pueden ser mayor al numero de galaxias
    public int ingresarPlanetas() {

        System.out.println("INGRESE EL NUMERO DE PLANETAS NEUTRALES: ");
        numeroMapasNeutrales = entrada.nextInt();

        if (numeroMapasNeutrales <= ((filas * columnas) - 2)) {
            return numeroMapasNeutrales;
        } else {
            System.out.println("EL NUMERO DE PLANETAS NEUTRALES SOBREPASA EL TAMAÑO DEL MAPA ");
            System.out.println("VUELVA A INGRESAR EL NUMERO DE MAPAS NEUTRALES:");
            return ingresarPlanetas();
        }
    }

    //metodo para ingresar datos dentro de un arreglo
    public void generarJugadores() {

        Scanner leer = new Scanner(System.in);

        jugadors = new Jugador[2];
        System.out.println();
        System.out.println("INFORMACION DE LOS JUGADORES:\n");
        
        for (int i = 0; i < jugadors.length; i++) {
            System.out.println("INGRESE NOMBRE DEL JUGADOR " + (i + 1) + " :");
            nombreJugadores = leer.nextLine();
            jugadors[i] = new Jugador(nombreJugadores);
        }
        for (int i = 0; i < jugadors.length; i++) {
            System.out.println();
            System.out.println("NOMBRE JUGADOR " + (i + 1) + " : " + jugadors[i].getNombre());

        }
        elegirPlanetasIniciales();

    }

    public void elegirPlanetasIniciales() {
        
        Scanner scanners = new Scanner(System.in);
        
        String name = "";
        int cantidadDeDinero = 0;
        int cantidadDeConstructor = 0;
        int cantidadDeNave = 0;
        int cantidadDeGuerrero = 0;
        System.out.println();
        
        planetasIniciales = new Planeta[2];
        
        for (int i = 0; i < planetasIniciales.length; i++) {
           
            System.out.println(jugadors[i].getNombre() + " ELIGE TU TIPO DE PLANETA INICIAL: ");
            System.out.println("1. PLANETA TIERRA");
            System.out.println("2. PLANETA AGUA");
            System.out.println("3. PLANETA FUEGO");
            System.out.println("4. PLANETA ORGANICO");
            System.out.println("5. PLANETA RADIOACTIVO");
            System.out.println("INGRESA UNICAMENTE EL NUMERO SEGUN LA OPCION ELEGIDA:");

            int opcion = scanners.nextInt();

            System.out.println("INGRESA EL NOMBRE DE TU PLANETA INICIAL: ");
            name = scanners.next();

            System.out.println("INGRESA LA CANTIDAD DE DINERO: ");
            cantidadDeDinero = scanners.nextInt();

            System.out.println("INGRESA LA CANTIDAD DE CONSTRUCTORES: ");
            cantidadDeConstructor = scanners.nextInt();

            System.out.println("INGRESA LA CANTIDAD DE NAVES: ");
            cantidadDeNave = scanners.nextInt();
            
            System.out.println("INGRESA LA CANTIDAD DE GUERREROS: ");
            cantidadDeGuerrero = scanners.nextInt();

            switch (opcion) {

                case 1:

                    planetasIniciales[i] = new PlanetaTierra(jugadors[i].getNombre(), name, cantidadDeDinero, cantidadDeConstructor, cantidadDeNave, cantidadDeGuerrero);
                    break;
                case 2:
                    planetasIniciales[i] = new PlanetaAgua(jugadors[i].getNombre(), name, cantidadDeDinero, cantidadDeConstructor, cantidadDeNave, cantidadDeGuerrero);
                    break;
                case 3:
                    planetasIniciales[i] = new PlanetaFuego(jugadors[i].getNombre(), name, cantidadDeDinero, cantidadDeConstructor, cantidadDeNave, cantidadDeGuerrero);
                    break;
                case 4:
                    planetasIniciales[i] = new PlanetaOrganico(jugadors[i].getNombre(), name, cantidadDeDinero, cantidadDeConstructor, cantidadDeNave, cantidadDeGuerrero);
                    break;
                case 5:
                    planetasIniciales[i] = new PlanetaRadioactivo(jugadors[i].getNombre(), name, cantidadDeDinero, cantidadDeConstructor, cantidadDeNave, cantidadDeGuerrero);
                    break;
                default:
                    elegirPlanetasIniciales();
            }
        }
        menu();
       // seleccionAtributos();
       // elegirPlanetasNeutrales();
    }
    
    public void seleccionAtributos(){
        
        Scanner ingresa=new Scanner(System.in);
        
        System.out.println();
        System.out.println("A CONTINUACION PUEDES ELEGIR EN INGRESAR LOS ATRIBUTOS QUE CADA PLANETA NEUTRAL POSEERA\n"+
        "CASO CONTRARIO SE ASIGNARA A CADA PLANETA DE MANERA ALEATORIA");
        System.out.println("DESEA INGRESAR ATRIBUTOS A LOS PLANETAS NEUTRALES: ");
        System.out.println("1. SI");
        System.out.println("2. NO");
        int selection=ingresa.nextInt();
        
        switch (selection){
        
            case 1:
            
                elegirPlanetasNeutrales();
                
                break;
           
            case 2:
            
                System.out.println("LOS ATRIBUTOS FUERON ASIGNADOS CORRECTAMENTE");
                
                aleatorioPlanetasNeutrales();
                
                break;
                
            default:
                    seleccionAtributos();
        }
               
            
    }
    
     public void elegirPlanetasNeutrales() {
        
         
        Scanner scanners = new Scanner(System.in);
        
        String name = "";
        int cantidadDeDinero = 0;
        int cantidadDeConstructor = 0;
        int cantidadDeNave = 0;
        int cantidadDeGuerrero = 0;
        
         System.out.println("BIENVENIDO: ");
         System.out.println("ES MOMENTO DE INGRESARLOS ATRIBUTOS DE LOS PLANETAS A CONQUISTAR: ");
         
        arreglosPlanetas = new Planeta[numeroMapasNeutrales];
        
        for (int i = 0; i < arreglosPlanetas.length; i++) {
            System.out.println("SELECCIONA EL TIPO DE PLANETA NEUTRAL INGRESANDO UNICAMENTE EL NUMERO SEGUN SU OPCION:");
            System.out.println("1. PLANETA TIERRA");
            System.out.println("2. PLANETA AGUA");
            System.out.println("3. PLANETA FUEGO");
            System.out.println("4. PLANETA ORGANICO");
            System.out.println("5. PLANETA RADIOACTIVO");

            int opcion = scanners.nextInt();

            System.out.println("INGRESA EL NOMBRE DEL PLANETA NEUTRAL "+(i+1)+" :");
            name = scanners.next();

            System.out.println("INGRESA LA CANTIDAD DE DINERO: ");
            cantidadDeDinero = scanners.nextInt();

            System.out.println("INGRESA LA CANTIDAD DE CONSTRUCTORES: ");
            cantidadDeConstructor = scanners.nextInt();

            System.out.println("INGRESA LA CANTIDAD DE NAVES: ");
            cantidadDeNave = scanners.nextInt();
        
            System.out.println("INGRESA LA CANTIDAD DE GUERREROS: ");
            cantidadDeGuerrero = scanners.nextInt();

            switch (opcion) {

                case 1:

                    arreglosPlanetas[i] = new PlanetaTierra("neutral", name, cantidadDeDinero, cantidadDeConstructor, cantidadDeNave, cantidadDeGuerrero);
                    break;
            
                case 2:
                    arreglosPlanetas[i] = new PlanetaAgua("neutral", name, cantidadDeDinero, cantidadDeConstructor, cantidadDeNave, cantidadDeGuerrero);
                    break;
                
                case 3:
                    arreglosPlanetas[i] = new PlanetaFuego("neutral", name, cantidadDeDinero, cantidadDeConstructor, cantidadDeNave, cantidadDeGuerrero);
                    break;
                
                case 4:
                    arreglosPlanetas[i] = new PlanetaOrganico("neutral", name, cantidadDeDinero, cantidadDeConstructor, cantidadDeNave, cantidadDeGuerrero);
                    break;
                
                case 5:
                    planetasIniciales[i] = new PlanetaRadioactivo("neutral", name, cantidadDeDinero, cantidadDeConstructor, cantidadDeNave, cantidadDeGuerrero);
                    break;
                
                default:
                    elegirPlanetasIniciales();
            }
        }

       // seleccionarMapa();
    }

     
     public void aleatorioPlanetasNeutrales() {
      
       
        arreglosPlanetas = new Planeta[numeroMapasNeutrales];
    
        for (int i = 0; i < arreglosPlanetas.length; i++) {
            
    
            switch (random()) {

                case 1:

                    arreglosPlanetas[i] = new PlanetaTierra();
                    break;
                
                case 2:
                    arreglosPlanetas[i] = new PlanetaAgua();
                    break;
                
                case 3:
                    arreglosPlanetas[i] = new PlanetaFuego();
                    break;
                
                case 4:
                    arreglosPlanetas[i] = new PlanetaOrganico();
                    break;
                
                case 5:
                    arreglosPlanetas[i] = new PlanetaRadioactivo();
                    break;
               
            }
        
     
            }
           
     // menu();
    }

    public int random(){
        
        Random aleatorio=new Random();
    
        int numero=1+aleatorio.nextInt(5);
    
        return numero;
    }
    
    public void seleccionarMapa() {
        
        System.out.println("INICIAR PARTIDA: ");
        System.out.println("Para iniciar una partida debe elegir el mapa en el que se desarrollara el enfrentamiento");
        System.out.println("Ingrese el numero de mapa al que desea ingresar:  ");
        int mapaNumber = entrada.nextInt();
       
        for (int i = 0; i < diseño.length; i++) {
        
            if (diseño[mapaNumber - 1] == diseño[i]) {
                diseño[i].setPlanetas(planetasIniciales);
                diseño[i].setArregloPlanetas(arreglosPlanetas);
                diseño[i].inicializarJuego();

            }

        }
    }

//menu para ver mapas disponibles
    public void menu() {
        
        System.out.println();
        System.out.println("LISTADO DE MAPAS CREADOS: \n");
        
        
        for (int i = 0; i < diseño.length; i++) {

            System.out.println("mapa no." + (i + 1) + " = numero de filas : " + diseño[i].getFilas() + " numero de columnas: " + diseño[i].getColumnas() + " numero de planetas neutrales:  " + diseño[i].getNumeroMapasNeutrales());
        }
        
        seleccionarMapa();
    }

}
