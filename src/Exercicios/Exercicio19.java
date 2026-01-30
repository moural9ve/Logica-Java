package Exercicios;

import java.util.Scanner;

/*Ler um número inteiro N e calcular todos os seus divisores. */
public class Exercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int numeroN = sc.nextInt();

        for(int i=1;i<=numeroN;i++){
            if (numeroN %i==0) {
                System.out.printf("\nDivisor de %d: %d", numeroN,i);
            }
        }
        sc.close();
    }
}
