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
    
    public Tropa SwitchMago(int type){
        
        switch(type){
            case (1):
                Archimago a = new Archimago();
                a.crearTropa();
                return a.getTropa();
            case (2):
                MagosElementales m = new MagosElementales();
                m.crearTropa();
                return m.getTropa();
            case (3):
                Pegaso p = new Pegaso();
                p.crearTropa();
                return p.getTropa();
            case (4):
                Fenix f = new Fenix();
                f.crearTropa();
                return f.getTropa();
        }
        return null;
    }
}
