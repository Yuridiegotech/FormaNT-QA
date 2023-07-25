package br.com.formaNT.Atividade.Semana2;

public class Atividade3 {
    private static final int TAMANHO_ALFABETO = 26;
    private static char tabela[][] = new char[TAMANHO_ALFABETO][TAMANHO_ALFABETO];

    static {
        inicializarTabela();
    }

    public static void main(String[] args) {
        imprimirTabela();
        
    }

    private static void inicializarTabela() {
        for (int linha = 0; linha < TAMANHO_ALFABETO; linha++) {
            for (int coluna = 0; coluna < TAMANHO_ALFABETO; coluna++) {
                tabela[linha][coluna] = (char) ('A' + ((linha + coluna) % 26));
            }
        }
    }

    private static void imprimirTabela() {
        for (int linha = 0; linha < TAMANHO_ALFABETO; linha++) {
            for (int coluna = 0; coluna < TAMANHO_ALFABETO; coluna++) {
                System.out.print(tabela[linha][coluna] + " ");
            }
            System.out.println();
        }
    }
}
