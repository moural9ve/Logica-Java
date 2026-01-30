package Exercicios;

import java.util.Scanner;

/*Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel". */
public class Exercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de N: ");
        int numeroN = sc.nextInt();
        for (int i = 0; i < numeroN; i++) {
            System.out.print("Digite o divisor: ");
            double divisor = sc.nextDouble();
            System.out.print("Digite o denominador: ");
            double denominador = sc.nextDouble();

            if(denominador!=0){
                System.out.println("Divisão: "+ (divisor/denominador));
            }else{
                System.out.println("Divisão impossível");
            }
        }
        sc.close();

    }
}
