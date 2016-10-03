package com.company;

/**
 * Created by robert on 10/2/16.
 */
public class Pokemon {

    private String nombre;
    private int puntosCombate;
    private String color;
    private double peso;
    private String genero;
    private double altura;
    private String habilidad;

    public Pokemon(String nombre, int puntosCombate, String color, double peso, String genero, double altura, String habilidad) {
        this.nombre = nombre;
        this.puntosCombate = puntosCombate;
        this.color = color;
        this.peso = peso;
        this.genero = genero;
        this.altura = altura;
        this.habilidad = habilidad;
    }


    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getPuntosCombate(){
        return puntosCombate;
    }

    public void setPuntosCombate(int puntosCombate){
        this.puntosCombate = puntosCombate;
    }

    public String getColor(){

        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public double getPeso(){
        return peso;
    }

    public void setPeso(double peso){
        this.peso = peso;
    }

    public String getGenero(){
        return genero;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }

    public double getAltura(){
        return altura;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public String getHabilidad(){
        return habilidad;
    }

    public void setHabilidad(String habilidad){
        this.habilidad = habilidad;
    }
}
