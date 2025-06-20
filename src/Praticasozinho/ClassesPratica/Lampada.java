package Praticasozinho.ClassesPratica;

/*
 * Desafio 1: Classe Lampada
Atributos:

boolean ligada (se a lâmpada está ligada ou não)

String cor (cor da lâmpada, ex: "Branca", "Amarela")

Métodos:

void ligar() — seta ligada como true e imprime "Lâmpada ligada"

void desligar() — seta ligada como false e imprime "Lâmpada desligada"

String estado() — retorna "Lâmpada está ligada" ou "Lâmpada está desligada" dependendo do estado

Dicas para você:

Use os tipos corretos (int, boolean, String, etc).

Lembre-se de criar métodos que modificam e retornam dados da classe (como nos exemplos).

Teste suas classes criando um método main para instanciar objetos e chamar os métodos.
 */

public class Lampada {
    boolean ligada = false;
    String cor = "Branca";

    void ligar(){
        ligada = true;
        System.out.println("Lâmpada ligada");
    }



    void desligar(){
        ligada = false;
        System.out.println("Lâmpada desligada");
    }

    String estado(){
        if (ligada){
            return "Lâmpada ligada";
        } else {
            return "Lâmpada desligada";
        }
    }

    public static void main(String[] args) {
        Lampada lampada = new Lampada();
        lampada.ligar();
        lampada.desligar();
        System.out.println(lampada.estado());
    }
}