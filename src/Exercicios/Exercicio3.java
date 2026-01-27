package Exercicios;

import java.util.Scanner;

/*Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto 
de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).  */
public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int A = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        int B = sc.nextInt();
        System.out.println("Digite o terceiro número: ");
        int C = sc.nextInt();
        System.out.println("Digite o quarto número: ");
        int D = sc.nextInt();

        double diferença = (A * B - C * D); 

        System.out.println("Diferença: "+ diferença);
        sc.close();
        
    }
}
