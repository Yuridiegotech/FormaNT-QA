package br.com.formaNT.Atividade.Semana6.javapoo;
import java.util.Scanner;
import br.com.formaNT.Atividade.Semana6.javapoo.classes.Invoice;

import java.sql.SQLOutput;

public class Atividade2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número do pedido: ");
        int numeroPedido = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do Scanner

        System.out.print("Digite a descrição do produto: ");
        String descricaoItem = scanner.nextLine();

        System.out.print("Digite a quantidade pedida: ");
        int quantidadeItem = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do Scanner

        System.out.print("Digite o valor do produto: ");
        double valorItem = scanner.nextDouble();

        Invoice invoice = new Invoice (numeroPedido,descricaoItem,quantidadeItem,valorItem);

        System.out.println("O Numero do pedido é: "+invoice.getNumeroPedido());
        System.out.println("A Descrição do produto é: "+invoice.getDescriçãoItem());
        System.out.println("A Quantidade pedida é: "+invoice.getQuantidadeItem());
        System.out.println("O Valor do produto é "+invoice.getValorItem());
        System.out.println("O Valor do pedido é "+invoice.getInvoiceAmount());



    }
}
