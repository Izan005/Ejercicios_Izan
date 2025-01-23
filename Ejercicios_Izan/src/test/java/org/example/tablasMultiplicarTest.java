package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class tablasMultiplicarTest {

    @Test
    void validarTabla() {

    assertAll(
            () -> assertTrue(tablasMultiplicar.validarTabla(7)),
            () -> assertTrue(tablasMultiplicar.validarTabla(5)),
            () -> assertFalse(tablasMultiplicar.validarTabla(-4))

    );

    }

    @Test
    void calcularCuadrado() {

        assertAll(
                () -> assertEquals(64, tablasMultiplicar.calcularCuadrado(8)),
                () -> assertEquals(6, tablasMultiplicar.calcularCuadrado(3))

        );
    }

    @Test
    void calcularTabla() {
    }
}