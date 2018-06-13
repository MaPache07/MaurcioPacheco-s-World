/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ninja;

import Razas.*;

/**
 *
 * @author MaPache
 */
public class FactoryNinja implements AbstractFactory{

    @Override
    public Ninja getNinja(int type) {
        switch(type){
            case (1):
                return new GeneradorChakra();
            case (2):
                return new MinaPiedraLunar();
            case (3):
                return new MinaMetal();
            case (4):
                return new CuartelNinja();
            case (5):
                return new LagoSapos();
            case (6):
                return new CuevaBijus();
            case (7):
                return new AldeaNinja();
        }
        return null;
    }

    @Override
    public Mago getMago(int type) {
       return null; 
    }

    @Override
    public Pirata getPirata(int type) {
        return null;
    }
    
}
