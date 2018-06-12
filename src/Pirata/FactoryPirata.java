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
    public Ninja getNinja(String type) {
        return null;
    }

    @Override
    public Mago getMago(String type) {
        return null;
    }

    @Override
    public Pirata getPirata(String type) {
        switch(type){
            case ("GeneradorKairoseki"):
                return new GeneradorKairoseki();
            case ("MinaOro"):
                return new MinaOro();
            case ("MinaEbano"):
                return new MinaEbano();
            case ("Comedor"):
                return new Comedor();
            case ("PuertoPirata"):
                return new PuertoPirata();
            case ("MarTiburon"):
                return new MarTiburon();
        }
        return null;
    }
    
}
