/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.endgame;

/**
 *
 * @author josej
 */
public class Thanos extends VIllano {
    protected String guantelete;
    
    public Thanos (String nombre,String poder,String ejercito, String guantelete){
    super (nombre,poder,ejercito);
    this.guantelete=guantelete;
    }
    public void chasqueardedos(){
    System.out.println(nombre+"utiliza el guantelete del infinito"+guantelete);
    }
}
