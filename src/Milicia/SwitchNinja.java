/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Milicia;

import Ninja.Tropas.*;

/**
 *
 * @author MaPache
 */
public class SwitchNinja {
    
    public Tropa SwitchNinja(String nombre){
        
        switch(nombre){
            case ("Bijuu"):
                Bijuu b = new Bijuu();
                b.crearTropa();
                return b.getTropa();
            case ("Chunin"):
                Chunin c = new Chunin();
                c.crearTropa();
                return c.getTropa();
            case ("Hokage"):
                Hokage h = new Hokage();
                h.crearTropa();
                return h.getTropa();
            case ("Sapo"):
                Sapo s = new Sapo();
                s.crearTropa();
                return s.getTropa();
        }
        return null;
        
    }
}
