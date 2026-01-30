package Exercicios;

import java.util.Scanner;

public class Exercicio16 {
    /*
     * Leia 1 valor inteiro N, que representa o número de casos de teste que vem a
     * seguir. Cada caso de teste consiste
     * de 3 valores reais, cada um deles com uma casa decimal. Apresente a média
     * ponderada para cada um destes
     * conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo
     * valor tem peso 3 e o terceiro valor tem
     * peso 5.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de casos de teste: ");
        int valorN = sc.nextInt();
        double valorUm, valorDois, valorTres;
        
        for(int i=0;i<valorN;i++){
            System.out.print("Digite o primeiro valor: ");
            valorUm = sc.nextDouble();
            System.out.print("Digite o segundo valor: ");
            valorDois = sc.nextDouble();
            System.out.print("Digite o terceiro valor: ");
            valorTres = sc.nextDouble();

            double mediaPonderada = ((valorUm*2.0)+(valorDois*3.0)+(valorTres*5.0))/10;

            System.out.printf("\nMédia ponderada %d: %.1f",(i+1), mediaPonderada);
        }


        sc.close();
    }
}
