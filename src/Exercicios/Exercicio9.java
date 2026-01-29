package Exercicios;

import java.util.Scanner;

/*Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
ordem crescente ou decrescente. */

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número A: ");
        int numeroA = sc.nextInt();
        System.out.print("Digite o número B: ");
        int numeroB = sc.nextInt();

        if (numeroA % numeroB == 0 || numeroB % numeroA == 0) {
            System.out.println("São multiplos");
        }else{
            System.out.println("Não são multiplos");
        }

        sc.close();
    }
}
