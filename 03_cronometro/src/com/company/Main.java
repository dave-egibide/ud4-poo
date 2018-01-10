package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String input;
	Cronometro[] crono = new Cronometro[10];
	int totalCrono = 0;
	do {
        System.out.println("\n(N)uevo cronómetro");
        System.out.println("(C)onsultar cronómetro");
        System.out.println("(S)alir");
        System.out.print("Elija una opción: ");
        input = br.readLine();
        switch (input.toUpperCase()) {
            case "N":
                if (totalCrono < 10) {
                    crono[totalCrono++] = new Cronometro();
                } else System.out.println("Número máximo de crónometros inicializados.");
                break;
            case "C":
                System.out.println();
                for (int i = 0; i < totalCrono; i++) {
                    System.out.printf("Cronometro %d: %d\n",i+1, crono[i].tiempoTranscurrido());
                }
                break;
        }
    } while (!input.equalsIgnoreCase("S"));
    }
}
