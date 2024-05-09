/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp1;

/**
 *
 * @author Luly
 */
import java.util.ArrayList;
import java.util.List;

public class PartidoDAO {
    private List<Partido> partidos;
    
    public void init(){
        partidos = new ArrayList<Partido>();
        Partido p1, p2, p3, p4, p5, p6, p7, p8;
        
        p1 = new Partido("Boca","Racing","Empate 1-1","Liga Fecha 3",true);
        partidos.add(p1);
        p2 = new Partido("River","Independiente","Ganó River 2-0","Liga Fecha 4",true);
        partidos.add(p2);
        p3 = new Partido("San Lorenzo","Boca","Por jugarse","Copa Argentina Cuartos de final",false);
        partidos.add(p3);
        p4 = new Partido("Racing","Independiente","Ganó Racing 3-2","Libertadores Octavos de final ida",true);
        partidos.add(p4);
        p5 = new Partido("River","Boca","Ganó River 3-1","Libertadores Final",true);
        partidos.add(p5);
        p6 = new Partido("Independiente","San Lorenzo","Empate 0-0","Liga Fecha 5",true);
        partidos.add(p6);
        p7 = new Partido("Boca","Independiente","Por jugarse","Liga Fecha 5",false);
        partidos.add(p7);
        p8 = new Partido("Independiente","Racing","Por jugarse","Libertadores Octavos de final vuelta",false);
        partidos.add(p8);
    }
    
    public List<Partido> getPartidosEquipo(String equipo){
        init();
        
        List<Partido> partidosEquipo = new ArrayList<>();
       
        partidos.forEach(partido ->{
            if(equipo.equals(partido.getEquipo1())||equipo.equals(partido.getEquipo2())){
                partidosEquipo.add(partido);
            }
        });        
        return partidosEquipo;
    }
}
