public class ExpressoesLogicas {
    public static void main(String[] args) {
        // && (E) - || (OU) - ! (Não)

        // && (E) - Necessário que todas as condições sejam verdadeiras.

        /*
         * Você pode obter uma habilitação de motorista se:
         * • For aprovado no exame psicotécnico,
         * E
         * • For aprovado no exame de legislação,
         * E
         * • For aprovado no exame de direção
         */

        boolean examePsicotecnico = true;
        boolean exameDeLegislacao = true;
        boolean exameDeDirecao = true;
        // boolean exameDeDirecao = true;

        if (examePsicotecnico == true && exameDeLegislacao == true && exameDeDirecao == true) {
            System.out.println("Você pode obter uma habilitação de motorista!");
        } else {
            System.out.println("Você não está apto, reprovou em um dos exames!");
        }

        // || (OU) - Necessário que apenas uma das condições sejam verdadeiras.

        /*
         * Você pode estacionar na vaga especial se:
         * • For idoso(a),
         * OU
         * • For uma pessoa com deficiência,
         * OU
         * • For uma gestante
         */
        // boolean idoso = false;
        boolean idoso = true;
        boolean pcd = false;
        boolean gestante = false;

        if (idoso == true || pcd == true || gestante == true) {
            System.out.println("Você tem uma das condições para usar a vaga!");
        } else {
            System.out.println("Você não as condições para usar esta vaga!");
        }
        // ! (Não) - Inverte a condição, caso a condição seja diferente da proposta o
        // resultado é verdadeiro.

        /*
         * Você tem direito a receber uma bolsa de estudos se você:
         * NÃO
         * • Possuir renda maior que $ 3000,00
         */

        double salario = 3000.00;
        /*salario > 5000 == true -- !(salario > 5000) == false (Inverte a condição!) */
        if (!(salario > 5000)) {
            System.out.println("Você pode receber a bolsa de estudos!");
        } else {
            System.out.println("Você não pode receber a bolsa de estudos!");
        }

    }
}
