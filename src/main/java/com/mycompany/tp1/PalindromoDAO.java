/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp1;

/**
 *
 * @author Luly
 */
public class PalindromoDAO {
    public boolean isPalindromo(String s){
        s = s.toLowerCase();
        int largo = s.length()-1;
        
        for(int i=0; i<largo/2;i++){
            char a = s.charAt(i), b = s.charAt(largo-i);
            if(a!=b){
                return false;
            }
        }
        
        return true;
    }
}
