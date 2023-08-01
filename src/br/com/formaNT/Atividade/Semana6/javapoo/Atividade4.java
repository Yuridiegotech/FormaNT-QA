package br.com.formaNT.Atividade.Semana6.javapoo;
import br.com.formaNT.Atividade.Semana6.javapoo.classes.Complex;

import java.util.Scanner;
public class Atividade4 {
    private Atividade4(){

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Forneça o primeiro número complexo");

        System.out.print("Valor da parte real: ");

        double real = scanner.nextDouble();

        System.out.print("Valor da parte imaginária: ");

        double imaginario = scanner.nextDouble();

        Complex complex1 = new Complex(real, imaginario);

        System.out.println("Forneça o segundo número complexo");

        System.out.print("Valor da parte real: ");

        real = scanner.nextDouble();

        System.out.print("Valor da parte imaginária: ");

        imaginario = scanner.nextDouble();

        Complex complex2 = new Complex(real, imaginario);

        scanner.close();

        Complex complex3 = complex1.addition(complex2);

        Complex complex4 = complex1.Subtraction(complex2);

        System.out.println(complex1 + " + " + complex2 + " = " + complex3);

        System.out.println(complex1 + " - " + complex2 + " = " + complex4);



    }

}
