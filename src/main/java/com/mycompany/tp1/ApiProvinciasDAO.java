/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 *
 * @author Martin
 */
public class ApiProvinciasDAO {
    public String consultar(){
         String apiUrl =  "https://apis.datos.gob.ar/georef/api/provincias";
        String output;
        
        try{
            URL url = new URL(apiUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Accept", "ej10/json");
            
            if(connection.getResponseCode() == 200){
                BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                
                output = br.readLine();
                connection.disconnect();
            }
            else{
                output = "Error al consultar la API: " + connection.getResponseCode();
            }
        } catch (IOException e) {
            output = "Error al consultar la API";
        }
        
        return output;
    }
}
