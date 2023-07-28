package br.com.formaNT.Atividade.Semana6;
import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double ipi;
        System.out.print("Digite a porcentagem de IPI: ");
        ipi = sc.nextDouble();
        int item1;
        System.out.print("Digite o codigo do item 1: ");
        item1 = sc.nextInt();
        double valorItem1;
        System.out.print("Digite o valor do item 1: ");
        valorItem1 = sc.nextDouble();
        int quantidadeItem1;
        System.out.print("Digite a quantidade do item 1: ");
        quantidadeItem1 = sc.nextInt();

        int item2;
        System.out.print("Digite o codigo do item 2: ");
        item2 = sc.nextInt();
        double valorItem2;
        System.out.print("Digite o valor do item 2: ");
        valorItem2 = sc.nextDouble();
        int quantidadeItem2;
        System.out.print("Digite a quantidade do item 2: ");
        quantidadeItem2 = sc.nextInt();


        double formula = (valorItem1 * quantidadeItem1 + valorItem2 * quantidadeItem2) * (ipi/100 + 1);

        System.out.print("O valor total a ser pago é "+formula);

    }
}
