package com.svalero;

import org.junit.Test;

import static org.junit.Assert.*;

public class MisNumerosRomanosTest {

    @Test
    public void testConversion1() {
        assertEquals("I", MisNumerosRomanos.convertirNumeroRomano(1));
    }
}