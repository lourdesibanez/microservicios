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
public class Dolar {
    float compra, venta;
    String casa, nombre, fechaActualizacion;
    public Dolar(String casa, String nombre, String fechaActualizacion, int compra, int venta){
        this.casa = casa;
        this.nombre = nombre;
        this.fechaActualizacion = fechaActualizacion;
        this.compra = compra;
        this.venta = venta;
    }
}
