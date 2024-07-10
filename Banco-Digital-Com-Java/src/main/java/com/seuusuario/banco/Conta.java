// Conta.java
package com.seuusuario.banco;

public abstract class Conta {
    private int numeroConta;
    protected double saldo;

    public Conta(int numeroConta, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposito(double valor) {
        saldo += valor;
    }

    public abstract void saque(double valor);

    public void transferencia(Conta destino, double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            destino.deposito(valor);
            System.out.println("Transferência de R$" + valor + " realizada com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para transferência.");
        }
    }
}
