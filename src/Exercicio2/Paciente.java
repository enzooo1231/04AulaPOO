package Exercicio2;

import java.util.Arrays;
import java.util.Scanner;

public class Paciente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        AppCardiaco c1 = new AppCardiaco();

        System.out.println("Digite seu nome:");
        c1.nome = sc.nextLine();

        System.out.println("Digite sua idade, " +c1.nome+ ":");
        c1.idade = sc.nextInt();

        System.out.println("Paciente: " +c1.nome);

        System.out.println("Sua frequência cardiaca maxima ---> "+c1.frequenciaMax());

        System.out.println("Sua frequência cardiaca alvo ---> "+ Arrays.toString(c1.frequenciaAlvo()));

    }



}
