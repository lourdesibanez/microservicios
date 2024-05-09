/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp1;

/**
 *
 * @author Luly
 */

import lombok.Data;
@Data
public class Emergencia {
    private String nombre, telefono;
    
    Emergencia(String nombre, String telefono){
        this.nombre = nombre;
        this.telefono = telefono;
    }
}
