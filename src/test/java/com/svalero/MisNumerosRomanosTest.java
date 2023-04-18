package com.svalero;

import org.junit.Test;

import static org.junit.Assert.*;

public class MisNumerosRomanosTest {

    @Test
    public void testConversion1() {
        assertEquals("I", MisNumerosRomanos.convertirNumeroRomano(1));
    }

    @Test
    public void testConversion7() {
        assertEquals("VII", MisNumerosRomanos.convertirNumeroRomano(7));
    }

    @Test
    public void testConversion10() {
        assertEquals("X", MisNumerosRomanos.convertirNumeroRomano(10));
    }

    @Test
    public void testConversion134() {
        assertEquals("CXXXIV", MisNumerosRomanos.convertirNumeroRomano(134));
    }

    @Test
    public void testConversion2541() {
        assertEquals("MMDXLI", MisNumerosRomanos.convertirNumeroRomano(2541));
    }
}