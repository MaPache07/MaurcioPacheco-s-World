/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mauriciopacheco.s.world;

import Mago.*;
import Milicia.*;
import Ninja.*;
import Pirata.*;
import Razas.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author MaPache
 */
public class Jugador {
    
    FactoryMago mago = new FactoryMago();
    FactoryNinja ninja = new FactoryNinja();
    FactoryPirata pirata = new FactoryPirata();
    CentroMando centromando = new CentroMando();
    int raza;
    private int rec1, rec2, rec3;
    private ArrayList<Tropa> ListTropa = new ArrayList<>();
    private ArrayList<Cuartel> ListCuartel = new ArrayList<>();
    private ArrayList<Recolector> ListRecolector = new ArrayList<>();
    private ArrayList<CentroMando> ListaCentroMando = new ArrayList<>();
    
    public void Razas (){
        int o;
        Scanner input = new Scanner(System.in);
        System.out.println("1. Mago");
        System.out.println("2. Ninja");
        System.out.println("3. Pirata");
        o = input.nextInt();
        switch(o){
            case 1:
                mago.getMago(7).crearEdificacion();
                centromando = mago.getMago(7).getCentroMando();
                ListaCentroMando.add(centromando);
                raza = 1;
                break;
            case 2:
                ninja.getNinja(7).crearEdificacion();
                centromando = ninja.getNinja(7).getCentroMando();
                ListaCentroMando.add(centromando);
                raza = 2;
                break;
            case 3:
                pirata.getPirata(7).crearEdificacion();
                centromando = pirata.getPirata(7).getCentroMando();
                ListaCentroMando.add(centromando);
                raza = 3;
                break;
            default:
                System.out.println("No ingreso una opción valida");
        }
    }
    
    public void Edificacion(){
        boolean flag = true;
        int o;
        Scanner input = new Scanner(System.in);
        while(flag){
            System.out.println("");
            System.out.println("|--------------------EDIFICACION---------------------|");
            System.out.println("1. Crear edificacion");
            System.out.println("2. Mejorar el centro de mando");
            System.out.println("3. Mostrar los edificios creados");
            System.out.println("4. Recolectar ");
            System.out.println("5. Regresar");
            o = input.nextInt();
            switch(o){
                case 1:
                    CrearEdificacion();
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    flag = false;
                    break;
                default:
                    System.out.println("La opcion que ingreso no es valida");
            }
        }
    }
    
    public void CrearEdificacion(){
        boolean flag = true;
        int o;
        Scanner input = new Scanner(System.in);
        Recolector recolector = new Recolector();
        Cuartel cuartel = new Cuartel();
        while(flag){
            System.out.println("");
            System.out.println("|----------------------------------------------------|");
            System.out.println("¿Qué edificacion desea crear?");
            int cont = 1;
            while (cont < 7){
                if(raza == 1){
                    System.out.println(cont + "." + " " + mago.getMago(cont).getNombre());
                }
                if(raza == 2){
                    System.out.println(cont + "." + " " + ninja.getNinja(cont).getNombre());
                }
                if(raza == 3){
                    System.out.println(cont + "." + " " + pirata.getPirata(cont).getNombre());
                }
                cont++;
            }
            o = input.nextInt();
            if(o == 1 || o == 2 || o == 3){
                if(raza == 1){
                    mago.getMago(o).crearEdificacion();
                    recolector = mago.getMago(o).getRecolector();
                    ListRecolector.add(recolector);
                }
                if(raza == 2){
                    ninja.getNinja(o).crearEdificacion();
                    recolector = ninja.getNinja(o).getRecolector();
                    ListRecolector.add(recolector);
                }
                if(raza == 3){
                    pirata.getPirata(o).crearEdificacion();
                    recolector = pirata.getPirata(o).getRecolector();
                    ListRecolector.add(recolector);
                }
            }
            if (o == 4 || o == 5 || o == 6){
                if(raza == 1){
                    mago.getMago(o).crearEdificacion();
                    cuartel = mago.getMago(o).getCuartel();
                    ListCuartel.add(cuartel);
                }
                if(raza == 2){
                    ninja.getNinja(o).crearEdificacion();
                    cuartel = ninja.getNinja(o).getCuartel();
                    ListCuartel.add(cuartel);
                }
                if(raza == 3){
                    pirata.getPirata(o).crearEdificacion();
                    cuartel = pirata.getPirata(o).getCuartel();
                    ListCuartel.add(cuartel);
                }
            }
            flag = false;
        }
    }
}
