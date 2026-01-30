package Exercicios;

import java.util.Scanner;

/*Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
Lembrando que, por definição, fatorial de 0 é 1. */
public class Exercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numeroN = sc.nextInt();
        int fatorialDeN = 1;
        if (numeroN == 0) {
            fatorialDeN = 1;
        } else {
            for (int i = 1; i <= numeroN; i++) {
                fatorialDeN *= i;
            }
        }
        System.out.println("Fatorial de N: " + fatorialDeN);

        sc.close();
    }
}
