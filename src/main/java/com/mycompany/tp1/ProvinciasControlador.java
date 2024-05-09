/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp1;

/**
 *
 * @author Luly
 */
import spark.Route;

public class ProvinciasControlador {
    public static Route provincias = (var request, var response) ->{
        ApiProvinciasDAO provDAO = new ApiProvinciasDAO();
        return provDAO.consultar();
    };        
}
