/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.endgame;

/**
 *
 * @author josej
 */
public class Endgame {

    public static void main(String[] args) {
        Heroe blackPanter=new Heroe("black panter grr","ser el rey de todo wakanda","garras de vibranium");
        VIllano galactus=new VIllano ("galactus","devorar mundos","usa de chalan a silver surfer");
        Avenger ironMan=new Avenger ("tony stark","genio,filantropo,multimillonario,playboy","mark 42","prime");
        Thanos thanos=new Thanos("Thanos","el titan loco","ejercito chitaury","gemas del infinito");
        
        
        Personaje[]personajes={blackPanter,galactus,ironMan,thanos};
        for(Personaje personaje:personajes){
        personaje.atacar();
        }
        ((Avenger)ironMan).reunirse();
        thanos. chasqueardedos();
    }
}
