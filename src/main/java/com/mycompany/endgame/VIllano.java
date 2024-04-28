/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.endgame;

/**
 *
 * @author josej
 */
public class VIllano extends Personaje {
    protected String ejercito;
    
    public VIllano (String nombre,String poder,String ejercito){
        super(nombre,poder);
        this.ejercito=ejercito;
    }
        public void atacar(){
         System.out.println(nombre+"comanda su ejercito para atacar");
        }
        
    
}
