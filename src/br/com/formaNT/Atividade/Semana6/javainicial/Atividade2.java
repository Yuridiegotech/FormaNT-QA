package br.com.formaNT.Atividade.Semana6.javainicial;
import java.util.Scanner;
public class Atividade2 {
    public static void main(String[] args) {



        double num1 = 8;
        double num2 = 9;
        double num3 = 7;

        double mediaAritimetica1 = (num1+num2+num3)/3;

        double num4 = 4;
        double num5 = 5;
        double num6 = 6;

        double mediaAritimetica2 = (num4+num5+num6)/3;

        double somaMedia = mediaAritimetica1+mediaAritimetica2;

        double mediaMedia = somaMedia/2;

        System.out.println("A Média Aritimética de 8,9,7 é :"+mediaAritimetica1);

        System.out.println("A Média Aritimética de 4,5,6 é: "+mediaAritimetica2);

        System.out.println("A Soma das médias é: "+somaMedia);

        System.out.println("A Média das médias é: "+mediaMedia);



    }
}
