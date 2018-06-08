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
public class CuevaBijus implements Ninja{
    
    private Edificacion CuevaBijus;
    private static CuevaBijus BaseV1;
    
    @Override
    public void crearEdificacion() {
        CuevaBijus.setNombre("Cueva de Bijus");
        CuevaBijus.setVida(130);
        CuevaBijus.setCapacidad(10);
    }

    @Override
    public Edificacion getEdificacion() {
        return this.CuevaBijus;
    }
    
}
