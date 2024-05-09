/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp1;

/**
 *
 * @author Luly
 */
import static spark.Spark.get;
import spark.Request;
import spark.Response;
import spark.Route;

public class Calculadora {
    public static void main(String[] args) {
        /* Ruta , Controlador */ 
        get("/sumar", sumar );
        get("/restar", restar);
    }
    public int sumar (int a, int b) { 
        return a + b; 
    }
    public static Route sumar = (Request request, Response response) -> {
        Calculadora c = new Calculadora();
        int a = Integer.parseInt(request.queryParams("a"));
        int b = Integer.parseInt(request.queryParams("b"));
        int resSuma = c.sumar(a, b);
        return "Resultado " + resSuma;
    };
                
    public int restar (int a, int b) { 
        return a - b; 
    }
    public static Route restar = (Request request, Response response) -> {
        Calculadora c = new Calculadora();
        int a = Integer.parseInt(request.queryParams("a"));
        int b = Integer.parseInt(request.queryParams("b"));
        int resResta = c.restar(a, b);
        return "Resultado " + resResta;
    };

}
