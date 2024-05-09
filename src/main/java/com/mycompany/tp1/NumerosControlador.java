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
import spark.ModelAndView;
import java.util.HashMap;
import spark.template.velocity.VelocityTemplateEngine;

public class NumerosControlador {
    public static Route numeros = (var request, var response) -> {
        HashMap model = new HashMap();
        model.put("template","templates/ordenarNumeros.vsl");
        
        // Renderizar en layout.vtl a partir de Velocity
        return new VelocityTemplateEngine().render(new ModelAndView(model, "templates/layout.vsl"));
    };
}
