import java.util.Scanner;

public class Funcoes {
    /*
     * Fazer um programa para ler três números inteiros e mostrar na tela o maior
     * deles.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 3 números:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int maiorNumero = max(a,b,c);
        mostrarResultado(maiorNumero);
        sc.close();
    }
    public static int max(int x,int y,int z){
         int auxiliar;
         if(x>y && x>z){
            auxiliar = x;
         }else if(y>z){
            auxiliar = y;
         }else{
            auxiliar = z;
         }
         return auxiliar;
    }

    public static void mostrarResultado(int valor){
        System.out.println("Maior valor: "+valor);
    }
}
