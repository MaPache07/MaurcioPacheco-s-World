/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EdificacionNinja;

import Razas.*;

/**
 *
 * @author MaPache
 */
public class GeneradorChakra implements Ninja{
    
    private Edificacion RecolectorChakra;
    private static GeneradorChakra GeneradorR1;
    
    @Override
    public void crearEdificacion() {
        RecolectorChakra.setNombre("Generador de Chakra");
        RecolectorChakra.setVida(100);
        RecolectorChakra.setCapacidad(0);
    }

    @Override
    public Edificacion getEdificacion() {
        return this.RecolectorChakra;
    }
    
}
