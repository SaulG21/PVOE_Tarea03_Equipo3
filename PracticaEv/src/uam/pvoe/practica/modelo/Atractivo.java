/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uam.pvoe.practica.modelo;

/**
 *
 * @author
 */
public class Atractivo {
    
    private String nombre;
    private String claveAtractivo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClaveAtractivo() {
        return claveAtractivo;
    }

    public void setClaveAtractivo(String claveEstado) {
        this.claveAtractivo = claveEstado;
    }   

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
    
    
}
