package br.com.lanusse.calculadora_orc;

import org.springframework.stereotype.Service;

@Service
public class CalculadoraOrcamento {

    private static final double VALOR_POR_METRO_QUADRADO = 150.0;

    public double calcularValorFinal(double metrosQuadrados) {
        if (metrosQuadrados <= 0) {
            throw new IllegalArgumentException("A metragem do ambiente deve ser maior que zero.");
        }

        double valorBase = metrosQuadrados * VALOR_POR_METRO_QUADRADO;

        if (valorBase >= 5000.0) {
            return valorBase * 0.90;
        }

        return valorBase;
    }
}