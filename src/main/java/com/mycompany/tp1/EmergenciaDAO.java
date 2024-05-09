/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp1;

/**
 *
 * @author Luly
 */
import java.util.ArrayList;
import java.util.List;

public class EmergenciaDAO {
    private List<Emergencia> emergencias;
    
    public void init(){
        emergencias = new ArrayList<>();
        Emergencia policia, bomberos, ambulancia, defcivil, violgen;
        
        policia = new Emergencia("Policía","101");
        emergencias.add(policia);
        
        bomberos = new Emergencia("Bomberos","100");
        emergencias.add(bomberos);
        
        ambulancia = new Emergencia("Ambulancia","107");
        emergencias.add(ambulancia);
        
        defcivil = new Emergencia("Defensa Civil","103");
        emergencias.add(defcivil);
        
        violgen = new Emergencia("Violencia de Género","144");
        emergencias.add(violgen);
    }
    
    public String getTelefono(String nombre){
        init();
        
        String telefono;
        
        Emergencia eEncontrada = emergencias.stream()
            .filter(e -> nombre.equals(e.getNombre()))
            .findAny()
            .orElse(null);
        
        if(eEncontrada != null){
            telefono = eEncontrada.getTelefono();
        }
        else{
            telefono = null;
        }
        
        return telefono;
    }
}
