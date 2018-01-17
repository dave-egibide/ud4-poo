package com.company;

public class Grupo {
    private String codigo;
    Alumno[] alumno = new Alumno[5];

    public Grupo(String codigo) {
        this.codigo = codigo;
        for (int i = 0; i < 5; i++) {
            alumno[i] = new Alumno();
            alumno[i].setGrupo(this);
        }
    }

    public String getCodigo() {
        return codigo;
    }
}
