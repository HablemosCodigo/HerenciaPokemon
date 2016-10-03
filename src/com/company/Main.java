package com.company;

public class Main {

    //nombre, puntosCombate, color,peso,genero,altura,habilidad;

    public static void main(String[] args) {
        PokemonAgua Squirtle = new PokemonAgua("Squirtle", 250, "Azul" , 50, "Macho",2.90,"Caparazón Fuerte");
        Squirtle.chorroDeAgua();
        Squirtle.correr();

        PokemonTierra Sandrew = new PokemonTierra("Sandrew", 320, "Café", 35, "Hembra", 3.00, "Garras Filosas");
        Sandrew.terremoto();
        Sandrew.correr();
    }
}
