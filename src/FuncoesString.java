public class FuncoesString {
    public static void main(String[] args) {
        String nome = "Douglas Alexandre    ";

        System.out.println(nome.toLowerCase());//Minúsculo
        System.out.println(nome.toUpperCase());//Maiúsculo
        System.out.println("-"+nome.trim()+ "-");//Remover espaços
        System.out.println(nome.substring(8));//Definir inicio para impressão
        System.out.println(nome.substring(8, 12));//Define inicio e fim da impressão
        System.out.println(nome.replace("A", "a"));//Substitui os caracteres encontrados
        System.out.println(nome.replace("Alexandre", "Moura"));//Substitui a subString
        int i = nome.indexOf("a");//mostra a posição em aparece primeiro da esqueda pra direita
        int j = nome.lastIndexOf("a");//mostra a posição em aparece primeiro da direita pra esquerda
        System.out.println(i);
        System.out.println(j);
        String[] vetor = nome.split(" ");
        System.out.println(vetor[0]);
        System.out.println(vetor[1]); 

    }
}
