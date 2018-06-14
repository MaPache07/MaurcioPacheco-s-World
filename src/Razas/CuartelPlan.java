/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Razas;

import Milicia.SwitchNinja;
import Milicia.TropaGeneral;

/**
 *
 * @author MaPache
 */
public interface CuartelPlan {
    public void setNombre(String nombre);
    public void setVida(int vida);
    public void setCapacidad(int capacidad);
    public void setCantidad(int cantidad);
    public void setCantxTurno(int cant);
    public void setCantTurn(int turn);
    public void setCodigo(int codigo);
    public String getNombre();
    public int getVida();
    public int getCapacidad();
    public int getCantidad();
    public int getCantxTurno();
    public int getCantTurn();
    public int getCodigo();
    public void CrearTropaNinja(int type);
    public void CrearTropaMago(int type);
    public void CrearTropaPirata(int type);
}
