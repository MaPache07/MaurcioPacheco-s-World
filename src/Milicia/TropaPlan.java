/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Milicia;

import Razas.*;

/**
 *
 * @author MaPache
 */
public interface TropaPlan {
    public void setNombre(String nombre);
    public void setVida(int vida);
    public void setAtaque(int ataque);
    public void setCantTurno(int cant);
    public void setLlegada(int llegada);
    public void setPrecio1(int precio);
    public void setPrecio2(int precio);
    public void setPrecio3(int precio);
    public void setObjetivoR(Recolector recolector);
    public void setObjetivoC(Cuartel cuartel);
    public void setObjetivoT(Tropa tropa);
    public String getNombre();
    public int getVida();
    public int getAtaque();
    public int getCantTurno();
    public int getLlegada();
    public int getPrecio1();
    public int getPrecio2();
    public int getPrecio3();
    public Recolector getObjetivoR();
    public Cuartel getObjetivoC();
    public Tropa getObjetivoT();
}
