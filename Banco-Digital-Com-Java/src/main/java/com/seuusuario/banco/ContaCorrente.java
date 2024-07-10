// ContaCorrente.java
package com.seuusuario.banco;

public class ContaCorrente extends Conta {
    private double limiteChequeEspecial;

    public ContaCorrente(int numeroConta, double saldoInicial, double limiteChequeEspecial) {
        super(numeroConta, saldoInicial);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public void saque(double valor) {
        if (saldo + limiteChequeEspecial >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }
}
