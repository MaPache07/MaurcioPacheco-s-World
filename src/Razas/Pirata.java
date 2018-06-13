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
public interface Pirata {
    public void crearEdificacion();
    public Recolector getRecolector();
    public Cuartel getCuartel();
    public CentroMando getCentroMando();
    public String getNombre();
    public int getPrecio1();
    public int getPrecio2();
    public int getPrecio3();
}
