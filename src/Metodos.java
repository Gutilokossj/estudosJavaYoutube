public class Metodos {
    public static void main(String[] args) {
         //ativarSoneca();
         String mensagemDoAlarme = agendarAlarme(12, 30);
         System.out.println(mensagemDoAlarme); //Argumentos
    }
    /* Sintaxe de declaração de métodos no Java:

     * <tipo do retorno do metodo> identificador(<tipo> parametros){
     *     <bloco de comandos>
     * }
     */
    static void ativarSoneca() {
        System.out.println("Só mais 5 minutinhos :P");
    }
    
    static String agendarAlarme(int hora, int minutos){ //Parâmetros
        // Seu alarme foi configuardo às 12:30 (exemplo)
        return "Seu alarme foi configurado às " + hora + ":" + minutos;
    }

    /*
     * Métodos statics só chama métodos statics, por isso
     * para chamar no método MAIN, eu precisei mudar o ativaSoneca pra
     * static também!
     */
}