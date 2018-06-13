/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Milicia;

/**
 *
 * @author MaPache
 */
public interface TropaPlan {
    public void setNombre(String nombre);
    public void setVida(int vida);
    public void setAtaque(int ataque);
    public void setCantTurno(int cant);
    public String getNombre();
    public int getVida();
    public int getAtaque();
    public int getCantTurno();
}
