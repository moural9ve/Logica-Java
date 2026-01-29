package Exercicios;

import java.util.Scanner;

/*Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
exemplo */

public class Exercicio13 {
    public static void main(String[] args) {
        int opcao = 0;
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
        Scanner sc = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println("\n===POSTO DE COMBUSTÍVEL===");
            System.out.println("1. Álcool\n2. Gasolina\n3. Diesel\n4. Fim");
            System.out.print("Selecione um combustível: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    alcool += 1;
                    break;
                case 2:
                    gasolina += 1;
                    break;
                case 3:
                    diesel += 1;
                    break;
                case 4:
                    System.out.println("\nMUITO OBRIGADO");
                    System.out.println("Álcool: " + alcool);
                    System.out.println("Gasolina: " + gasolina);
                    System.out.println("Diesel: " + diesel);
                    break;
                default:
                    System.out.println("Digite um código válido!");
                    break;
            }
        }

        sc.close();

    }
}
