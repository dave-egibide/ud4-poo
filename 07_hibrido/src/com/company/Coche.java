package com.company;

import java.util.ArrayList;
import java.util.List;

public class Coche {
    private String marca, modelo;
    private int color;

    List<Motor> motors = new ArrayList<>();
    Rueda[] rueda = new Rueda[4];
    Puerta[] puerta;



    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
}
