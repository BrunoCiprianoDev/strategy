package org.example;

public class Pagamento {

    private float valor;

    public Pagamento(float valor) {
        this.valor = valor;
    }

    public void executarPagamento(FormaDePagamento formaDePagamento) {
        formaDePagamento.pagar(valor);
    }
}