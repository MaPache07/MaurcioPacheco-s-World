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
    
    public Tropa SwitchNinja(int type){
        
        switch(type){
            case (1):
                Hokage h = new Hokage();
                h.crearTropa();
                return h.getTropa();
            case (2):
                Chunin c = new Chunin();
                c.crearTropa();
                return c.getTropa();
            case (3):
                Sapo s = new Sapo();
                s.crearTropa();
                return s.getTropa();
            case (4):
                Bijuu b = new Bijuu();
                b.crearTropa();
                return b.getTropa();
        }
        return null;
        
    }
}
