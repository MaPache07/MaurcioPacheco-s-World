/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mago;

import Razas.*;

/**
 *
 * @author MaPache
 */
public class EstabloPegaso implements Mago{
    
    private Cuartel EstabloPegaso;
    
    @Override
    public void crearEdificacion() {
        EstabloPegaso.setNombre("Establo de Pegasos");
        EstabloPegaso.setVida(85);
        EstabloPegaso.setCapacidad(10);
        EstabloPegaso.setCantidad(0);
        EstabloPegaso.setCantxTurno(0);
    }

    @Override
    public Recolector getRecolector() {
        return null;
    }

    @Override
    public Cuartel getCuartel() {
        return this.EstabloPegaso;
    }

    @Override
    public CentroMando getCentroMando() {
        return null;
    }
    
}