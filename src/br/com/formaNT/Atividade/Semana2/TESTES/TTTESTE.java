package br.com.formaNT.Atividade.Semana2.TESTES;

import java.util.Scanner;

public class TTTESTE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o texto: ");
        String texto = scanner.nextLine();

        System.out.print("Digite o número de deslocamento: ");
        int deslocamento = scanner.nextInt();

        scanner.nextLine(); // Consumir o caractere de quebra de linha

        System.out.print("Escolha a opção (1 - Criptografar, 2 - Descriptografar): ");
        int opcao = scanner.nextInt();

        String resultado = "";

        if (opcao == 1) {
            resultado = criptografar(texto, deslocamento);
        } else if (opcao == 2) {
            resultado = descriptografar(texto, deslocamento);
        } else {
            System.out.println("Opção inválida!");
            System.exit(0);
        }

        System.out.println("Resultado: " + resultado);

        scanner.close();
    }

    public static String criptografar(String texto, int deslocamento) {
        StringBuilder textoCriptografado = new StringBuilder();

        for (int i = 0; i < texto.length(); i++) {
            char caractere = texto.charAt(i);

            if (Character.isLetter(caractere)) {
                char novoCaractere = (char) ((caractere - 'a' + deslocamento) % 26 + 'a');
                textoCriptografado.append(novoCaractere);
            } else {
                textoCriptografado.append(caractere);
            }
        }

        return textoCriptografado.toString();
    }

    public static String descriptografar(String texto, int deslocamento) {
        StringBuilder textoDescriptografado = new StringBuilder();

        for (int i = 0; i < texto.length(); i++) {
            char caractere = texto.charAt(i);

            if (Character.isLetter(caractere)) {
                char novoCaractere = (char) ((caractere - 'a' - deslocamento + 26) % 26 + 'a');
                textoDescriptografado.append(novoCaractere);
            } else {
                textoDescriptografado.append(caractere);
            }
        }

        return textoDescriptografado.toString();
    }
}
