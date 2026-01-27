import java.util.Scanner;

void main(){
    
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    
    String x = sc.next();
    System.out.println("Você digitou: "+x);
    
    int y = sc.nextInt();
    System.out.println("Número digitado: "+ y);
    
    double z = sc.nextDouble();
    System.out.println("Número Decimal: "+ z);
    
    char letra = sc.next().charAt(0);
    System.out.println("Primeira letra da palavra escrita: "+letra);
    
    String a,b,c;
    int number;

    number = sc.nextInt();
    //Consome a quebra de linha do nextInt() acima. (Enter)
    sc.nextLine();
    a = sc.nextLine();
    b = sc.nextLine();
    c = sc.nextLine();
    
    System.out.println(number);
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);

    sc.close();
}
