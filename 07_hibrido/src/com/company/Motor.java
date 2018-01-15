package com.company;

public abstract class Motor
{
    protected int potencia;

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public void arrancar() {
        potencia = 100;
    }
    public void parar() {
        potencia = 0;
    }

}
