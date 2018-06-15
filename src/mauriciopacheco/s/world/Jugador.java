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
    SwitchMago tropam = new SwitchMago();
    SwitchNinja tropan = new SwitchNinja();
    SwitchPirata tropap = new SwitchPirata();
    CentroMando centromando = new CentroMando();
    int rec1, rec2, rec3, raza;
    String nrec1, nrec2, nrec3;
    ArrayList<Tropa> ListTropa = new ArrayList<>();
    ArrayList<Tropa> ListVehiculo = new ArrayList<>();
    ArrayList<Tropa> ListEnemigo = new ArrayList<>();
    ArrayList<Cuartel> ListCuartel = new ArrayList<>();
    ArrayList<Cuartel> ListConstructor = new ArrayList<>();
    ArrayList<Recolector> ListRecolector = new ArrayList<>();
    ArrayList<Recolector> ListGenerador = new ArrayList<>();
    ArrayList<CentroMando> ListCentroMando = new ArrayList<>();
    
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
                    System.out.println("    "+nrec1+": "+mago.getMago(cont).getPrecio1()+" | "+nrec2+": "+mago.getMago(cont).getPrecio2()+" | "+nrec2+": "+mago.getMago(cont).getPrecio3());
                }
                if(raza == 2){
                    System.out.println(cont + "." + " " + ninja.getNinja(cont).getNombre());
                    System.out.println("    "+nrec1+": "+ninja.getNinja(cont).getPrecio1()+" | "+nrec2+": "+ninja.getNinja(cont).getPrecio2()+" | "+nrec2+": "+ninja.getNinja(cont).getPrecio3());
                }
                if(raza == 3){
                    System.out.println(cont + "." + " " + pirata.getPirata(cont).getNombre());
                    System.out.println("    "+nrec1+": "+pirata.getPirata(cont).getPrecio1()+" | "+nrec2+": "+pirata.getPirata(cont).getPrecio2()+" | "+nrec2+": "+pirata.getPirata(cont).getPrecio3());
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
                        rec1 = rec1-ninja.getNinja(o).getPrecio1();
                        rec2 = rec2-ninja.getNinja(o).getPrecio2();
                        rec3 = rec3-ninja.getNinja(o).getPrecio3();
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
                if(raza == 3){
                    if(pirata.getPirata(o).getPrecio1() < rec1 && pirata.getPirata(o).getPrecio2() < rec2 && pirata.getPirata(o).getPrecio3() < rec3){
                        pirata.getPirata(o).crearEdificacion();
                        recolector = pirata.getPirata(o).getRecolector();
                        rec1 = rec1-pirata.getPirata(o).getPrecio1();
                        rec2 = rec2-pirata.getPirata(o).getPrecio2();
                        rec3 = rec3-pirata.getPirata(o).getPrecio3();
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
            }
            if (o == 4 || o == 5 || o == 6){
                if(raza == 1){
                    if(mago.getMago(o).getPrecio1() < rec1 && mago.getMago(o).getPrecio2() < rec2 && mago.getMago(o).getPrecio3() < rec3){
                        mago.getMago(o).crearEdificacion();
                        cuartel = mago.getMago(o).getCuartel();
                        rec1 = rec1-mago.getMago(o).getPrecio1();
                        rec2 = rec2-mago.getMago(o).getPrecio2();
                        rec3 = rec3-mago.getMago(o).getPrecio3();
                        if(o == 4){
                            ListCuartel.add(cuartel);
                        }
                        else{
                            ListConstructor.add(cuartel);
                        }
                    }
                    else{
                        System.out.println("No tiene suficientes recursos para construir esta edificacion");
                    }
                }
                if(raza == 2){
                    if(ninja.getNinja(o).getPrecio1() < rec1 && ninja.getNinja(o).getPrecio2() < rec2 && ninja.getNinja(o).getPrecio3() < rec3){
                        ninja.getNinja(o).crearEdificacion();
                        cuartel = ninja.getNinja(o).getCuartel();
                        rec1 = rec1-ninja.getNinja(o).getPrecio1();
                        rec2 = rec2-ninja.getNinja(o).getPrecio2();
                        rec3 = rec3-ninja.getNinja(o).getPrecio3();
                        if(o == 4){
                            ListCuartel.add(cuartel);
                        }
                        else{
                            ListConstructor.add(cuartel);
                        }
                    }
                    else{
                        System.out.println("No tiene suficientes recursos para construir esta edificacion");
                    }
                }
                if(raza == 3){
                    if(pirata.getPirata(o).getPrecio1() < rec1 && pirata.getPirata(o).getPrecio2() < rec2 && pirata.getPirata(o).getPrecio3() < rec3){
                        pirata.getPirata(o).crearEdificacion();
                        cuartel = pirata.getPirata(o).getCuartel();
                        rec1 = rec1-pirata.getPirata(o).getPrecio1();
                        rec2 = rec2-pirata.getPirata(o).getPrecio2();
                        rec3 = rec3-pirata.getPirata(o).getPrecio3();
                        if(o == 4){
                            ListCuartel.add(cuartel);
                        }
                        else{
                            ListConstructor.add(cuartel);
                        }
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
        if(ValidarRecolector(ListGenerador)){
            MostrarRecolector(ListGenerador, 0, false);
        }
        if(ValidarRecolector(ListRecolector)){
            MostrarRecolector(ListRecolector, 0, false);
        }
        if(ValidarCuartel(ListCuartel)){
            MostrarCuartel(ListCuartel, 0, false);
        }
        if(ValidarCuartel(ListConstructor)){
            MostrarCuartel(ListConstructor, 0, false);
        }
    }
    
    public void Recolectar(){
        if (ValidarRecolector(ListRecolector)){
            int size = ListRecolector.size(), cont = 0;
            for(int i = 0; i < size; i++){
                if (ListRecolector.get(i).getCantTurn() == 0){
                    if(ListRecolector.get(i).getCantidad() != 0){
                        if (ListRecolector.get(i).getCapacidad() == 3000){
                            if(rec2+ListRecolector.get(i).getCantidad() <= ListCentroMando.get(0).getCapacidad2()){
                                rec2 = rec2+ListRecolector.get(i).getCantidad();
                                ListRecolector.get(i).setCantidad(0);
                            }
                            else{
                                int aux = ListCentroMando.get(0).getCapacidad2()-rec2;
                                rec2 = rec2+aux;
                                ListRecolector.get(i).setCantidad(ListRecolector.get(i).getCantidad()-aux);
                            }
                        }
                        else{
                            if(rec3+ListRecolector.get(i).getCantidad() <= ListCentroMando.get(0).getCapacidad3()){
                                rec3 = rec3+ListRecolector.get(i).getCantidad();
                                ListRecolector.get(i).setCantidad(0);
                            }
                            else{
                                int aux = ListCentroMando.get(0).getCapacidad3()-rec3;
                                rec3 = rec3+aux;
                                ListRecolector.get(i).setCantidad(ListRecolector.get(i).getCantidad()-aux);
                            }
                        }
                    }
                    else{
                        cont++;
                    }
                }
            }
            if(cont == size){
                System.out.println("Su recolector(es) ya no contiene recurso");
            }
            else{
                System.out.println("Se ha recolectado recusrso(s)");
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
            System.out.println("2. Construir un vehiculo");
            System.out.println("3. Mostrar tropas/vehiculos listos");
            System.out.println("4. Regresar");
            o = input.nextInt();
            switch(o){
                case 1:
                    Entrenar();
                    break;
                case 2:
                    Construir();
                    break;
                case 3:
                    MostrarTropas();
                    break;
                case 4:
                    flag = false;
                    break;
                default:
                    System.out.println("No ingreso una opcion valida");
            }
        }
    }
    
    public void Entrenar(){
        if (ValidarCuartel(ListCuartel)){
            int cont = 1, o;
            Tropa tropa = new Tropa();
            Scanner input = new Scanner(System.in);
            System.out.println("Seleccione la tropa que desee entrenar");
            while(cont < 3){
                if(raza == 1){
                    System.out.println(cont + "." + " " + tropam.SwitchMago(cont).getNombre());
                    System.out.println("    "+nrec1+": "+tropam.SwitchMago(cont).getPrecio1()+" | "+nrec2+": "+tropam.SwitchMago(cont).getPrecio2()+" | "+nrec3+": "+tropam.SwitchMago(cont).getPrecio3());
                }
                if(raza == 2){
                    System.out.println(cont + "." + " " + tropan.SwitchNinja(cont).getNombre());
                    System.out.println("    "+nrec1+": "+tropan.SwitchNinja(cont).getPrecio1()+" | "+nrec2+": "+tropan.SwitchNinja(cont).getPrecio2()+" | "+nrec3+": "+tropan.SwitchNinja(cont).getPrecio3());
                }
                if(raza == 3){
                    System.out.println(cont + "." + " " + tropap.SwitchPirata(cont).getNombre());
                    System.out.println("    "+nrec1+": "+tropap.SwitchPirata(cont).getPrecio1()+" | "+nrec2+": "+tropap.SwitchPirata(cont).getPrecio2()+" | "+nrec3+": "+tropap.SwitchPirata(cont).getPrecio3());
                }
                cont++;
            }
            o = input.nextInt();
            if (o == 1 || o == 2){
                if(raza == 1){
                    if (rec1 > tropam.SwitchMago(o).getPrecio1() && rec2 > tropam.SwitchMago(o).getPrecio2() && rec3 > tropam.SwitchMago(o).getPrecio3()){
                        tropa = tropam.SwitchMago(o);
                        ListTropa.add(tropa);
                        System.out.println("Se empezó a entrenar la tropa seleccionada");
                    }
                    else{
                        System.out.println("No tiene suficientes recursos para entranar la tropa");
                    }
                }
                if(raza == 2){
                    if (rec1 > tropan.SwitchNinja(o).getPrecio1() && rec2 > tropan.SwitchNinja(o).getPrecio2() && rec3 > tropan.SwitchNinja(o).getPrecio3()){
                        tropa = tropan.SwitchNinja(o);
                        ListTropa.add(tropa);
                        System.out.println("Se empezó a entrenar la tropa seleccionada");
                    }
                    else{
                        System.out.println("No tiene suficientes recursos para entranar la tropa");
                    }
                }
                if(raza == 3){
                    if (rec1 > tropap.SwitchPirata(o).getPrecio1() && rec2 > tropap.SwitchPirata(o).getPrecio2() && rec3 > tropap.SwitchPirata(o).getPrecio3()){
                        tropa = tropap.SwitchPirata(o);
                        ListTropa.add(tropa);
                        System.out.println("Se empezó a entrenar la tropa seleccionada");
                    }
                    else{
                        System.out.println("No tiene suficientes recursos para entranar la tropa");
                    }
                }
            }
            else{
                System.out.println("No ingreso una opcion valida");
            }
        }
        else{
            System.out.println("No tiene ningun cuartel creado hasta el momento");
        }
    }
    
    public void Construir(){
        if(!ListConstructor.isEmpty()){
            boolean flag = false, flag1 = false, flag2 = false;
            int size = ListConstructor.size();
            for(int i = 0; i < size; i++){
                if (ListConstructor.get(i).getCantTurn() == 0 && ListConstructor.get(i).getVida() > 0){
                    flag = true;
                    if (ListConstructor.get(i).getCodigo() == 2 && ListConstructor.get(i).getVida() > 0){
                        flag2 = true;
                    }
                    else{
                        flag1 = true;
                    }
                }
            }
            if (flag == true){
                int contx = 3, cont = 1, o, cant = 0, c = 3;
                Tropa tropa = new Tropa();
                Scanner input = new Scanner(System.in);
                System.out.println("Seleccione el vehiculo que dese construir");
                while(contx < 5){
                    if(raza == 1){
                        if(flag1 && contx == 4){
                            System.out.println(cont + "." + " " + tropam.SwitchMago(contx).getNombre());
                            System.out.println("    "+nrec1+": "+tropam.SwitchMago(contx).getPrecio1()+" | "+nrec2+": "+tropam.SwitchMago(contx).getPrecio2()+" | "+nrec3+": "+tropam.SwitchMago(contx).getPrecio3());
                            cant++;
                            cont++;
                            c--;
                        }
                        if (flag2 && contx == 3){
                            System.out.println(cont + "." + " " + tropam.SwitchMago(contx).getNombre());
                            System.out.println("    "+nrec1+": "+tropam.SwitchMago(contx).getPrecio1()+" | "+nrec2+": "+tropam.SwitchMago(contx).getPrecio2()+" | "+nrec3+": "+tropam.SwitchMago(contx).getPrecio3());
                            cant++;
                            cont++;
                            c--;
                        }
                    }
                    if(raza == 2){
                        if (flag1 && contx == 4){
                            System.out.println(cont + "." + " " + tropan.SwitchNinja(contx).getNombre());
                            System.out.println("    "+nrec1+": "+tropan.SwitchNinja(contx).getPrecio1()+" | "+nrec2+": "+tropan.SwitchNinja(contx).getPrecio2()+" | "+nrec3+": "+tropan.SwitchNinja(contx).getPrecio3());
                            cant++;
                            cont++;
                            c--;
                        }
                        if (flag2 && contx == 3){
                            System.out.println(cont + "." + " " + tropan.SwitchNinja(contx).getNombre());
                            System.out.println("    "+nrec1+": "+tropan.SwitchNinja(contx).getPrecio1()+" | "+nrec2+": "+tropan.SwitchNinja(contx).getPrecio2()+" | "+nrec3+": "+tropan.SwitchNinja(contx).getPrecio3());
                            cant++;
                            cont++;
                            c--;
                        }
                    }
                    if(raza == 3){
                        if (flag1 && contx == 4){
                            System.out.println(contx + "." + " " + tropap.SwitchPirata(contx).getNombre());
                            System.out.println("    "+nrec1+": "+tropap.SwitchPirata(contx).getPrecio1()+" | "+nrec2+": "+tropap.SwitchPirata(contx).getPrecio2()+" | "+nrec3+": "+tropap.SwitchPirata(contx).getPrecio3());
                            cant++;
                            cont++;
                            c--;
                        }
                        if (flag2 && contx == 3){
                            System.out.println(contx + "." + " " + tropap.SwitchPirata(contx).getNombre());
                            System.out.println("    "+nrec1+": "+tropap.SwitchPirata(contx).getPrecio1()+" | "+nrec2+": "+tropap.SwitchPirata(contx).getPrecio2()+" | "+nrec3+": "+tropap.SwitchPirata(contx).getPrecio3());
                            cant++;
                            cont++;
                            c--;
                        }
                    }
                    contx++;
                    c++;
                }
                o = input.nextInt();
                if (cant >= o && o > 0){
                    if (c == 3){
                        o = o+2;
                    }
                    if (c == 4){
                        o = o+3;
                    }
                    if(raza == 1){
                        if (rec1 > tropam.SwitchMago(o).getPrecio1() && rec2 > tropam.SwitchMago(o).getPrecio2() && rec3 > tropam.SwitchMago(o).getPrecio3()){
                            tropa = tropam.SwitchMago(o);
                            ListVehiculo.add(tropa);
                            System.out.println("Se empezó a construir el vehiculo seleccionado");
                        }
                        else{
                            System.out.println("No tiene suficientes recursos para construir el vehiculo");
                        }
                    }
                    if(raza == 2){
                        if (rec1 > tropan.SwitchNinja(o).getPrecio1() && rec2 > tropan.SwitchNinja(o).getPrecio2() && rec3 > tropan.SwitchNinja(o).getPrecio3()){
                            tropa = tropan.SwitchNinja(o);
                            ListVehiculo.add(tropa);
                            System.out.println("Se empezó a construir el vehiculo seleccionado");
                        }
                        else{
                            System.out.println("No tiene suficientes recursos para construir el vehiculo");
                        }
                    }
                    if(raza == 3){
                        if (rec1 > tropap.SwitchPirata(o).getPrecio1() && rec2 > tropap.SwitchPirata(o).getPrecio2() && rec3 > tropap.SwitchPirata(o).getPrecio3()){
                            tropa = tropap.SwitchPirata(o);
                            ListVehiculo.add(tropa);
                            System.out.println("Se empezó a construir el vehiculo seleccionado");
                        }
                        else{
                            System.out.println("No tiene suficientes recursos para construir el vehiculo");
                        }
                    }
                }
                else{
                    System.out.println("No ingreso una opcion valida");
                }
            }
            else{
                System.out.println("Su cuartel(es) se esta construyendo");
            }
        }
        else{
            System.out.println("No tiene creado ningun cuartel");
        }
    }
    
    public void MostrarTropas(){
        if(ValidarTropa(ListTropa) || ValidarTropa(ListVehiculo)){
            if(ValidarTropa(ListTropa)){
                MostrarTropa(ListTropa, 0, false);
            }
            if(ValidarTropa(ListVehiculo)){
                MostrarTropa(ListVehiculo, 0, false);
            }
        }
        else{
            System.out.println("No tiene ningun tropa/vehiculo creado hasta el momento");
        }
    }
    
    ////////////////////////////////////////////ATACAR/DEFENDER////////////////////////////////////////////
    
    public void AtacarDefender(ArrayList CM, ArrayList G, ArrayList R, ArrayList C, ArrayList CV){
        boolean flag = true;
        int o;
        Scanner input = new Scanner(System.in);
        while(flag){
            System.out.println("");
            System.out.println("|-------------------ATACAR/DEFENDER-------------------|");
            System.out.println("1. Atacar");
            System.out.println("2. Defender");
            System.out.println("3. Regresar");
            o = input.nextInt();
            switch(o){
                case 1:
                    Atacar(CM, G, R, C, CV);
                    break;
                case 2:
                    Defender();
                    break;
                case 3:
                    flag = false;
                    break;
                default:
                    System.out.println("La opcion que ingreso no es valida");
            }
        }
    }
    
    public void Atacar(ArrayList<CentroMando> CM, ArrayList<Recolector> G, ArrayList<Recolector> R, ArrayList<Cuartel> C, ArrayList<Cuartel> CV){
        Tropa tropa = new Tropa();
        boolean flag = true;
        if (ValidarTropa(ListVehiculo) || ValidarTropa(ListTropa)){
            int contt = 1, o;
            Scanner input1 = new Scanner(System.in);
            System.out.println("Seleccione la tropa a enviar");
            int contv = MostrarTropa(ListTropa, contt, true);
            int contf = MostrarTropa(ListVehiculo, contv, true);
            o = input1.nextInt();
            if (o >= contt && o <contv ){
                tropa = ListTropa.get(o-contt);
            }
            if (o >= contv && o < contf){
                tropa = ListVehiculo.get(o-contv);
            }
            if (o < contt || o > contf){
                System.out.println("No ingreso una opcion valida");
                flag = false;
            }
            if ((ValidarRecolector(G) || ValidarRecolector(R) || ValidarCuartel(C) || ValidarCuartel(CV)) && flag){
                flag = false;
                int contg = 1;
                Scanner input2 = new Scanner(System.in);
                boolean ataque = false;
                System.out.println("Seleccione la edificacion enemiga que desee atacar");
                int contr = MostrarRecolector(G, contg, true);
                int contc = MostrarRecolector(R, contr, true);
                int contcv = MostrarCuartel(C, contc, true);
                contf = MostrarCuartel(CV, contcv, true);
                o = input2.nextInt();
                if (o >= contg && o < contr){
                    tropa.setObjetivoR(G.get(o-contg));
                    tropa.setObjetivoC(null);
                    tropa.setObjetivoT(null);
                    tropa.setObjetivoCM(null);
                    ataque = true;
                }
                if (o >= contr && o < contc){
                    tropa.setObjetivoR(R.get(o-contr));
                    tropa.setObjetivoC(null);
                    tropa.setObjetivoT(null);
                    tropa.setObjetivoCM(null);
                    ataque = true;
                }
                if (o >= contc && o < contcv){
                    tropa.setObjetivoC(C.get(o-contc));
                    tropa.setObjetivoR(null);
                    tropa.setObjetivoT(null);
                    tropa.setObjetivoCM(null);
                    ataque = true;
                }
                if (o >= contcv && o < contf){
                    tropa.setObjetivoC(CV.get(o-contcv));
                    tropa.setObjetivoR(null);
                    tropa.setObjetivoT(null);
                    tropa.setObjetivoCM(null);
                    ataque = true;
                }
                if(ataque){
                    if(tropa.getLlegada() == 0){
                        System.out.println("La tropa empezara el ataque");
                    }
                    else{
                        System.out.println("La tropa seleccionada salio al ataque");
                    }
                }
                if (o < contg || o > contf){
                    System.out.println("No ingreso una opcion valida");
                }
            }
            if (flag){
                Scanner input = new Scanner(System.in);
                System.out.println("Seleccione la edificacion enemiga que desee atacar");
                System.out.println("1. " + CM.get(0).getNombre());
                o = input.nextInt();
                if(o == 1){
                    tropa.setObjetivoCM(CM.get(0));
                    tropa.setObjetivoR(null);
                    tropa.setObjetivoC(null);
                    tropa.setObjetivoT(null);
                    if(tropa.getLlegada() == 0){
                        System.out.println("La tropa empezara el ataque");
                    }
                    else{
                        System.out.println("La tropa seleccionada salio al ataque");
                    }
                }
                else{
                    System.out.println("No ingreso una opcion valida");
                }
            }
        }
    }
    
    public void Defender(){
        if (ValidarTropa(ListVehiculo) || ValidarTropa(ListTropa)){
            boolean flag = true;
            Tropa tropa = new Tropa();
            int contt = 1, o, op = 0;
            Scanner input1 = new Scanner(System.in);
            System.out.println("Seleccione la tropa a enviar");
            int contv = MostrarTropa(ListTropa, contt, true);
            int contf = MostrarTropa(ListVehiculo, contv, true);
            o = input1.nextInt();
            if (o >= contt && o <contv ){
                tropa = ListTropa.get(o-contt);
                op = 1;
            }
            if (o >= contv && o < contf){
                tropa = ListVehiculo.get(o-contv);
                op = 2;
            }
            if (o < contt || o > contf){
                System.out.println("No ingreso una opcion valida");
                flag = false;
            }
            if(ValidarTropa(ListEnemigo) && flag){
                int n;
                Scanner input = new Scanner(System.in);
                n = MostrarTropa(ListEnemigo, 1, true);
                o = input.nextInt();
                if(o >= 1 && o < n){
                    tropa.setObjetivoT(ListEnemigo.get(o-1));
                    tropa.setObjetivoR(null);
                    tropa.setObjetivoC(null);
                    tropa.setObjetivoCM(null);
                    if(tropa.getLlegada() != 0){
                        System.out.println("La tropa vendra de regreso para empezar el ataque");
                    }
                    else{
                        if(op == 1 && tropa.getLlegada() == 2){
                            System.out.println("La tropa empezara el ataque");
                        }
                        if(op == 2 && tropa.getLlegada() == 1){
                            System.out.println("La tropa empezara el ataque");
                        }
                    }
                }
                else{
                    System.out.println("No ingreso una opcion valida");
                }
            }
        }
    }
    
    //////////////////////////////////////////////CAMBIO FASE//////////////////////////////////////////////
    
    public void RecolectarRecurco(){
        if (!ListRecolector.isEmpty()){
            int size = ListRecolector.size(), cant = 0;
            for(int i = 0; i < size; i++){
                if (ListRecolector.get(i).getCantTurn() == 0 && ListRecolector.get(i).getVida() > 0){
                    cant = ListRecolector.get(i).getCantidad()+ListRecolector.get(i).getCantxTurno();
                    ListRecolector.get(i).setCantidad(cant);
                }
            }
        }
        if (!ListGenerador.isEmpty()){
            int size = ListGenerador.size();
            for(int i = 0; i < size; i++){
                if (ListGenerador.get(i).getCantTurn() == 0 && ListGenerador.get(i).getVida() > 0){
                    if(rec1+ListGenerador.get(i).getCantxTurno() <= ListCentroMando.get(0).getCapacidad1()){
                        rec1 = rec1+ListGenerador.get(i).getCantxTurno();
                    }
                    else{
                        int Aux = ListCentroMando.get(0).getCapacidad1()-rec1;
                        rec1 = rec1+Aux;
                        ListGenerador.get(i).setCantidad(ListGenerador.get(i).getCantxTurno()-Aux);
                    }
                }
            }
        }
    }
    
    public ArrayList Construccion(ArrayList mensajea){
        String mensaje = "";
        int size;
        if(!ListGenerador.isEmpty()){
            int cant;
            size = ListGenerador.size();
            for(int i = 0; i < size; i++){
                if(ListGenerador.get(i).getCantTurn() != 0){
                    cant = ListGenerador.get(i).getCantTurn()-1;
                    ListGenerador.get(i).setCantTurn(cant);
                    if (ListGenerador.get(i).getCantTurn() == 0){
                        mensaje = "Ya se construyo el generador " + ListGenerador.get(i).getNombre();
                        mensajea.add(mensaje);
                    }
                }
            }
        }
        if(!ListRecolector.isEmpty()){
            int cant;
            size = ListRecolector.size();
            for(int i = 0; i < size; i++){
                if(ListRecolector.get(i).getCantTurn() != 0){
                    cant = ListRecolector.get(i).getCantTurn()-1;
                    ListRecolector.get(i).setCantTurn(cant);
                    if (ListRecolector.get(i).getCantTurn() == 0){
                        mensaje = "Ya se construyo el recolector " + ListRecolector.get(i).getNombre();
                        mensajea.add(mensaje);
                    }
                }
            }
        }
        if(!ListCuartel.isEmpty()){
            int cant;
            size = ListCuartel.size();
            for(int i = 0; i < size; i++){
                if(ListCuartel.get(i).getCantTurn() != 0){
                    cant = ListCuartel.get(i).getCantTurn()-1;
                    ListCuartel.get(i).setCantTurn(cant);
                    if (ListCuartel.get(i).getCantTurn() == 0){
                        mensaje = "Ya se construyo el cuartel " + ListCuartel.get(i).getNombre();
                        mensajea.add(mensaje);
                    }
                }
            }
        }
        if(!ListConstructor.isEmpty()){
            int cant;
            size = ListConstructor.size();
            for(int i = 0; i < size; i++){
                if(ListConstructor.get(i).getCantTurn() != 0){
                    cant = ListConstructor.get(i).getCantTurn()-1;
                    ListConstructor.get(i).setCantTurn(cant);
                    if (ListConstructor.get(i).getCantTurn() == 0){
                        mensaje = "Ya se construyo el cuartel " + ListConstructor.get(i).getNombre();
                        mensajea.add(mensaje);
                    }
                }
            }
        }
        return mensajea;
    }
    
    public ArrayList Entrenamiento(ArrayList mensajea){
        String mensaje = "";
        int size, cant = 0;
        if (!ListTropa.isEmpty()){
            size = ListTropa.size();
            for(int i = 0; i < size; i++){
                if (ListTropa.get(i).getCantTurno() != 0){
                    cant = ListTropa.get(i).getCantTurno()-1;
                    ListTropa.get(i).setCantTurno(cant);
                    if (ListTropa.get(i).getCantTurno() == 0){
                        mensaje = "La tropa " + ListTropa.get(i).getNombre() + " ya esta lista para el ataque";
                        mensajea.add(mensaje);
                    }
                }
            }
        }
        if (!ListVehiculo.isEmpty()){
            size = ListVehiculo.size();
            for(int i = 0; i < size; i++){
                if (ListVehiculo.get(i).getCantTurno() != 0){
                    cant = ListVehiculo.get(i).getCantTurno()-1;
                    ListVehiculo.get(i).setCantTurno(cant);
                    if (ListVehiculo.get(i).getCantTurno() == 0){
                        mensaje = "El vehiculo " + ListVehiculo.get(i).getNombre() + " ya esta listo para el ataque";
                        mensajea.add(mensaje);
                    }
                }
            }
        }
        return null;
    }
    
    public void Atacando(ArrayList mensaje1, ArrayList mensaje2, ArrayList E){
        if(ValidarTropa(ListTropa)){
            AtacandoBase(ListTropa, mensaje1, mensaje2, 1);
            Llegada(ListTropa, mensaje1, E, 1);
        }
        if(ValidarTropa(ListVehiculo)){
            AtacandoBase(ListVehiculo, mensaje1, mensaje2, 2);
            Llegada(ListVehiculo, mensaje1, E, 2);
        }
    }
    
    public void Llegada(ArrayList<Tropa> array, ArrayList mensajea, ArrayList<Tropa> E, int n){
        String mensaje;
        int size = array.size(), llegada;
        for(int i = 0; i < size; i++){
            if(array.get(i).getObjetivoR() != null || array.get(i).getObjetivoC() != null || array.get(i).getObjetivoCM() != null){
                if (array.get(i).getLlegada() != 0){
                    llegada = array.get(i).getLlegada()-1;
                    array.get(i).setLlegada(llegada);
                    if (array.get(i).getLlegada() == 0){
                        mensaje = "La tropa/vehiculo " + array.get(i).getNombre() + " ha llegado a la base enemiga";
                        mensajea.add(mensaje);
                        E.add(array.get(i));
                    }
                }
            }
            if(array.get(i).getObjetivoT() != null){
                if(array.get(i).getLlegada() == 0){
                    llegada = array.get(i).getLlegada()+1;
                    array.get(i).setLlegada(llegada);
                    if(n == 2){
                        mensaje = "El vehiculo " + array.get(i).getNombre() + " ha regresado a la base";
                        mensajea.add(mensaje);
                        if(E.contains(array.get(i))){
                            E.remove(array.get(i));
                        }
                    }
                }
                if (array.get(i).getLlegada() == 1 && n == 1){
                    llegada = array.get(i).getLlegada()+1;
                    array.get(i).setLlegada(llegada);
                    if (array.get(i).getLlegada() == 2){
                        mensaje = "La tropa " + array.get(i).getNombre() + " ha regresado a la base";
                        mensajea.add(mensaje);
                        if(E.contains(array.get(i))){
                            E.remove(array.get(i));
                        }
                    }
                }
            }
        }
    }
    
    public void AtacandoBase(ArrayList<Tropa> array, ArrayList mensajea1, ArrayList mensajea2, int n){
        String mensaje1, mensaje2;
        int ataque, golpe;
        int size = array.size(), llegada;
        for(int i = 0; i < size; i++){
            if(array.get(i).getObjetivoR() != null){
                if (array.get(i).getLlegada() == 0){
                    ataque = array.get(i).getAtaque();
                    golpe = array.get(i).getObjetivoR().getVida() - ataque;
                    if (golpe <= 0){
                        golpe = 0;
                    }
                    array.get(i).getObjetivoR().setVida(golpe);
                    mensaje1 = "La tropa " + array.get(i).getNombre() + " a hecho " + ataque + " de daño";
                    mensajea1.add(mensaje1);
                    mensaje2 = "La edificacion " + array.get(i).getObjetivoR().getNombre() + " ha recibido " + ataque + " de daño";
                    mensajea2.add(mensaje2);
                    if (golpe == 0){
                        mensaje1 = "La tropa " + array.get(i).getNombre() + " ha destruido la edificacion " + array.get(i).getObjetivoR().getNombre();
                        mensaje2 = "La edificacion " + array.get(i).getObjetivoR().getNombre() + " ha sido destruida";
                        mensajea1.add(mensaje1);
                        mensajea2.add(mensaje2);
                        mensaje1 = "Selecciona otro objetivo para la tropa " + array.get(i).getNombre();
                        mensajea1.add(mensaje1);
                        array.get(i).setObjetivoR(null);
                    }
                }
            }
            if (array.get(i).getObjetivoC() != null){
                if (array.get(i).getLlegada() == 0){
                    ataque = array.get(i).getAtaque();
                    golpe = array.get(i).getObjetivoC().getVida() - ataque;
                    if (golpe <= 0){
                        golpe = 0;
                    }
                    array.get(i).getObjetivoC().setVida(golpe);
                    mensaje1 = "La tropa " + array.get(i).getNombre() + " a hecho " + ataque + " de daño";
                    mensajea1.add(mensaje1);
                    mensaje2 = "La edificacion " + array.get(i).getObjetivoC().getNombre() + " ha recibido " + ataque + " de daño";
                    mensajea2.add(mensaje2);
                    if (golpe == 0){
                        mensaje1 = "La tropa " + array.get(i).getNombre() + " ha destruido la edificacion " + array.get(i).getObjetivoC().getNombre();
                        mensaje2 = "La edificacion " + array.get(i).getObjetivoC().getNombre() + " ha sido destruida";
                        mensajea1.add(mensaje1);
                        mensajea2.add(mensaje2);
                        mensaje1 = "Selecciona otro objetivo para la tropa " + array.get(i).getNombre();
                        mensajea1.add(mensaje1);
                        array.get(i).setObjetivoC(null);
                    }
                }
            }
            if (array.get(i).getObjetivoT() != null){
                if ((array.get(i).getLlegada() == 2 && n == 1) || (array.get(i).getLlegada() == 1 && n == 2)){
                    ataque = array.get(i).getAtaque();
                    golpe = array.get(i).getObjetivoT().getVida() - ataque;
                    if (golpe <= 0){
                        golpe = 0;
                    }
                    array.get(i).getObjetivoT().setVida(golpe);
                    mensaje1 = "La tropa " + array.get(i).getNombre() + " a hecho " + ataque + " de daño";
                    mensajea1.add(mensaje1);
                    mensaje2 = "La tropa " + array.get(i).getObjetivoT().getNombre() + " ha recibido " + ataque + " de daño";
                    mensajea2.add(mensaje2);
                    if (golpe == 0){
                        mensaje1 = "La tropa " + array.get(i).getNombre() + " ha derrotado al enemigo " + array.get(i).getObjetivoT().getNombre();
                        mensaje2 = "La tropa " + array.get(i).getObjetivoT().getNombre() + " ha sido derrotada";
                        mensajea1.add(mensaje1);
                        mensajea2.add(mensaje2);
                        mensaje1 = "Selecciona otro objetivo para la tropa " + array.get(i).getNombre();
                        mensajea1.add(mensaje1);
                        array.get(i).setObjetivoT(null);
                    }
                }
            }
            if (array.get(i).getObjetivoCM() != null){
                if (array.get(i).getLlegada() == 0){
                    ataque = array.get(i).getAtaque();
                    golpe = array.get(i).getObjetivoCM().getVida() - ataque;
                    if (golpe <= 0){
                        golpe = 0;
                    }
                    array.get(i).getObjetivoCM().setVida(golpe);
                    mensaje1 = "La tropa " + array.get(i).getNombre() + " a hecho " + ataque + " de daño";
                    mensajea1.add(mensaje1);
                    mensaje2 = "El centro de mando " + array.get(i).getObjetivoCM().getNombre() + " ha recibido " + ataque + " de daño";
                    mensajea2.add(mensaje2);
                    if (golpe == 0){
                        mensaje1 = "La tropa " + array.get(i).getNombre() + " ha destruido el centro de mando " + array.get(i).getObjetivoCM().getNombre();
                        mensaje2 = "El centro de mando " + array.get(i).getObjetivoCM().getNombre() + " ha sido destruido";
                        mensajea1.add(mensaje1);
                        mensajea2.add(mensaje2);
                        array.get(i).setObjetivoT(null);
                    }
                }
            }
        }
    }
    
    ////////////////////////////////////////////////GENERAL////////////////////////////////////////////////
    
    public int MostrarRecolector(ArrayList<Recolector> array, int cont, boolean flag){
        if(!array.isEmpty()){
            int size = array.size();
            for(int i = 0; i < size; i++){
                if(array.get(i).getCantTurn() == 0 && array.get(i).getVida() > 0){
                    if (flag == false){
                        System.out.println("- " + array.get(i).getNombre());
                    }
                    else{
                        System.out.println(cont + ". " + array.get(i).getNombre());
                        cont++;
                    }
                }
            }
        }
        return cont;
    }
    
    public int MostrarCuartel(ArrayList<Cuartel> array, int cont, boolean flag){
        if(!array.isEmpty()){
            int size = array.size();
            for(int i = 0; i < size; i++){
                if(array.get(i).getCantTurn() == 0 && array.get(i).getVida() > 0){
                    if (flag == false){
                        System.out.println("- " + array.get(i).getNombre());
                    }
                    else{
                        System.out.println(cont + ". " + array.get(i).getNombre());
                        cont++;
                    }
                }
            }
        }
        return cont;
    }
    
    public int MostrarTropa(ArrayList<Tropa> array, int cont, boolean flag){
        if(!array.isEmpty()){
            int size = array.size();
            for(int i = 0; i < size; i++){
                if(array.get(i).getCantTurno() == 0 && array.get(i).getVida() > 0){
                    if (flag == false){
                        System.out.println("- " + array.get(i).getNombre());
                    }
                    else{
                        System.out.println(cont + ". " + array.get(i).getNombre());
                        cont++;
                    }
                }
            }
        }
        return cont;
    }
    
    public boolean ValidarRecolector(ArrayList<Recolector> array){
        if(!array.isEmpty()){
            int size = array.size();
            for(int i = 0; i < size; i++){
                if(array.get(i).getCantTurn() == 0 && array.get(i).getVida() > 0){
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean ValidarCuartel(ArrayList<Cuartel> array){
        if(!array.isEmpty()){
            int size = array.size();
            for(int i = 0; i < size; i++){
                if(array.get(i).getCantTurn() == 0 && array.get(i).getVida() > 0){
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean ValidarTropa(ArrayList<Tropa> array){
        if(!array.isEmpty()){
            int size = array.size();
            for(int i = 0; i < size; i++){
                if(array.get(i).getCantTurno() == 0 && array.get(i).getVida() > 0){
                    return true;
                }
            }
        }
        return false;
    }
}
