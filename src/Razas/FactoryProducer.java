/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Razas;

import Mago.FactoryMago;
import Ninja.FactoryNinja;
import Pirata.FactoryPirata;

/**
 *
 * @author MaPache
 */
public class FactoryProducer {
    public static AbstractFactory getRaza(String type){
        switch(type){
            case "Ninja":
                return new FactoryNinja();
            case "Mago":
                return new FactoryMago();
            case "Pirata":
                return new FactoryPirata();
        }
        return null;
    }
}
