/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp1;

/**
 *
 * @author Luly
 */
//para que me ponga automaticamente los getter y setter
import lombok.Data;
@Data              
public class Partido {
    String equipo1, equipo2, resultado, ronda;
    boolean jugado;
    
    Partido(String equipo1, String equipo2, String resultado, String ronda, boolean jugado){
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.resultado = resultado;
        this.ronda = ronda;
        this.jugado = jugado;
    } 
    
}
