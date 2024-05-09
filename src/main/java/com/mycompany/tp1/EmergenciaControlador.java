/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp1;

/**
 *
 * @author Luly
 */

import spark.Request;
import spark.Response;
import spark.Route;

public class EmergenciaControlador {
    public static Route emergencia = (Request request, Response response) ->{
        EmergenciaDAO eDAO = new EmergenciaDAO();
        String t = eDAO.getTelefono(request.queryParams("emergencia"));
        
        return "Teléfono: " + t;
    };
}
