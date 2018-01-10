package com.company;

public class Cronometro {
    private long horaInicio;

    public Cronometro(){
        this.horaInicio = System.nanoTime();
    }

    public long tiempoTranscurrido() {
        return System.nanoTime() - horaInicio;
    }

}
