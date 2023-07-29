package br.com.formaNT.Atividade.Semana6.javainicial;
import java.util.Scanner;

public class Atividade6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor;
        System.out.print("Digite qual é o numero: ");
        valor = sc.nextInt();

        int antecessor = valor - 1;
        int sucessor = valor + 1;

        System.out.println("O antecessor de " + valor + " é: " + antecessor);
        System.out.println("O sucessor de " + valor + " é: " + sucessor);

    }

}
