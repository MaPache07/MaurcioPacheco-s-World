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
public interface CentroMandoPlan {
    public void setNombre(String nombre);
    public void setVida(int vida);
    public void setCapacidad1(int capacidad);
    public void setCapacidad2(int capacidad);
    public void setCapacidad3(int capacidad);
    public void setCantidad1(int cantidad);
    public void setCantidad2(int cantidad);
    public void setCantidad3(int cantidad);
    public void setNivel(int nivel);
    public String getNombre();
    public int getVida();
    public int getCapacidad1();
    public int getCapacidad2();
    public int getCapacidad3();
    public int getCantidad1();
    public int getCantidad2();
    public int getCantidad3();
    public int getNivel();
}
