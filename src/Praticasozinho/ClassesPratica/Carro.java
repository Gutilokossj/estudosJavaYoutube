package Praticasozinho.ClassesPratica;

/*
 * Desafio 2: Classe Carro
Atributos:

String modelo

int ano

boolean ligado

Métodos:

void ligar() — seta ligado como true e imprime "Carro ligado"

void desligar() — seta ligado como false e imprime "Carro desligado"

String info() — retorna uma string com o modelo e ano, ex: "Carro modelo: Fiat, ano: 2020"

Dicas para você:

Use os tipos corretos (int, boolean, String, etc).

Lembre-se de criar métodos que modificam e retornam dados da classe (como nos exemplos).

Teste suas classes criando um método main para instanciar objetos e chamar os métodos.
 */
public class Carro {
    String modelo = "UNO";
    int ano = 2012;
    boolean ligado = false;

    void ligar(){
        ligado = true;
        System.out.println("Carro ligado");
    }

    void desligar(){
        ligado = false;
        System.out.println("Carro desligado");
    }

    String info(){
        return "Carro modelo: " + modelo + ", ano: " + ano;
    }

    String estado(){
    return ligado ? "Carro está ligado" : "Carro está desligado";
}


    public static void main(String[] args) {
        Carro carroDoGus = new Carro();
        carroDoGus.ligar();
        String modeloCarro = carroDoGus.info();  //pode ser assim também -         System.out.println(carroDoGus.info());
        System.out.println(modeloCarro);
        carroDoGus.desligar();
        System.out.println(carroDoGus.estado()); //Exemplo de como puxar a informação STRING
    }
    
}
