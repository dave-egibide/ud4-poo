package com.company;

public class Grupo {
    String codigo;
    Alumno[] alumno = new Alumno[5];
    public Grupo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }
}
