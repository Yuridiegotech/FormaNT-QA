    package br.com.formaNT.Atividade.Semana2;

    import java.util.Scanner;

    public class Atividade2 {
        public static void main(String[] args) {
            try {
                Scanner entrada = new Scanner(System.in);

                System.out.print("Informe o texto : ");
                String texto = entrada.nextLine();
                System.out.print("Informe a chave de deslocamento(0-25): ");
                int chave = entrada.nextInt();

                if (chave < 0 || chave > 25){
                    throw new IllegalArgumentException("A chave de deslocamento deve estar entre 0 e 25.");
                }


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
                char caractere = texto.charAt(i);
                char novoCaractere = caractere;

                if (Character.isLetter(caractere)) {
                    if (Character.isUpperCase(caractere)) {
                        novoCaractere = (char) ('A' + ((caractere - 'A' + chave) % 26));
                    } else {
                        novoCaractere = (char) ('a' + ((caractere - 'a' + chave) % 26));
                    }
                }

                textoCifrado.append(novoCaractere);
            }

            return textoCifrado.toString();
        }

        public static String decriptar(int chave, String textoCifrado) {
            StringBuilder texto = new StringBuilder();
            int tamanhoTexto = textoCifrado.length();

            for (int i = 0; i < tamanhoTexto; i++) {
                char caractere = textoCifrado.charAt(i);
                char novoCaractere = caractere;

                if (Character.isLetter(caractere)) {
                    if (Character.isUpperCase(caractere)) {
                        novoCaractere = (char) ('A' + ((caractere - 'A' - chave + 26) % 26));
                    } else {
                        novoCaractere = (char) ('a' + ((caractere - 'a' - chave + 26) % 26));
                    }
                }

                texto.append(novoCaractere);
            }

            return texto.toString();
        }

    }