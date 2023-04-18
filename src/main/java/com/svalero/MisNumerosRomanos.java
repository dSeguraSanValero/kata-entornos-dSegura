package com.svalero;


public class MisNumerosRomanos {
    public static String convertirNumeroRomano(int numeroDecimal) {
        String numeroRomano = null;
        
        if (numeroDecimal == 1) {
            numeroRomano = "I";

        } else if (numeroDecimal == 2) {
            numeroRomano = "II";

        } else if (numeroDecimal == 3) {
            numeroRomano = "III";

        } else if (numeroDecimal == 4) {
            numeroRomano = "IV";

        } else if (numeroDecimal == 5) {
            numeroRomano = "V";

        } else if (numeroDecimal == 6) {
            numeroRomano = "VI";

        } else if (numeroDecimal == 7) {
            numeroRomano = "VII";

        }
        return numeroRomano;
    }
}
