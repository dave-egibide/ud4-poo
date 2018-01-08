package com.company;

public class Main {

    public static void main(String[] args) {
        BoardingPass prueba = new BoardingPass("Whitney Horito", "Sydney Australia",
                "Sleepy Ridge", "Oceanic Airlines", "42B", "23May",
                815, 1, "300521654977470", 4, 23, 700, 'C');

        System.out.println("El billete de id " + prueba.getPassNum() + " contiene los siguientes datos:");
        System.out.println("Nombre: " + prueba.getPassName());
        System.out.println("Vuelo: " + prueba.getFlightNum());
        System.out.println("Origen: " + prueba.getOrigin());
        System.out.println("Destino: " + prueba.getDestination());
        System.out.println("Compañía: " + prueba.getCompany());
        System.out.printf("Asiento: " + prueba.getSeat() + " Zona %d\n", prueba.getSeatZone());
        System.out.println("Fecha: " + prueba.getDate());
        System.out.printf("Hora: %04d\n", prueba.getHour());
        System.out.println("Clase: " + prueba.getSeatClass());
        System.out.printf("Puerta de embarque: %02d\n", prueba.getDepartureGate());
        System.out.printf("Bolsas: %02d\n", prueba.getBags());
    }
}
