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
public interface RecolectorPlan {
    public void setNombre(String nombre);
    public void setVida(int vida);
    public void setCapacidad(int capacidad);
    public void setCantidad(int cantidad);
    public void setCantxTurno(int cant);
    public void setCantTurn(int turn);
    public String getNombre();
    public int getVida();
    public int getCapacidad();
    public int getCantidad();
    public int getCantxTurno();
    public int getCantTurn();
    public void CrearTropaNinja(String nombre);
    public void CrearTropaMago(String nombre);
    public void CrearTropaPirata(String nombre);
}
