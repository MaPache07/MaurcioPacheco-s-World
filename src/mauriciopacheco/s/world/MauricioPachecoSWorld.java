/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mauriciopacheco.s.world;
import Pirata.FactoryPirata;
import Razas.*;

 /*
 * @author MaPache
 */
public class MauricioPachecoSWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FactoryPirata Pirata = new FactoryPirata();
        Pirata.getPirata("Comedor").crearEdificacion();
        Cuartel cuartel = new Cuartel();
        cuartel = Pirata.getPirata("Comedor").getCuartel();
        System.out.println(cuartel.getNombre());
    }
}