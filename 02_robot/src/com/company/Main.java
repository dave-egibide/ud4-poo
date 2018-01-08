package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	Robot robbie = new Robot();
	int[][] tablero = new int[21][21];
	visualizarTablero(tablero, robbie);
	String inputY, inputX;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	do {
        System.out.print("Escriba el movimiento para la coordenada Y o FIN para autodestruirlo: ");
        inputY = br.readLine();
        if (!inputY.equalsIgnoreCase("FIN")) {
            System.out.print("Escriba el movimiento para la coordenada X: ");
            inputX = br.readLine();
            if (robbie.movimientoPosible(Integer.parseInt(inputY),Integer.parseInt(inputX))) {
                robbie.mover(Integer.parseInt(inputY),Integer.parseInt(inputX));
                visualizarTablero(tablero,robbie);
            } else System.out.println("Movimiento inválido.");
        }
    } while (!inputY.equalsIgnoreCase("FIN"));
        visualizarTablero(tablero,robbie, 2);
    }

    private static void visualizarTablero(int[][] tablero, Robot robot) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(" ");
                if (robot.y +10 == i && robot.x +10 == j) System.out.printf("%c ", 129302);
                else System.out.print("· ");
            }
            System.out.println();
        }
    }

    //imprescindible
    private static void visualizarTablero(int[][] tablero, Robot robot, int radio) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(" ");
                if ((Math.abs(robot.y +10 - i) + Math.abs(robot.x +10 - j) <= radio*2)) System.out.printf("%c", 128293);
                else System.out.print("· ");
            }
            System.out.println();
        }
    }
}
