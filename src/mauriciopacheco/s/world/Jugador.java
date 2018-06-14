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
    int rec1, rec2, rec3, raza;
    String nrec1, nrec2, nrec3;
    private ArrayList<Tropa> ListTropa = new ArrayList<>();
    private ArrayList<Cuartel> ListCuartel = new ArrayList<>();
    private ArrayList<Recolector> ListRecolector = new ArrayList<>();
    private ArrayList<Recolector> ListGenerador = new ArrayList<>();
    private ArrayList<CentroMando> ListCentroMando = new ArrayList<>();
    
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
                ListCentroMando.add(centromando);
                rec1 = centromando.getCantidad1();
                rec2 = centromando.getCantidad2();
                rec3 = centromando.getCantidad3();
                nrec1 = "Magia";
                nrec2 = "Eter";
                nrec3 = "Elixir";
                raza = 1;
                break;
            case 2:
                ninja.getNinja(7).crearEdificacion();
                centromando = ninja.getNinja(7).getCentroMando();
                ListCentroMando.add(centromando);
                rec1 = centromando.getCantidad1();
                rec2 = centromando.getCantidad2();
                rec3 = centromando.getCantidad3();
                nrec1 = "Chakra";
                nrec2 = "Piedra lunar";
                nrec3 = "Metal";
                raza = 2;
                break;
            case 3:
                pirata.getPirata(7).crearEdificacion();
                centromando = pirata.getPirata(7).getCentroMando();
                ListCentroMando.add(centromando);
                rec1 = centromando.getCantidad1();
                rec2 = centromando.getCantidad2();
                rec3 = centromando.getCantidad3();
                nrec1 = "Kairoseki";
                nrec2 = "Oro";
                nrec3 = "Ebano";
                raza = 3;
                break;
            default:
                System.out.println("No ingreso una opción valida");
        }
    }
    
    ////////////////////////////////////////////EDIFICACION////////////////////////////////////////////
    
    public void Edificacion(){
        boolean flag = true;
        int o;
        Scanner input = new Scanner(System.in);
        while(flag){
            System.out.println("");
            System.out.println("|--------------------EDIFICACION---------------------|");
            System.out.println("1. Crear edificacion");
            System.out.println("2. Mejorar el centro de mando");
            System.out.println("3. Mostrar los edificios en pie");
            System.out.println("4. Recolectar ");
            System.out.println("5. Regresar");
            o = input.nextInt();
            switch(o){
                case 1:
                    CrearEdificacion();
                    break;
                case 2:
                    SubirCentroMando();
                    break;
                case 3:
                    Mostrar();
                    break;
                case 4:
                    Recolectar();
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
                    if(mago.getMago(o).getPrecio1() < rec1 && mago.getMago(o).getPrecio2() < rec2 && mago.getMago(o).getPrecio3() < rec3){
                        mago.getMago(o).crearEdificacion();
                        recolector = mago.getMago(o).getRecolector();
                        rec1 = rec1-mago.getMago(o).getPrecio1();
                        rec2 = rec2-mago.getMago(o).getPrecio2();
                        rec3 = rec3-mago.getMago(o).getPrecio3();
                        if(o == 1){
                            ListGenerador.add(recolector);
                        }
                        else{
                            ListRecolector.add(recolector);
                        }
                    }
                    else{
                        System.out.println("No tiene suficientes recursos para construir esta edificacion");
                    }
                }
                if(raza == 2){
                    if(ninja.getNinja(o).getPrecio1() < rec1 && ninja.getNinja(o).getPrecio2() < rec2 && ninja.getNinja(o).getPrecio3() < rec3){
                        ninja.getNinja(o).crearEdificacion();
                        recolector = ninja.getNinja(o).getRecolector();
                        ListRecolector.add(recolector);
                        rec1 = rec1-ninja.getNinja(o).getPrecio1();
                        rec2 = rec2-ninja.getNinja(o).getPrecio2();
                        rec3 = rec3-ninja.getNinja(o).getPrecio3();
                    }
                    else{
                        System.out.println("No tiene suficientes recursos para construir esta edificacion");
                    }
                }
                if(raza == 3){
                    if(pirata.getPirata(o).getPrecio1() < rec1 && pirata.getPirata(o).getPrecio2() < rec2 && pirata.getPirata(o).getPrecio3() < rec3){
                        pirata.getPirata(o).crearEdificacion();
                        recolector = pirata.getPirata(o).getRecolector();
                        ListRecolector.add(recolector);
                        rec1 = rec1-pirata.getPirata(o).getPrecio1();
                        rec2 = rec2-pirata.getPirata(o).getPrecio2();
                        rec3 = rec3-pirata.getPirata(o).getPrecio3();
                    }
                    else{
                        System.out.println("No tiene suficientes recursos para construir esta edificacion");
                    }
                }
            }
            if (o == 4 || o == 5 || o == 6){
                if(raza == 1){
                    if(mago.getMago(o).getPrecio1() < rec1 && mago.getMago(o).getPrecio2() < rec2 && mago.getMago(o).getPrecio3() < rec3){
                        mago.getMago(o).crearEdificacion();
                        cuartel = mago.getMago(o).getCuartel();
                        ListCuartel.add(cuartel);
                        rec1 = rec1-mago.getMago(o).getPrecio1();
                        rec2 = rec2-mago.getMago(o).getPrecio2();
                        rec3 = rec3-mago.getMago(o).getPrecio3();
                    }
                    else{
                        System.out.println("No tiene suficientes recursos para construir esta edificacion");
                    }
                }
                if(raza == 2){
                    if(ninja.getNinja(o).getPrecio1() < rec1 && ninja.getNinja(o).getPrecio2() < rec2 && ninja.getNinja(o).getPrecio3() < rec3){
                        ninja.getNinja(o).crearEdificacion();
                        cuartel = ninja.getNinja(o).getCuartel();
                        ListCuartel.add(cuartel);
                        rec1 = rec1-ninja.getNinja(o).getPrecio1();
                        rec2 = rec2-ninja.getNinja(o).getPrecio2();
                        rec3 = rec3-ninja.getNinja(o).getPrecio3();
                    }
                    else{
                        System.out.println("No tiene suficientes recursos para construir esta edificacion");
                    }
                }
                if(raza == 3){
                    if(pirata.getPirata(o).getPrecio1() < rec1 && pirata.getPirata(o).getPrecio2() < rec2 && pirata.getPirata(o).getPrecio3() < rec3){
                        pirata.getPirata(o).crearEdificacion();
                        cuartel = pirata.getPirata(o).getCuartel();
                        ListCuartel.add(cuartel);
                        rec1 = rec1-pirata.getPirata(o).getPrecio1();
                        rec2 = rec2-pirata.getPirata(o).getPrecio2();
                        rec3 = rec3-pirata.getPirata(o).getPrecio3();
                    }
                    else{
                        System.out.println("No tiene suficientes recursos para construir esta edificacion");
                    }
                }
            }
            flag = false;
        }
    }
    
    public void SubirCentroMando(){
        int n = centromando.getNivel();
        if(n < 4){
            if(centromando.getPrecio1() < rec1 && centromando.getPrecio2() < rec2 && centromando.getPrecio3() < rec3){
                if(n == 1){
                    centromando.setCapacidad1((int) (centromando.getCapacidad1()*1.1));
                    centromando.setCapacidad2((int) (centromando.getCapacidad2()*1.1));
                    centromando.setCapacidad3((int) (centromando.getCapacidad3()*1.1));
                    centromando.setNivel(2);
                }
                if(n == 2){
                    centromando.setCapacidad1((int) (centromando.getCapacidad1()*1.3));
                    centromando.setCapacidad1((int) (centromando.getCapacidad1()*1.3));
                    centromando.setCapacidad1((int) (centromando.getCapacidad1()*1.3));
                    centromando.setNivel(3);
                }
                if(n == 3){
                    centromando.setCapacidad1((int) (centromando.getCapacidad1()*1.5));
                    centromando.setCapacidad1((int) (centromando.getCapacidad1()*1.5));
                    centromando.setCapacidad1((int) (centromando.getCapacidad1()*1.5));
                    centromando.setNivel(4);
                }
                rec1 = rec1-centromando.getPrecio1();
                rec2 = rec2-centromando.getPrecio2();
                rec3 = rec3-centromando.getPrecio3();
                System.out.println("¡El centro de mando ha subido al nivel "+centromando.getNivel()+"!");
            }
            else{
                System.out.println("No tiene suficientes recursos para subir de nivel el centro de mando");
            }
        }
        else{
            System.out.println("El centro de mando ya llego a su limite");
        }
    }
    
    public void Mostrar(){
        System.out.println("Las edificaciones en pie actualmente son: ");
        System.out.println("- " + ListCentroMando.get(0).getNombre());
        int size;
        if(!ListRecolector.isEmpty()){
            size = ListRecolector.size();
            for(int i = 0; i < size; i++){
                if(ListRecolector.get(i).getCantTurn() == 0){
                    System.out.println("- " + ListRecolector.get(i).getNombre());
                }
            }
        }
        if(!ListCuartel.isEmpty()){
            size = ListCuartel.size();
            for(int i = 0; i < size; i++){
                if(ListCuartel.get(i).getCantTurn() == 0){
                    System.out.println("- " + ListCuartel.get(i).getNombre());
                }
            }
        }
    }
    
    public void Recolectar(){
        if (!ListRecolector.isEmpty()){
            boolean flag = false;
            int size = ListRecolector.size(), cont = 0;
            for(int i = 0; i < size; i++){
                if (ListRecolector.get(i).getCantTurn() == 0){
                    flag = true;
                }
            }
            if (flag == true){
                for(int i = 0; i < size; i++){
                    if (ListRecolector.get(i).getCantTurn() == 0){
                        if(ListRecolector.get(i).getCantidad() != 0){
                            if (ListRecolector.get(i).getCapacidad() == 3000){
                                rec2 = rec2+ListRecolector.get(i).getCantidad();
                                ListRecolector.get(i).setCantidad(0);
                            }
                            else{
                                rec3 = rec3+ListRecolector.get(i).getCantidad();
                                ListRecolector.get(i).setCantidad(0);
                            }
                        }
                        else{
                            cont++;
                        }
                    }
                }
                if(cont == size){
                    System.out.println("Su recolector(es) ya contienen recurso");
                }
                else{
                    System.out.println("Se ha recolectado recusrso(s)");
                }
            }
            else{
                System.out.println("Su recolector(es) sigue construyendose");
            }
        }
        else{
            System.out.println("No tiene ningun recolector creado hasta el momento");
        }
    }
    
    ////////////////////////////////////////////ENTRENAR/CONSTRUIR////////////////////////////////////////////
    
    public void EntrenarConstruir(){
        boolean flag = true;
        int o;
        Scanner input = new Scanner(System.in);
        while(flag){
            System.out.println("");
            System.out.println("|-----------------ENTRENAR/CONSTRUIR-----------------|");
            System.out.println("1. Entrenar milicia");
            System.out.println("2. Construir/Entrenar un vehiculo");
            System.out.println("3. Regresar");
            o = input.nextInt();
            switch(o){
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    flag = false;
                    break;
                default:
                    System.out.println("No ingreso una opcion valida");
            }
        }
    }
    
}
