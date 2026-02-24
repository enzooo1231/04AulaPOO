package Exercicio1;

public class Conta {
    String correntista;
    int numeroConta;
    double saldo;

    double depositar(double valor){

        saldo += valor;

        return saldo ;
    }

    double saque(double valor){

        saldo -= valor;

        return saldo;
    }


}
