package Exercicios;

import java.util.Scanner;

/*Fazer um programa para ler um número inteiro, 
e depois dizer se este número é negativo ou positivo. */
public class Exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();

        if (numero<0) {
            System.out.println("Negativo!");
        }else{
            System.out.println("Positivo!");
        }

        sc.close();
    }
}
