package com.company;

/**
 * Created by robert on 10/2/16.
 */
public class PokemonAgua extends Pokemon {

 public PokemonAgua(String nombre, int puntosCombate, String color, double peso, String genero, double altura, String habilidad){
     super(nombre,puntosCombate,color,peso,genero,altura,habilidad);
 }

 public void nadar(){
     System.out.println(getNombre() + " está nadando!");
 }

 public void chorroDeAgua(){
     System.out.println(getNombre() + " ataca con chorro de agua!");
 }

}
