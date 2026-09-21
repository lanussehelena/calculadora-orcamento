package br.com.lanusse.calculadora_orc;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CalculadoraOrcApplicationTests {

    @Autowired
    private CalculadoraOrcamento calculadora;

    @Test
    void deveAplicarDescontoParaProjetosGrandes() {
        assertEquals(5400.0, calculadora.calcularValorFinal(40.0));
    }

    @Test
    void naoDeveAplicarDescontoParaProjetosMenores() {
        assertEquals(3000.0, calculadora.calcularValorFinal(20.0));
    }

    @Test
    void deveLancarExcecaoParaMetragemInvalida() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculadora.calcularValorFinal(-5.0);
        });

        assertThrows(IllegalArgumentException.class, () -> {
            calculadora.calcularValorFinal(0.0);
        });
    }
}