/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mauriciopacheco.s.world;

import Razas.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author MaPache
 */
public class Menu {
    
    Jugador jugador1 = new Jugador();
    Jugador jugador2 = new Jugador();
    //ArrayList<AbstractFactory> razas = new ArrayList<>();
    
    public void Inicio(){
        
        Boolean flag = true;
        Scanner input = new Scanner(System.in);
        int o;
        while(flag){
            System.out.println("BIENVENIDO A MAURICIOPACHECO'S WOLRD");
            System.out.println("Elige una opcion:");
            System.out.println("1. Iniciar el juego");
            System.out.println("2. Instrucciones");
            System.out.println("3. Salir");
            o = input.nextInt();
            switch(o){
                case 1:
                    Orden();
                    flag = false;
                    break;
                case 2:
                    Instruccion();
                    break;
                case 3:
                    flag = false;
                    break;
                default:
                    System.out.println("No ingreso una opcion valida");
            }
        } 
    }
    
    public void Instruccion(){
        
        System.out.println("INSTRUCCIONES");
        System.out.println("1. Cada jugador selecciona una raza y se elige el orden de juego de manera aleatoria");
        System.out.println("2. En los turnos, cada jugador podra:");
        System.out.println("    - Crear edificios");
        System.out.println("    - Entrenar tropas");
        System.out.println("    - Recolectar recursos");
        System.out.println("    - Mejorar el centro de mando");
        System.out.println("3. El turno terminara cuando cuando el jugador lo decida");
        System.out.println("4. El centro de mando no podrá ser atacado hasta que las demas edificaciones hayan sido destruidas");
        System.out.println("5. El juego finalizara cuando todas las edificaciones de un jugador hayan sido destruidas");
    }

    public void Orden() {
        int turno = (int) ((Math.random()*2) + 1);
        EscogerRaza();
        Juego(turno);
    }
    
    public void EscogerRaza(){
        System.out.println("|----------ES EL MOMENTO DE ESCOJER UNA RAZA----------|");
        System.out.println("");
        System.out.println("|----------------------JUGADOR 1----------------------|");
        jugador1.Razas();
        System.out.println("|----------------------JUGADOR 2----------------------|");
        jugador2.Razas();
    }
    
    public void Juego(int jugador){
        boolean juego = true;
        int fase = 1;
        while(juego){
            boolean turno1 = true, turno2 = true;
            System.out.println("");
            System.out.println("|-----------------------FASE " + fase + "-----------------------|");
            while(turno1 || turno2){
                while(jugador == 1){
                    int o1;
                    Scanner input1 = new Scanner(System.in);
                    System.out.println("");
                    System.out.println("|----------------TURNO DEL JUGADOR #" + jugador + "----------------|");
                    System.out.println("");
                    System.out.println("|----------------------------------------------------|");
                    System.out.println(jugador1.nrec1+": "+jugador1.rec1+" | "+jugador1.nrec2+": "+jugador1.rec2 +" | "+jugador1.nrec3+": "+jugador1.rec3);
                    System.out.println("Elige una de las siguientes acciones:");
                    System.out.println("1. Edificacion");
                    System.out.println("2. Entrenar tropas / construir vehiculos");
                    System.out.println("3. Atacar / Defender");
                    System.out.println("4. Terminar");
                    o1 = input1.nextInt();
                    switch(o1){
                        case 1:
                            jugador1.Edificacion();
                            break;
                        case 2:
                            jugador1.EntrenarConstruir();
                            break;
                        case 3:
                            
                            break;
                            
                        case 4:
                            jugador = 2;
                            break;
                        default:
                            System.out.println("No ingreso una opcion valida");
                            break;
                    }
                }
                while(jugador == 2){
                    int o2;
                    Scanner input2 = new Scanner(System.in);
                    System.out.println("");
                    System.out.println("|----------------TURNO DEL JUGADOR #" + jugador + "----------------|");
                    System.out.println("");
                    System.out.println("|----------------------------------------------------|");
                    System.out.println(jugador2.nrec1+": "+jugador2.rec1+" | "+jugador2.nrec2+": "+jugador2.rec2 +" | "+jugador2.nrec3+": "+jugador2.rec3);
                    System.out.println("Elige una de las siguientes acciones:");
                    System.out.println("1. Edificacion");
                    System.out.println("2. Entrenar tropas / construir vehiculos");
                    System.out.println("3. Atacar / Defender");
                    System.out.println("4. Terminar");
                    o2 = input2.nextInt();
                    switch(o2){
                        case 1:
                            jugador2.Edificacion();
                            break;
                        case 2:
                            jugador2.EntrenarConstruir();
                            break;
                        case 3:
                            
                            break;
                        case 4:
                            jugador = 1;
                            break;
                        default:
                            System.out.println("No ingreso una opcion valida");
                            break;
                    }
                }
            }
        }
    }
}
