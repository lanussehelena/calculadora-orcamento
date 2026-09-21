package br.com.lanusse.calculadora_orc;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
class CalculadoraOrcApplicationTests {

    @Autowired
    private CalculadoraOrcamento calculadora;

    @Test
    void deveAplicarDescontoParaProjetosAcimaDe5000() {
        assertEquals(4500.0, calculadora.calcularValorFinal(5000.0));
    }

    @Test
    void naoDeveAplicarDescontoParaProjetosAbaixoDe5000() {
        assertEquals(3000.0, calculadora.calcularValorFinal(3000.0));
    }

    @Test
    void deveLancarExcecaoParaValorNegativo() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculadora.calcularValorFinal(-1500.0);
        });
    }
}
