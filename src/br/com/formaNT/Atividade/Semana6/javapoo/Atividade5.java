package br.com.formaNT.Atividade.Semana6.javapoo;
import java.util.Scanner;
import br.com.formaNT.Atividade.Semana6.javapoo.classes.Datas;

public class Atividade5 {


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int opcao;
        System.out.println("Digite 1 para informar uma data");
        System.out.println("Digite 2 para ver uma data atual");
        System.out.print("Opção: ");
        opcao = sc.nextInt();


        int dia = 0;
        int mes = 0;
        int ano = 0;
        if (opcao == 1) {

            System.out.print("Digite o Dia desejado: ");
            dia = sc.nextInt();

            System.out.print("Digite o Mes desejado: ");
            mes = sc.nextInt();

            System.out.print("Digite o Ano desejado: ");
            ano = sc.nextInt();
            System.out.println("------------------------------");
            System.out.println("A Data informada é "+dia+"/"+mes+"/"+ano);
            System.out.println("------------------------------");


        } else if (opcao == 2) {
            Datas dataAtual = new Datas(); // Usando o construtor padrão para obter a data atual
            dia = dataAtual.getDia();
            mes = dataAtual.getMes();
            ano = dataAtual.getAno();
            System.out.println("A Data atual é: " + dataAtual);
        }else{
            throw new IllegalArgumentException("opção inválida!");
        }

        //Chamando construtor
        Datas data = new Datas(dia, mes, ano);




        System.out.println("------------------------------");


        System.out.println("Deseja Usar a função de avançar dia ? ");
        int avancar;
        System.out.println("Digite 1 usar a função");
        System.out.println("Digite 2 para encerrar o programa");
        System.out.print("Opção: ");
        avancar = sc.nextInt();

        if (avancar == 1){
            data.avançarDia();

            System.out.println("Data avançada: " + data);


        } else {
            System.out.println("Programa Encerrado");
        }







    }
}
