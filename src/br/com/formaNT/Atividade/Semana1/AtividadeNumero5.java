package br.com.formaNT.Atividade.Semana1;

public class AtividadeNumero5 {
    public static void main(String[] args) {
        int tamanho = 3; // Tamanho da matriz identidade desejada
        int[][] matrizIdentidade = new int[tamanho][tamanho]; // Matriz recebe valor de Tamanho, EX [5][5]

        // Gerar a matriz identidade
        //aqui, percorremos a matriz, onde tamanho for igual, preenche 1, onde for diferente preenche 0.
        //por ex [1][1] = 1 [1][2] = 0 [2][2] = 1
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                if (i == j) {
                    matrizIdentidade[i][j] = 1;
                } else {
                    matrizIdentidade[i][j] = 0;
                }
            }
        }

        // Imprimir a matriz identidade
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                System.out.print(matrizIdentidade[i][j] + " ");
            }
            System.out.println();
        }
    }
}
