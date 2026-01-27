package Exercicios;

import java.util.Scanner;

/*Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma 
mensagem explicativa, conforme exemplos.  */
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nDigite o primeiro número: ");
        int numberOne = sc.nextInt();
        System.out.println("Digite o Segundo Número: ");
        int numberTwo = sc.nextInt();
        
        int soma = numberOne + numberTwo;

        System.out.println("\nSoma: "+ soma);

        sc.close();
    }
}
