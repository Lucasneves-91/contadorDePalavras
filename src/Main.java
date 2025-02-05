import java.util.Scanner;

/** Objetivo - Criar um projeto que conta as palavras de uma frase
 1 - Obter uma frase do usuario
 2 - Contar as palavras da frase e exibir o resultado
 3 - Solicitar se o usuario quer digitar outra frase
 4 - Se sim, repetir a lógica 1 e 2
 5 - Se não, encerrar o programa
 */


public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a frase que você quer contar as palavras: ");
        String frase = leitor.nextLine();

    }
}