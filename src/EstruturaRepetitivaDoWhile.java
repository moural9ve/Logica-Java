import java.util.Scanner;

public class EstruturaRepetitivaDoWhile {
    /*
     * do {
     * comando 1
     * comando 2
     * } while ( condição );
     */

    /*
     * Problema exemplo:
     * Fazer um programa para ler uma temperatura em Celsius e mostrar o equivalente
     * em Fahrenheit. Perguntar se o usuário deseja repetir (s/n). Caso o usuário
     * digite "s", repetir o programa.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char opcao;
        do{
            System.out.print("Digite a temperatura em Celsius: ");
            double temperaturaC = sc.nextDouble();
            double temperaturaF = ((temperaturaC*9)/5)+32;
            System.out.printf("Temperatura em Fahrenheit: %.1f", temperaturaF);
            System.out.print("Deseja repetir (s/n)? ");
            opcao = sc.next().charAt(0);

        }while(opcao!='n');
        sc.close();
    }
}
