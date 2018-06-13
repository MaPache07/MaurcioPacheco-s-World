/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mago;

import Razas.*;

/**
 *
 * @author MaPache
 */
public class FactoryMago implements AbstractFactory {

    @Override
    public Ninja getNinja(String type) {
        return null;
    }

    @Override
    public Mago getMago(String type) {
        switch (type){
            case ("CentroMando"):
                
            case ("RecolectorEter"):
                return new RecolectorEter();
            case ("GeneradorMagia"):
                return new GeneradorMagia();
            case ("RecolectorElixir"):
                return new RecolectorElixir();
            case ("SalaMagos"):
                return new SalaMagos();
            case ("NidoFeix"):
                return new NidoFenix();
            case ("EstabloPegaso"):
                return new EstabloPegaso();
        }
        return null;
    }

    @Override
    public Pirata getPirata(String type) {
        return null;
    }
    
}
