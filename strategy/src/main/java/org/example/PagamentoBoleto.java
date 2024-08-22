package org.example;

public class PagamentoBoleto implements FormaDePagamento {
    public void pagar(float valor) {
        System.out.println("Pagamento de " + valor + " realizado com boleto bancário.");
    }
}