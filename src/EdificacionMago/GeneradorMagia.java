/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EdificacionMago;

import Razas.*;

/**
 *
 * @author MaPache
 */
public class GeneradorMagia implements Mago{
    
    private Edificacion GeneradorMagia;
    private static GeneradorMagia GeneradorR1;
    
    @Override
    public void crearEdificacion() {
        GeneradorMagia.setNombre("Generador de Magia");
        GeneradorMagia.setVida(80);
        GeneradorMagia.setCapacidad(0);
    }

    @Override
    public Edificacion getEdificacion() {
        return this.GeneradorMagia;
    }
    
}
