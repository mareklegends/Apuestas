/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apuestas;

import java.io.Serializable;

/**
 *
 * @author alumno
 */
public class Apuesta implements Serializable{
    private String nombre;
    private int alocal;
    private int avisitante;
    private boolean pagado;

    public Apuesta(String nombre, int alocal, int avisitante, boolean pagado) {
        this.nombre = nombre;
        this.alocal = alocal;
        this.avisitante = avisitante;
        this.pagado = pagado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAlocal() {
        return alocal;
    }

    public void setAlocal(int alocal) {
        this.alocal = alocal;
    }

    public int getAvisitante() {
        return avisitante;
    }

    public void setAvisitante(int avisitante) {
        this.avisitante = avisitante;
    }

    public boolean isPagado() {
        return pagado;
    }

    public void setPagado(boolean pagado) {
        this.pagado = pagado;
    }
    
    
}
