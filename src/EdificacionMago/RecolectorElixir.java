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
public class RecolectorElixir implements Mago{
    
    private Edificacion RecolectorElixir;
    private static RecolectorElixir RecolectorR3;
    
    @Override
    public void crearEdificacion() {
        RecolectorElixir.setNombre("Recolector de Elixir");
        RecolectorElixir.setVida(80);
        RecolectorElixir.setCapacidad(0);
    }

    @Override
    public Edificacion getEdificacion() {
        return this.RecolectorElixir;
    }
    
}
