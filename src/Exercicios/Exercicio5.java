package Exercicios;

import java.util.Scanner;

/* 
Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o 
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago. */
public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int codigo1, codigo2;
        
        System.out.println("Digite o código da peça 1 | Número de peças 1 | Valor unitário de cada peça 1: ");
        codigo1 = sc.nextInt();
        int qtd1 = sc.nextInt();
        double preco1 = sc.nextDouble();
        
        System.out.println("Digite o código da peça 2 | Número de peças 2 | Valor unitário de cada peça 2: ");
        codigo2 = sc.nextInt();
        int qtd2 = sc.nextInt();
        double preco2 = sc.nextDouble();

        double totalCompra = preco1 * qtd1 + preco2 * qtd2; 

        System.out.printf("Valor a Pagar: R$ %.2f", totalCompra);
        sc.close();
    }
}
