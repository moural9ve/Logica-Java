package Exercicios;

import java.util.Scanner;

/*Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma). */

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do eixo X: ");
        int eixoX = sc.nextInt();
        System.out.print("Digite o valor do eixo Y: ");
        int eixoY = sc.nextInt();
        String quadrante = "";

        while (eixoX != 0 && eixoY != 0) {
            if (eixoX > 0 || eixoY > 0) {
                System.out.println("Primeiro");
            } else if (eixoX < 0 || eixoY > 0) {
                System.out.println("Segundo");
            } else if (eixoX < 0 || eixoY < 0) {
                System.out.println("Terceiro");
            } else {
                System.out.println("Quarto");
            }
            System.out.print("Digite o valor do eixo X: ");
            eixoX = sc.nextInt();
            System.out.print("Digite o valor do eixo Y: ");
            eixoY = sc.nextInt();
        }

        sc.close();
    }
}
