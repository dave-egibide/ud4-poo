package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Coche coche = new Coche();
        String input;
        int motores, lunas = 0;

        System.out.print("Introduzca la marca del coche: ");
        coche.setMarca(br.readLine());
        System.out.print("Introduzca el modelo del coche: ");
        coche.setModelo(br.readLine());
        System.out.print("Introduzca el número de color RGB del coche: ");
        coche.setColor(Integer.parseInt(br.readLine()));

        do {
            System.out.print("Introduzca el número de motores: ");
            motores = Integer.parseInt(br.readLine());
        } while (motores < 1);

        for (int i = 0; i < motores; i++) {
            System.out.printf("¿Es el motor #%d eléctrico (Si/No)?: ", i + 1);
            if (br.readLine().equalsIgnoreCase("si")) {
                coche.motors.add(new MotorElectrico());
                System.out.printf("Introduzca el tipo de batería del motor: ");
                ((MotorElectrico) coche.motors.get(i)).setTipoBateria(br.readLine());
            } else {
                coche.motors.add(new MotorCombustionInterna());
                System.out.printf("Introduzca la cilindrada del motor: ");
                ((MotorCombustionInterna) coche.motors.get(i)).setCilindrada(Integer.parseInt(br.readLine()));
                System.out.printf("Introduzca el tipo de combustible del motor: ");
                ((MotorCombustionInterna) coche.motors.get(i)).setCombustible(br.readLine());
            }
            System.out.printf("Introduzca la potencia en caballos del motor: ");
            coche.motors.get(i).setPotencia(Integer.parseInt(br.readLine()));
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

        System.out.print("\n---EN RESUMEN---" +
                "\nLa marca del coche es " + coche.getMarca() +
                ".\nEl modelo es " + coche.getModelo() +
                ".\nEl color RGB es " + coche.getColor() + ".");

        for (int i = 0; i < motores; i++) {
            if (coche.motors.get(i) instanceof MotorElectrico) {
                System.out.printf("\nEl motor #%d es eléctrico. " +
                        "Su tipo es %s ", i + 1, ((MotorElectrico) coche.motors.get(i)).getTipoBateria());
            } else {
                System.out.printf("\nEl motor #%d es de combustión interna. " +
                                "Su cilindrada es %d. " + "Usa combustible de tipo %s ", i + 1,
                        ((MotorCombustionInterna) coche.motors.get(i)).getCilindrada(),
                        ((MotorCombustionInterna) coche.motors.get(i)).getCombustible());
            }
            System.out.printf("y su potencia es de %d caballos.", coche.motors.get(i).getPotencia());
        }

        System.out.println("\nEl diámetro de las ruedas es " + coche.rueda[0].getDiametro() + ".");

        for (int i = 0; i < coche.puerta.length; i++) if (coche.puerta[i].isElevalunasElectrico()) lunas++;
        System.out.printf("Tiene %d puertas, de las cuales %d tienen elevalunas eléctrico.", coche.puerta.length, lunas);
    }
}
