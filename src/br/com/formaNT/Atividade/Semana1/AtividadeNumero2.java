package br.com.formaNT.Atividade.Semana1;

public class AtividadeNumero2 {
    public static void main(String[] args) {

        int numero = 150;

        System.out.println("Números primos de 1 a " + numero + ":");

        for (int i = 2; i <= numero; i++) {
            if (primo(i)) {
                System.out.println(i);
            }
        }
    }

    // Função auxiliar para verificar se um número é primo
    public static boolean primo(int num) {
        if (num < 2) {
            return false;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
