// Main.java
package com.seuusuario.banco;

public class Main {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(123, 1000.0, 500.0);
        ContaPoupanca cp = new ContaPoupanca(456, 500.0, 0.05);

        cc.deposito(200.0);
        cp.deposito(300.0);

        cc.transferencia(cp, 150.0);

        cc.saque(700.0);
        cp.saque(50.0);

        // Exemplo de aplicação de rendimento para a conta poupança
        cp.aplicaRendimento();

        System.out.println("Saldo Conta Corrente: R$" + cc.getSaldo());
        System.out.println("Saldo Conta Poupança: R$" + cp.getSaldo());
    }
}
