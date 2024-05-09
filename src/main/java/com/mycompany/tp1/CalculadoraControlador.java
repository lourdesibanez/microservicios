/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp1;

import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import spark.Route;
import spark.Response;
import spark.Request;

/**
 *
 * @author Luly
 */
public class CalculadoraControlador {
    public static Route calculadora = (Request request, Response response) -> {
        HashMap model = new HashMap();

        return new VelocityTemplateEngine().render(new ModelAndView(model, "templates/calculadora.vsl"));
    };
}
