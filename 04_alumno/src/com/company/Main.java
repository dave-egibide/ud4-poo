package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Alumno[] alumnos = new Alumno[5];

        for (int i = 0; i < alumnos.length; i++) {
            alumnos[i] = new Alumno();

            System.out.printf("Introduzca el nombre del alumno #%02d: ", i+1);
            alumnos[i].setNombre(br.readLine());

            System.out.printf("Introduzca los apellidos del alumno #%02d: ", i+1);
            alumnos[i].setApellido(br.readLine());

            System.out.printf("Introduzca el DNI del alumno #%02d: ", i+1);
            alumnos[i].setDni(br.readLine());

            System.out.printf("Introduzca el teléfono del alumno #%02d: ", i+1);
            alumnos[i].setTelefono(br.readLine());
        }
        for (int i = 0; i < alumnos.length; i++) {
            System.out.printf("\nAlumno #%02d:\n", i+1);
            System.out.println("Nombre: " + alumnos[i].getNombre());
            System.out.println("Apellidos: " + alumnos[i].getApellido());
            System.out.println("DNI: " + alumnos[i].getDni());
            System.out.println("Teléfono: " + alumnos[i].getTelefono());
        }
    }
}
