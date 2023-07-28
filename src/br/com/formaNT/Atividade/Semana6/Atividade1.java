package br.com.formaNT.Atividade.Semana6;
import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        System.out.println("Calculadora idade em dias");
        Scanner sc = new Scanner(System.in);

        // Obter valor de Ano
        int anos;
        System.out.print("Digite quantos anos voce tem: ");
        anos = sc.nextInt();

        // Obter valor de Meses
        int meses;
        System.out.print("Digite quantos meses possui: ");
        meses = sc.nextInt();


        // Obter valor de Dias
        int dias;
        System.out.print("Digite quantos dias possui: ");
        dias = sc.nextInt();



        int calculo= (anos*365)+(meses*30)+dias;


        System.out.println("Sua idade em dias e: "+calculo);


    }
}
