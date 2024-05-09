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
import java.util.List;
import java.util.HashMap; 
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;


public class DolarControlador {
    public static Route dolar = (var request, var response) -> {
        ApiDolarDAO apiDAO = new ApiDolarDAO();
        
        // Consultar la API
        // Supongo que la variable 'd' es el resultado de la consulta
        List<Dolar> d = apiDAO.consultar();
        
        // Mapear con Velocity
        HashMap<String, Object> dolares = new HashMap<>();
        dolares.put("dolar", d);
        dolares.put("template", "templates/dolar.vsl");
       
        // Renderizar en layout.vtl a partir de Velocity
        return new VelocityTemplateEngine().render(new ModelAndView(dolares, "templates/layout.vsl"));
    };
}
