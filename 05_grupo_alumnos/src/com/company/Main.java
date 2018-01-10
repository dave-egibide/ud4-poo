package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Escriba el código del grupo: ");
        Grupo g = new Grupo(br.readLine());

        for (int i = 0; i < g.alumno.length; i++) {
            g.alumno[i] = new Alumno();

            System.out.printf("Introduzca el nombre del alumno #%02d: ", i+1);
            g.alumno[i].setNombre(br.readLine());

            System.out.printf("Introduzca los apellidos del alumno #%02d: ", i+1);
            g.alumno[i].setApellido(br.readLine());

            System.out.printf("Introduzca el DNI del alumno #%02d: ", i+1);
            g.alumno[i].setDni(br.readLine());

            System.out.printf("Introduzca el teléfono del alumno #%02d: ", i+1);
            g.alumno[i].setTelefono(br.readLine());
        }

        System.out.println("\nLos alumnos del Grupo " + g.getCodigo() + " son:");
        for (int i = 0; i < g.alumno.length; i++) {
            System.out.printf("\nAlumno #%02d:\n", i+1);
            System.out.println("Nombre: " + g.alumno[i].getNombre());
            System.out.println("Apellidos: " + g.alumno[i].getApellido());
            System.out.println("DNI: " + g.alumno[i].getDni());
            System.out.println("Teléfono: " + g.alumno[i].getTelefono());
        }
    }
}
