package org.example;

public class PagamentoCartaoCredito implements FormaDePagamento {
    public void pagar(float valor) {
        System.out.println("Pagamento de " + valor + " realizado com cartão de crédito.");
    }
}
