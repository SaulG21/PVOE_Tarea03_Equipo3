/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uam.pvoe.practica.operaciones;

import java.util.LinkedList;
import uam.pvoe.practica.modelo.Atractivo;
import uam.pvoe.practica.modelo.Estado;

/**
 *
 * @author
 */
public class Operaciones {
    
    /*Cargar del archivo los estados*/
    public LinkedList<Estado>llenarListaEstados(){
        LinkedList<Estado> listaEstados = new LinkedList();
        return listaEstados;
    }
    
    
    /*Cargar del archivo los atractivos de un estado*/
    public LinkedList<Atractivo>llenarListaAtractivos(String claveEstado){
        LinkedList<Atractivo> listaAtractivos = new LinkedList();
        return listaAtractivos;
    }
    
    
    
    
}
