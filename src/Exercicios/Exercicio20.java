package Exercicios;

import java.util.Scanner;

/*Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
exemplo. */

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de linhas: ");
        int numeroN = sc.nextInt();

        for(int i=1; i<=numeroN;i++){
            double quadrado = Math.pow(i, 2);
            double cubo = Math.pow(i,3);
            System.out.printf("\nLINHA %d | QUADRADO %.0f | CUBO %.0f", i,quadrado,cubo);
        }

        sc.close();
    }
}
