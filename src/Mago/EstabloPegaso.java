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
    
    private static Cuartel EstabloPegaso = new Cuartel();
    
    @Override
    public void crearEdificacion() {
        EstabloPegaso.setNombre("Establo de Pegasos");
        EstabloPegaso.setVida(900);
        EstabloPegaso.setCapacidad(10);
        EstabloPegaso.setCantidad(0);
        EstabloPegaso.setCantxTurno(2);
        EstabloPegaso.setCantTurn(2);
        EstabloPegaso.setCodigo(2);
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

    @Override
    public int getPrecio1() {
        return 1000;
    }

    @Override
    public int getPrecio2() {
        return 0;
    }

    @Override
    public int getPrecio3() {
        return 4500;
    }

    @Override
    public String getNombre() {
        return "Establo de pegasos";
    }
    
}
