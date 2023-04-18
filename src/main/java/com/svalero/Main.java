package com.svalero;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("¡Bienvenido! Introduce un número para convertirlo a número romano");
        Scanner teclado = new Scanner(System.in);

        int numeroDecimal = teclado.nextInt();

        String numeroRomano = MisNumerosRomanos.convertirNumeroRomano(numeroDecimal);
        System.out.println("El número romano correspondiente es: " + numeroRomano);
    }
}