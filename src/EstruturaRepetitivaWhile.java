import java.util.Scanner;

public class EstruturaRepetitivaWhile {

    /*
     * É uma estrutura de controle que
     * repete um bloco de comandos
     * enquanto uma condição for
     * verdadeira.
     */

    /*
     * Fazer um programa que lê números
     * inteiros até que um zero seja lido. Ao
     * final mostra a soma dos números lidos.
     */
    public static void main(String[] args) {

        int numero;
        int total=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número(Digite \"0\" para parar): ");
        numero = sc.nextInt();

        while (numero != 0) {
            total += numero;
            System.out.print("Digite um número(Digite \"0\" para parar): ");
            numero = sc.nextInt();
        }
        System.out.println("Valor total: "+total);
        sc.close();
    }
}
