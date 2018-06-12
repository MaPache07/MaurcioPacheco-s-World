/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Milicia;

import Mago.Tropas.*;

/**
 *
 * @author MaPache
 */
public class SwitchMago {
    
    public Tropa SwitchMago(String nombre){
        
        switch(nombre){
            case ("Archimago"):
                Archimago a = new Archimago();
                a.crearTropa();
                return a.getTropa();
            case ("Fenix"):
                Fenix f = new Fenix();
                f.crearTropa();
                return f.getTropa();
            case ("MagosElementales"):
                MagosElementales m = new MagosElementales();
                m.crearTropa();
                return m.getTropa();
            case ("Pegaso"):
                Pegaso p = new Pegaso();
                p.crearTropa();
                return p.getTropa();
        }
        return null;
    }
}
