/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp1;

/**
 *
 * @author Luly
 */

import java.util.List;
import spark.Request;
import spark.Response;
import spark.Route;

import java.util.HashMap; 
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;



public class PartidoControlador {
    public static Route partidos = (Request request, Response response) ->{
       PartidoDAO pDAO = new PartidoDAO();
       List<Partido> p = pDAO.getPartidosEquipo(request.queryParams("equipo"));
       
       //mapeamos con velocity
       HashMap model = new HashMap();
       model.put("partidos", p);
       model.put("template", "templates/partidos.vsl");
       
       //renderizar en layout.vtl a partir de velocity
       return new VelocityTemplateEngine().render(new ModelAndView(model, "templates/layout.vsl"));
       
       
       /*ObjectMapper objMapper = new ObjectMapper();
       String jsonStr = objMapper.writeValueAsString(p);
       return jsonStr;
       */
    };
}
