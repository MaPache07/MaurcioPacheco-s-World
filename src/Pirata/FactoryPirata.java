/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pirata;

import Razas.*;

/**
 *
 * @author MaPache
 */
public class FactoryPirata implements AbstractFactory{

    @Override
    public Ninja getNinja(int type) {
        return null;
    }

    @Override
    public Mago getMago(int type) {
        return null;
    }

    @Override
    public Pirata getPirata(int type) {
        switch(type){
            case (1):
                return new GeneradorKairoseki();
            case (2):
                return new MinaOro();
            case (3):
                return new MinaEbano();
            case (4):
                return new Comedor();
            case (5):
                return new BarcoPirata();
            case (6):
                return new MarTiburon();
            case (7):
                return new PuertoPirata();
        }
        return null;
    }
    
}
