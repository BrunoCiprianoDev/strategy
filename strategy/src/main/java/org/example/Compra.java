package org.example;

public class Compra {

    private float valor;

    public Compra(float valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor de compra inválido");
        }
        this.valor = valor;
    }

    public float getValor() {
        return valor;
    }

    public void processarPagamento(FormaDePagamento formaDePagamento) {
        Pagamento pagamento = new Pagamento(valor);
        pagamento.executarPagamento(formaDePagamento);
    }
}