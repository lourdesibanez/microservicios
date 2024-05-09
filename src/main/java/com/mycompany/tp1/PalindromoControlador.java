package com.mycompany.tp1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Luly
 */

import spark.Request;
import spark.Response;
import spark.Route;
import java.util.HashMap;
import spark.template.velocity.VelocityTemplateEngine;
import spark.ModelAndView;

//esta clase deberia llamarse PalindromoControlador
public class PalindromoControlador {
   public static Route palindromo = (Request request, Response response) -> {
        
        String s = request.queryParams("string");
        
        PalindromoDAO pDAO = new PalindromoDAO();
        if(pDAO.isPalindromo(s)){
            s += " es palíndromo";
        }
        else{
            s += " no es palíndromo";
        }
        HashMap model = new HashMap();
        model.put("respuesta",s);
       
        model.put("template","templates/ej1-5.vsl");
        
        return new VelocityTemplateEngine().render(new ModelAndView(model,"templates/layout.vsl"));
    };
}
