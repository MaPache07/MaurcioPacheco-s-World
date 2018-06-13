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
    
    ArrayList<AbstractFactory> razas = new ArrayList<>();
    
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
    }
    
    public void EscogerRaza(){
        System.out.println("ES EL MOMENTO DE ESCOJER UNA RAZA");
        System.out.println("JUGADOR 1");
        
    }
    
}
