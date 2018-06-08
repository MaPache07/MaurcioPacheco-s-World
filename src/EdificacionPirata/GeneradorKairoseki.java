/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EdificacionPirata;

import Razas.*;

/**
 *
 * @author MaPache
 */
public class GeneradorKairoseki implements Pirata{
    
    private Edificacion GeneradorKairoseki;
    private static GeneradorKairoseki GeneradorR1;
    
    @Override
    public void crearEdificacion() {
        GeneradorKairoseki.setNombre("Generador de Kairoseki");
        GeneradorKairoseki.setVida(150);
        GeneradorKairoseki.setCapacidad(0);
    }

    @Override
    public Edificacion getEdificacion() {
        return this.GeneradorKairoseki;
    }
    
}
