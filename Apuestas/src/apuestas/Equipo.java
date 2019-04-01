/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apuestas;

/**
 *
 * @author alumno
 */
public class Equipo {
    private String elocal;
    private String evisitante;

    public Equipo(String elocal, String evisitante) {
        this.elocal = elocal;
        this.evisitante = evisitante;
    }

    public String getElocal() {
        return elocal;
    }

    public void setElocal(String elocal) {
        this.elocal = elocal;
    }

    public String getEvisitante() {
        return evisitante;
    }

    public void setEvisitante(String evisitante) {
        this.evisitante = evisitante;
    }
    
    
    
}
