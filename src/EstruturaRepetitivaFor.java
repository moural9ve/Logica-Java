import java.util.Scanner;

public class EstruturaRepetitivaFor {
    /*
     * É uma estrutura de controle que
     * repete um bloco de comandos
     * para um certo intervalo de
     * valores.
     * 
     * Quando usar: quando se sabe
     * previamente a quantidade de
     * repetições, ou o intervalo de
     * valores.
     */

    /*
     * Fazer um programa que lê um valor
     * inteiro N e depois N números inteiros.
     * Ao final, mostra a soma dos N números
     * lidos
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite quantas vezes o loop vai rodar: ");
        int numeroN = sc.nextInt();
        int soma =0;
        for(int i=0;i<numeroN;i++){
            System.out.print("Digite um número: ");
            int numeroX = sc.nextInt();
            soma+=numeroX;
        }
        System.out.println("Soma dos números inteiros: "+soma);

        //Contagem
        System.out.println("Contagem: \n");
        for(int i=0;i<5;i++){
            System.out.println("Valor de i: "+ i);
        }

        //Contagem Regressiva
        System.out.println("\nContagem regressiva: ");
        for(int i=5;i>=0;i--){
            System.out.println("Valor de i: "+ i);
        }
        sc.close();
    }
}
