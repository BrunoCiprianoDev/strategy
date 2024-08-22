package org.example;

public class PagamentoPayPal implements FormaDePagamento {
    public void pagar(float valor) {
        System.out.println("Pagamento de " + valor + " realizado com PayPal.");
    }
}
