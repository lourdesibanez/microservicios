package com.mycompany.tp1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Luly
 */

 import static spark.Spark.get;
 
public class Tp1 {
    public static void main(String[] args) {
        get("/palindromo",PalindromoControlador.palindromo);
        get("/sumar", Calculadora.sumar );
        get("/restar", Calculadora.restar);
        get("/calculadora", CalculadoraControlador.calculadora);
        get("/partidos", PartidoControlador.partidos);
        get("/emergencia", EmergenciaControlador.emergencia);
        get("/dolar", DolarControlador.dolar);
        get("/provincias", ProvinciasControlador.provincias);
        get("/numeros", NumerosControlador.numeros);
    }
}
