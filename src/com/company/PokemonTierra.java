package com.company;

/**
 * Created by robert on 10/2/16.
 */
public class PokemonTierra extends Pokemon{


    public PokemonTierra(String nombre, int puntosCombate, String color, double peso, String genero, double altura, String habilidad) {
        super(nombre, puntosCombate, color, peso, genero, altura, habilidad);
    }

    public void escarbar(){
        System.out.println(getNombre() + " está escarbando!");
    }

    public void terremoto (){
        System.out.print(getNombre() + " usó terremoto!");
    }
}
