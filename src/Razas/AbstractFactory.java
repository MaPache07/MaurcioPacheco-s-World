/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Razas;

/**
 *
 * @author MaPache
 */
public interface AbstractFactory {
    Ninja getNinja(int type);
    Mago getMago(int type);
    Pirata getPirata(int type);
}
