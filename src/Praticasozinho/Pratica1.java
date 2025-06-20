package Praticasozinho;

public class Pratica1 {
    public static void main(String[] args) {
        mostrarBoasVindas("Guti");
        int resultado = somar(25, 27);
        System.out.println(resultado);
        boolean habilitado = podeDirigir(18, true);
        System.out.println(habilitado);
    }

        /* Exercício 1
         * // Requisitos:
            - Crie um método chamado `mostrarBoasVindas`
            - Ele deve receber um parâmetro `String nome`
            - Deve imprimir: "Bem-vindo(a), [nome]!"

            // Exemplo de uso:
            mostrarBoasVindas("Gustavo"); 
            // Saída esperada: Bem-vindo(a), Gustavo!
         */

    static void mostrarBoasVindas (String nome){
        System.out.println("Bem vindo(a), " + nome + " !");

    }

        /* Exercício 2
        * // Requisitos:
            - Crie um método chamado `somar`
            - Ele deve receber dois `int` como parâmetros
            - Ele deve retornar a soma desses dois números

            // Exemplo de uso:
            int resultado = somar(10, 5);
            // resultado deve ser 15
        */

    static int somar(int num1, int num2){
        return num1 + num2;
    }

        /* Exercício 3
        * // Requisitos:
                - Crie um método chamado `podeDirigir`
                - Ele deve receber a idade da pessoa como `int`
                - Deve retornar `true` se a idade for 18 ou mais, senão `false`

                // Exemplo de uso:
                boolean habilitado = podeDirigir(20);
                // habilitado deve ser true
        */

    static boolean podeDirigir(int idade, boolean temCarteira){
        return idade >= 18 && temCarteira;
    }        
}
