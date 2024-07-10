// ContaPoupanca.java
package com.seuusuario.banco;

public class ContaPoupanca extends Conta {
    private double taxaRendimento;

    public ContaPoupanca(int numeroConta, double saldoInicial, double taxaRendimento) {
        super(numeroConta, saldoInicial);
        this.taxaRendimento = taxaRendimento;
    }

    @Override
    public void saque(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    public void aplicaRendimento() {
        saldo *= (1 + taxaRendimento);
    }
}
