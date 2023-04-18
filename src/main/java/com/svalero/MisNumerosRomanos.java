package com.svalero;


import java.util.ArrayList;

public class MisNumerosRomanos {
    public static String convertirNumeroRomano(int numeroDecimal) {

        ArrayList<String> numerosRomanos = new ArrayList<String>();
        String[] simbolosRomanos = {"L", "XL", "X", "IX", "V", "IV", "I"};

        // valores decimales correspondientes a cada símbolo romano
        int[] valoresDecimales = {50, 40, 10, 9, 5, 4, 1};

        // iterar por cada símbolo romano
        for (int i = 0; i < simbolosRomanos.length; i++) {
            // mientras el número decimal sea mayor o igual al valor decimal del símbolo romano actual
            while (numeroDecimal >= valoresDecimales[i]) {
                numerosRomanos.add(simbolosRomanos[i]); // añadir el símbolo romano a la lista
                numeroDecimal -= valoresDecimales[i]; // restar el valor decimal del símbolo romano al número decimal
            }
        }

        // unir los símbolos romanos en un string y mostrar el resultado
        String numeroRomano = String.join("", numerosRomanos);
        return numeroRomano;
    }
}
