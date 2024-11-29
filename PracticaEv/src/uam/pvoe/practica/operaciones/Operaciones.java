/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uam.pvoe.practica.operaciones;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.StringTokenizer;
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
        Estado estadoNulo = new Estado();
        estadoNulo.setNombre("Seleccione un estado");
        estadoNulo.setClave("NULL");
        listaEstados.addFirst(estadoNulo);
        String message = "";
        try{
            FileReader fr = new FileReader("estados.dat");
            BufferedReader br = new BufferedReader(fr);
            message = br.readLine();
            while (message != null){
                Estado estado = new Estado();
                StringTokenizer st = new StringTokenizer(message, ",");
                estado.setNombre(st.nextToken());
                estado.setClave(st.nextToken());
                listaEstados.add(estado);
                message = br.readLine();
            }
            br.close();
        } catch(FileNotFoundException e){
            System.out.println("Hubo un problema con la lectura del archivo estados.dat");
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
        return listaEstados;
    }
    
    
    /*Cargar del archivo los atractivos de un estado*/
    public LinkedList<Atractivo>llenarListaAtractivos(String claveEstado){
        LinkedList<Atractivo> listaAtractivos = new LinkedList();
        
        String message = "";
        try{
            FileReader fr = new FileReader("atractivos.dat");
            BufferedReader br = new BufferedReader(fr);
            message = br.readLine();
            while (message != null){
                Atractivo atractivo = new Atractivo();
                StringTokenizer st = new StringTokenizer(message, ",");

                atractivo.setClaveAtractivo(st.nextToken());
                atractivo.setNombre(st.nextToken());
                
                String claveState[] = atractivo.getClaveAtractivo().split("[^a-zA-Z]{3}");
                
                if (claveState[0].equals(claveEstado)){
                    listaAtractivos.add(atractivo);
                }
                
                message = br.readLine();
            }
            br.close();
        } catch(FileNotFoundException e){
            System.out.println("Hubo un problema con la lectura del archivo estados.dat");
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return listaAtractivos;
    }
    
    
    
    
}
