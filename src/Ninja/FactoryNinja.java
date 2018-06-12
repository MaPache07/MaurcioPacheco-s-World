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
    public Ninja getNinja(String type) {
        switch(type){
            case ("GeneradorChakra"):
                return new GeneradorChakra();
            case ("MinaPiedraLunar"):
                return new MinaPiedraLunar();
            case ("MinaMetal"):
                return new MinaMetal();
            case ("CuartelNinja"):
                return new CuartelNinja();
            case ("CuevaBijus"):
                return new CuevaBijus();
            case ("LagoSapos"):
                return new LagoSapos();
        }
        return null;
    }

    @Override
    public Mago getMago(String type) {
       return null; 
    }

    @Override
    public Pirata getPirata(String type) {
        return null;
    }
    
}
