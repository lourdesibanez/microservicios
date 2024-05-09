/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp1;

/**
 *
 * @author Luly
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

//import org.codehaus.jackson.map.TypeReference;

public class ApiDolarDAO {
    public List<Dolar> consultar(){
        String apiUrl =  "https://dolarapi.com/v1/dolares";
        List<Dolar> d;
        
        try{
            URL url = new URL(apiUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Accept", "application/json");
            
            if(connection.getResponseCode() == 200){
                //el br es el string con el json que lo obtuve buscando en la api
                BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                //Para obtener un objeto desde JSON
                Type listType = new TypeToken<List<Dolar>>(){}.getType();
                Gson g = new Gson();
                d = g.fromJson(br, listType);
                
                
                //output = br.readLine();
                connection.disconnect();
            }
            else{
                d = null;
            }
        } catch (IOException e) {
            d = null;
        }
        
        return d;
    }
}
