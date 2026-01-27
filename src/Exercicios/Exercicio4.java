package Exercicios;

import java.util.Scanner;

/* 
Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por 
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas 
decimais. */
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número do funcionário: ");
        int numeroFuncionario = sc.nextInt();
        
        System.out.printf("Digite o número de horas trabalhadas pelo funcionário %d: ", numeroFuncionario);
        double numeroDeHorasTrabalhadas = sc.nextDouble();

        System.out.println("Digite o valor que o funcionário ganha por hora: ");
        double ganhoPorHora = sc.nextDouble();
        
        double salarioTotal = numeroDeHorasTrabalhadas*ganhoPorHora;

        System.out.printf("Número do funcionário: %d\nSalário do Funcionário: R$ %.2f", numeroFuncionario,salarioTotal);



        sc.close();
    }
}
