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
        Scanner scanner = new Scanner(System.in);
        String continuar = "s";

        while (continuar.equalsIgnoreCase("s")){

            contarPalavras();

            System.out.println("Você quer digitar outra frase? (s/n)");
            continuar = scanner.nextLine();
        }

        System.out.println("Sistema encerrado!");
        scanner.close();

        }
        public static void contarPalavras(){
            Scanner scanner = new Scanner(System.in);
            String frase;
            System.out.println("Digite a frase que você quer contar as palavras: ");
            frase = scanner.nextLine();

            String[] palavras = frase.split(" ");
            int numeroDePalavras = palavras.length;
            System.out.println("A frase possui " + numeroDePalavras + " palavras.");

        }

// System.out.println("Você quer digitar outra frase? (s/n)");
//        String resposta = leitor.nextLine();
//        switch (resposta){
//            case "s":
//                System.out.println("Digite a frase que você quer contar as palavras: ");
//                frase = leitor.nextLine();
//
//                palavras = frase.split(" ");
//                numeroDePalavras = palavras.length;
//
//                System.out.println("A frase possui " + numeroDePalavras + " palavras.");
//                break;
//            case "n":
//                System.out.println("Obrigado!");
//                break;
//            default:
//                System.out.println("Opção inválida!" +
//                        "Obrigado!");


    }
