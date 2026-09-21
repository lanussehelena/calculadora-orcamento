package br.com.lanusse.calculadora_orc;

import org.springframework.stereotype.Service;

@Service
public class CalculadoraOrcamento {
    public double calcularValorFinal(double valorProjeto) {
        if (valorProjeto < 0) {
            throw new IllegalArgumentException("O valor do projeto não pode ser negativo.");
        }

        if (valorProjeto >= 5000.0) {
            return valorProjeto * 0.90;
        }

        return valorProjeto;
    }
}
