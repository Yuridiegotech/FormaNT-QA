package br.com.formaNT.Atividade.Semana2;

public class Atividade3abv {
    private static final int TAMANHO_ALFABETO = 26;
    private static char tabela[][] = new char[TAMANHO_ALFABETO][TAMANHO_ALFABETO];

    static {
        inicializarTabela();
    }

    public static void main(String[] args) {
        String mensagem = "HELLO";
        String chave = "KEY";

        String mensagemCifrada = cifrar(mensagem, chave);
        System.out.println("Mensagem cifrada: " + mensagemCifrada);

        String mensagemDecifrada = decifrar(mensagemCifrada, chave);
        System.out.println("Mensagem decifrada: " + mensagemDecifrada);
    }

    private static void inicializarTabela() {
        for (int linha = 0; linha < TAMANHO_ALFABETO; linha++) {
            for (int coluna = 0; coluna < TAMANHO_ALFABETO; coluna++) {
                tabela[linha][coluna] = (char) ('A' + ((linha + coluna) % 26));
            }
        }
    }

    private static String cifrar(String mensagem, String chave) {
        StringBuilder mensagemCifrada = new StringBuilder();
        int chaveIndex = 0;

        for (int i = 0; i < mensagem.length(); i++) {
            char letra = mensagem.charAt(i);
            if (Character.isLetter(letra)) {
                int linha = letra - 'A';
                int coluna = chave.charAt(chaveIndex) - 'A';

                char letraCifrada = tabela[linha][coluna];
                mensagemCifrada.append(letraCifrada);

                chaveIndex = (chaveIndex + 1) % chave.length();
            } else {
                mensagemCifrada.append(letra);
            }
        }

        return mensagemCifrada.toString();
    }

    private static String decifrar(String mensagemCifrada, String chave) {
        StringBuilder mensagemDecifrada = new StringBuilder();
        int chaveIndex = 0;

        for (int i = 0; i < mensagemCifrada.length(); i++) {
            char letraCifrada = mensagemCifrada.charAt(i);
            if (Character.isLetter(letraCifrada)) {
                int coluna = chave.charAt(chaveIndex) - 'A';

                for (int linha = 0; linha < TAMANHO_ALFABETO; linha++) {
                    if (tabela[linha][coluna] == letraCifrada) {
                        char letraDecifrada = (char) ('A' + linha);
                        mensagemDecifrada.append(letraDecifrada);
                        break;
                    }
                }

                chaveIndex = (chaveIndex + 1) % chave.length();
            } else {
                mensagemDecifrada.append(letraCifrada);
            }
        }

        return mensagemDecifrada.toString();
    }
}
