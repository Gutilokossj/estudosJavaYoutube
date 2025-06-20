package br.com.giulianabezerra.relogio;

import br.com.giulianabezerra.cronometro.Timer;

public class App {

    void metodo() {
        String saudacao = "Olá, Guti!";
        System.out.println(saudacao);

    } /**
     aqui quando fecho o bloco de comando
     a variável já deixou de existir e por isso
     pode ser usada novamente lá no outro bloco main */

    public static void main(String[] args) {
       /**
        * Sintaxe de declaração das variáveis no Java
        * <tipo> identificador;
        * <tipo> identificador = valor;
        *
        * Variáveis tem escopos: bloco de comandos no qual
        * a variável foi declarada.
        */
        String saudacao = "Olá, Guti!";
        System.out.println(saudacao);

        Despertador despertador; // não foi usado, só exemplos
        Timer timer; // não foi usado, só exemplos.
    }
}
