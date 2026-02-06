import java.util.Scanner;

public class Constantes {
    /*
     * Declaração de uma constante//
     * Sempre com letras maiúsculas//
     * final - Não sera mudado em local nenhum do codigo//
     */
    public static final double PI = 3.14159;

    /*
     * Fazer um programa para ler um valor numérico qualquer, e daí mostrar
     * quanto seria o valor de uma circunferência e do volume de uma esfera
     * para um raio daquele valor. Informar também o valor de PI com duas
     * casas decimais.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do raio: ");
        double raio = sc.nextDouble();

        double circunferencia = Circunferencia(raio);
        double volume = Volume(raio);

        System.out.printf("\nCircunferência: %.2f", circunferencia);
        System.out.printf("\nVolume: %.2f", volume);
        System.out.printf("\nPI: %.2f", PI);

        sc.close();

    }

    public static double Circunferencia(double raio) {
        return 2.0 * PI * raio;
    }

    public static double Volume(double raio) {
        return 4.0 * PI * raio * raio * raio / 3.0;
    }
}
