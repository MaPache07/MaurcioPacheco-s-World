/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mauriciopacheco.s.world;

import Milicia.*;
import Razas.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author MaPache
 */
public class Jugador {
    
    AbstractFactory raza;
    private int rec1, rec2, rec3;
    private ArrayList<Tropa> ListTropa = new ArrayList<>();
    private ArrayList<Cuartel> ListCuartel = new ArrayList<>();
    private ArrayList<Recolector> ListRecolector = new ArrayList<>();
    
    public void Razas (){
        int o;
        Scanner input = new Scanner(System.in);
        System.out.println("1. Mago");
        System.out.println("2. Ninja");
        System.out.println("3. Pirata");
        o = input.nextInt();
        switch(o){
            case 1:
                raza.getMago("Mago");
                break;
            case 2:
                
                break;
            case 3:
                
                break;
            default:
                System.out.println("No ingreso una opción valida");
        }
    }
}
