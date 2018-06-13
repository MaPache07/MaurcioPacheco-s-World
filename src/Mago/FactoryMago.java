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
    public Ninja getNinja(int type) {
        return null;
    }

    @Override
    public Mago getMago(int type) {
        switch (type){
            case (1):
                return new GeneradorMagia();
            case (2):
                return new RecolectorEter();
            case (3):
                return new RecolectorElixir();
            case (4):
                return new SalaMagos();
            case (5):
                return new EstabloPegaso();
            case (6):
                return new NidoFenix();
            case (7):
                return new ArbolVida();
        }
        return null;
    }

    @Override
    public Pirata getPirata(int type) {
        return null;
    }
    
}
