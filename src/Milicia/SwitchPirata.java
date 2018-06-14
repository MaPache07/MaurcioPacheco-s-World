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
    
    public Tropa SwitchPirata(int type){
        
        switch(type){
            case (1):
                Yonkou y = new Yonkou();
                y.crearTropa();
                return y.getTropa();
            case (2):
                Piratas p = new Piratas();
                p.crearTropa();
                return p.getTropa();
            case (3):
                Tiburon t = new Tiburon();
                t.crearTropa();
                return t.getTropa();
            case (4):
                Barco b = new Barco();
                b.crearTropa();
                return b.getTropa();
        }
        return null;
    }
}
