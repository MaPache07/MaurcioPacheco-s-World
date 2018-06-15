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
    ArrayList<String> Mensaje1 = new ArrayList<>();
    ArrayList<String> Mensaje2 = new ArrayList<>();
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
        boolean turno1, turno2;
        int fase = 1;
        while(true){
            turno1 = true; 
            turno2 = true;
            System.out.println("");
            System.out.println("|-----------------------FASE " + fase + "-----------------------|");
            while(turno1 || turno2){
                while(jugador == 1 && turno1){
                    int o1;
                    Scanner input1 = new Scanner(System.in);
                    System.out.println("");
                    System.out.println("|----------------TURNO DEL JUGADOR #" + jugador + "----------------|");
                    System.out.println("");
                    MostrarM(Mensaje1);
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
                            jugador1.AtacarDefender(jugador2.ListCentroMando, jugador2.ListGenerador, jugador2.ListRecolector, jugador2.ListCuartel, jugador2.ListConstructor);
                            break;
                        case 4:
                            jugador = 2;
                            turno1 = false;
                            break;
                        default:
                            System.out.println("No ingreso una opcion valida");
                            break;
                    }
                }
                while(jugador == 2 && turno2){
                    int o2;
                    Scanner input2 = new Scanner(System.in);
                    System.out.println("");
                    System.out.println("|----------------TURNO DEL JUGADOR #" + jugador + "----------------|");
                    System.out.println("");
                    MostrarM(Mensaje2);
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
                            jugador2.AtacarDefender(jugador1.ListCentroMando, jugador1.ListGenerador, jugador1.ListRecolector, jugador1.ListCuartel, jugador1.ListConstructor);
                            break;
                        case 4:
                            jugador = 1;
                            turno2 = false;
                            break;
                        default:
                            System.out.println("No ingreso una opcion valida");
                            break;
                    }
                }
            }
            jugador1.RecolectarRecurco();
            jugador1.Construccion(Mensaje1);
            jugador1.Entrenamiento(Mensaje1);
            jugador1.Atacando(Mensaje1, Mensaje2, jugador2.ListEnemigo);
            jugador2.RecolectarRecurco();
            jugador2.Construccion(Mensaje2);
            jugador2.Entrenamiento(Mensaje2);
            jugador2.Atacando(Mensaje2, Mensaje1, jugador1.ListEnemigo);
            fase++;
            if(jugador1.ListCentroMando.get(0).getVida() == 0 && jugador2.ListCentroMando.get(0).getVida() == 0){
                System.out.println("");
                System.out.println("|----------------------------------------------------|");
                System.out.println("");
                MostrarM(Mensaje1);
                MostrarM(Mensaje2);
                System.out.println("");
                System.out.println("|-----------------------EMPATE-----------------------|");
                System.out.println("");
                break;
            }
            if(jugador2.ListCentroMando.get(0).getVida() == 0){
                System.out.println("");
                System.out.println("|----------------------------------------------------|");
                System.out.println("");
                MostrarM(Mensaje1);
                System.out.println("");
                System.out.println("|-----------------JUGADOR #1 GANADOR-----------------|");
                System.out.println("");
                break;
            }
            if(jugador1.ListCentroMando.get(0).getVida() == 0){
                System.out.println("");
                System.out.println("|----------------------------------------------------|");
                System.out.println("");
                MostrarM(Mensaje2);
                System.out.println("");
                System.out.println("|-----------------JUGADOR #2 GANADOR-----------------|");
                System.out.println("");
                break;
            }
        }
    }
    
    public void MostrarM(ArrayList mensaje){
        if(!mensaje.isEmpty()){
            int size = mensaje.size();
            for(int i = 0; i < size; i++){
                System.out.println(mensaje.get(i));
            }
            mensaje.clear();
        }
        else{
            System.out.println("No hay notificaciones");
        }
    }
}
