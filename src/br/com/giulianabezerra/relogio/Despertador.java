package br.com.giulianabezerra.relogio;

public class Despertador {
    int horas;
    int minutos;
    int soneca;

    void ativarSoneca() {
        System.out.println("Só mais " + soneca + " minutinhos :P");
    }
    
    String agendarAlarme(){ //Parâmetros
        // Seu alarme foi configuardo às 12:30 (exemplo)
        return "Seu alarme foi configurado às " + horas + ":" + minutos;
    }
}
