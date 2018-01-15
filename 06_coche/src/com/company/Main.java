package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Coche coche = new Coche();
        String input;
        
        System.out.print("Introduzca la marca del coche: ");
        coche.setMarca(br.readLine());
        System.out.print("Introduzca el modelo del coche: ");
        coche.setModelo(br.readLine());
        System.out.print("Introduzca el número de color RGB del coche: ");
        coche.setColor(Integer.parseInt(br.readLine()));
        System.out.print("Introduzca el número de motores: ");
        coche.motor = new Motor[Integer.parseInt(br.readLine())];
        for (int i = 0; i < coche.motor.length; i++) {
            coche.motor[i] = new Motor();
            System.out.printf("Introduzca la cilindrada del motor #%d: ", i + 1);
            coche.motor[i].setCilindrada(Integer.parseInt(br.readLine()));
            System.out.printf("Introduzca el tipo de combustible del motor #%d: ", i + 1);
            coche.motor[i].setCombustible(br.readLine());
            System.out.printf("Introduzca la potencia en caballos del motor #%d: ", i + 1);
            coche.motor[i].setPotencia(Integer.parseInt(br.readLine()));
        }
        System.out.print("Introduzca el diámetro de las ruedas: ");
        coche.rueda[0] = new Rueda();
        coche.rueda[0].setDiametro(br.readLine());
        for (int i = 1; i < coche.rueda.length; i++) {
            coche.rueda[i] = new Rueda();
            coche.rueda[i].setDiametro(coche.rueda[0].getDiametro());
        }
        do {
            System.out.print("Introduzca el número de puertas del coche (de 2 a 5): ");
            input = br.readLine();
        } while (Integer.parseInt(input) < 2 || Integer.parseInt(input) > 5);
        coche.puerta = new Puerta[Integer.parseInt(input)];
        for (int i = 0; i < coche.puerta.length; i++) {
            coche.puerta[i] = new Puerta();
            System.out.printf("¿Tiene la puerta #%d elevalunas eléctrico (Si/No): ", i + 1);
            if (br.readLine().equalsIgnoreCase("si")) coche.puerta[i].setElevalunasElectrico(true);
        }

        System.out.println("\nEN RESUMEN" +
                "\nLa marca del coche es " + coche.getMarca() +
                ".\nEl modelo del coche es " + coche.getModelo() +
                ".\nEl color RGB es " + coche.getColor() + ".");
        for (int i = 0; i < coche.motor.length; i++) {
            System.out.printf("\nLa cilindrada del motor #%d es %d.", i + 1, coche.motor[i].getCilindrada());
            System.out.printf("\nEl tipo de combustible del motor #%d es %s.", i + 1, coche.motor[i].getCombustible());
            System.out.printf("\nLa potencia del motor #%d es %d caballos.", i + 1, coche.motor[i].getPotencia());
        }
        System.out.println("\nEl diámetro de las ruedas es " + coche.rueda[0].getDiametro() + ".");
        int lunas = 0;
        for (int i = 0; i < coche.puerta.length; i++) {
            if (coche.puerta[i].isElevalunasElectrico()) lunas++;
        }
        System.out.printf("Hay %d puertas, de las cuales %d tienen elevalunas eléctrico.", coche.puerta.length, lunas);
    }
}
