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
public class MedioTransporte {
    
    private int nombre;
        /*Los nombres deberán ser Auto, Autobús, Avión, Auto Rentado*/
          
    private int clave;
        /*Las claves deberán ser AUTO, BUS, AVION, AUTO_R*/

    
    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }
    
    
    
    
}
