package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompraTest {
    @Test
    void deveRealizarPagamentoComCartaoCredito() {
        Compra compra = new Compra(150.0f);
        PagamentoCartaoCredito pagamentoCartaoCredito = new PagamentoCartaoCredito();

        compra.processarPagamento(pagamentoCartaoCredito);

    }

    @Test
    void deveRealizarPagamentoComPayPal() {
        Compra compra = new Compra(200.0f);
        PagamentoPayPal pagamentoPayPal = new PagamentoPayPal();

        compra.processarPagamento(pagamentoPayPal);

    }

    @Test
    void deveRealizarPagamentoComBoleto() {
        Compra compra = new Compra(100.0f);
        PagamentoBoleto pagamentoBoleto = new PagamentoBoleto();

        compra.processarPagamento(pagamentoBoleto);
    }

    @Test
    void deveLancarErroParaValorInvalido() {
        try {
            Compra compra = new Compra(-100.0f);
            PagamentoCartaoCredito pagamentoCartaoCredito = new PagamentoCartaoCredito();
            compra.processarPagamento(pagamentoCartaoCredito);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Valor de compra inválido", e.getMessage());
        }
    }
}