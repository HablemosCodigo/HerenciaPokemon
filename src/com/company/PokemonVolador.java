package com.company;

/**
 * Created by robert on 10/2/16.
 */
public class PokemonVolador extends Pokemon {

    public PokemonVolador(String nombre, int puntosCombate, String color, double peso, String genero, double altura, String habilidad) {
        super(nombre, puntosCombate, color, peso, genero, altura, habilidad);
    }

    public void volar(){
        System.out.println(getNombre() + " esta volando!");
    }

    public void tornado(){
        System.out.println(getNombre() + " usó tornado!");
    }
}
