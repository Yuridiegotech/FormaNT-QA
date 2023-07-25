    package br.com.formaNT.Atividade.Semana2;

    import java.util.Scanner;

    public class Atividade2V1 {
        public static void main(String[] args) {
            try {
                Scanner entrada = new Scanner(System.in);

                System.out.print("Informe o texto : ");
                String texto = entrada.nextLine();
                System.out.print("Informe a chave de deslocamento(1-26): ");
                int chave = entrada.nextInt();

                System.out.print("Escolha a opção (1 - Criptografar, 2 - Descriptografar): ");

                int opcao = entrada.nextInt();

                String resultado = "";

                if (opcao == 1) {
                    resultado = encriptar(chave, texto);
                } else if (opcao == 2) {
                    resultado = decriptar(chave, texto);
                } else {
                    System.out.println("Opção inválida!");
                    System.exit(0);
                }

                System.out.println("Resultado: " + resultado);


                entrada.close();

            } catch (RuntimeException e) {
                System.out.println("A chave de deslocamento foi informada incorretamente.");
                System.out.println("Execute o programa novamente e entre com uma chave válida.");
            }
        }

            public static String encriptar(int chave, String texto) {
                StringBuilder textoCifrado = new StringBuilder();
                int tamanhoTexto = texto.length();

                for (int i = 0; i < tamanhoTexto; i++) {
                    int letraCifrada = ((int) texto.charAt(i)) + (chave - 1);

                    while (letraCifrada < 32 ) {
                        letraCifrada += 94;}

                    textoCifrado.append((char) letraCifrada);

                }

                return textoCifrado.toString();
            }

            public static String decriptar(int chave, String textoCifrado) {
                StringBuilder texto = new StringBuilder();
                int tamanhoTexto = textoCifrado.length();

                for (int i = 0; i < tamanhoTexto; i++) {
                    int letraDecifrada = ((int) textoCifrado.charAt(i)) - (chave - 1);

                    while (letraDecifrada < 32) {
                        letraDecifrada += 94;}


                    texto.append((char) letraDecifrada);
                }

                return texto.toString();
            }
    }