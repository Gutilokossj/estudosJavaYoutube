package Praticasozinho.ClassesPratica;

/*
 * Desafio 3: Classe ContaBancaria
Atributos:

String titular

double saldo

Métodos:

void depositar(double valor) — adiciona valor ao saldo e imprime "Depósito de X realizado"

boolean sacar(double valor) — se saldo >= valor, subtrai e retorna true; se não, retorna false e imprime "Saldo insuficiente"

double consultarSaldo() — retorna o saldo atual

Dicas para você:

Use os tipos corretos (int, boolean, String, etc).

Lembre-se de criar métodos que modificam e retornam dados da classe (como nos exemplos).

Teste suas classes criando um método main para instanciar objetos e chamar os métodos.
 */
public class ContaBancaria {
    String titular = "Gustavo Fernandes";
    double saldo = 4758;

    void depositar(double valor){
        saldo = saldo + valor;
        System.out.println("Depósito de " + valor + " realizado," + " Seu saldo atual: " + saldo);
    }

    boolean sacar(double valor){
        if (saldo >= valor) {
            saldo = saldo - valor;
            System.out.println("Saque efetuado com sucesso de " + valor + ", saldo restante: " + saldo);
            return true;
        } else {
            System.out.println("Saldo insuficiente");
            return false;
        }
    }

    double consultarSaldo(){
        return saldo;
    }

    public static void main(String[] args) {
        ContaBancaria contaDoGus = new ContaBancaria();
        contaDoGus.depositar(100);
        contaDoGus.sacar(2000);
        contaDoGus.consultarSaldo();
    }
}
