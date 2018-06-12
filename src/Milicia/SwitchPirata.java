/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Milicia;

import Pirata.Tropas.*;

/**
 *
 * @author MaPache
 */
public class SwitchPirata {
    
    public Tropa SwitchPirata(String nombre){
        
        switch(nombre){
            case ("Barco"):
                Barco b = new Barco();
                b.crearTropa();
                return b.getTropa();
            case ("Piratas"):
                Piratas p = new Piratas();
                p.crearTropa();
                return p.getTropa();
            case ("Tiburon"):
                Tiburon t = new Tiburon();
                t.crearTropa();
                return t.getTropa();
            case ("Yonkou"):
                Yonkou y = new Yonkou();
                y.crearTropa();
                return y.getTropa();
        }
        return null;
    }
}
