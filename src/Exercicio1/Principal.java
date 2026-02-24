package Exercicio1;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        DecimalFormat df = new DecimalFormat("#,##0.00");

        Conta c1 = new Conta();

        System.out.println("Digite o Nome do usuario da conta: ");
        c1.correntista = sc.next();


        c1.numeroConta = rd.nextInt(1000, 9999);

        System.out.println("Número do correntista: " +c1.numeroConta);
        System.out.println("Saldo: " + df.format(c1.saldo));

        c1.depositar(1000) ;

        System.out.println("Saldo: " + df.format(c1.saldo));

        c1.saque(500);

        System.out.println("Saldo: " + df.format(c1.saldo));


    }
}
