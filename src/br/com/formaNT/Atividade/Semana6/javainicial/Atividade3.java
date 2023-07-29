package br.com.formaNT.Atividade.Semana6.javainicial;
import java.util.Scanner;
public class Atividade3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salario;
        System.out.print("Digite o seu salário: ");
        salario = sc.nextDouble();

        double reajuste = salario * 0.01;
        double salarioRejustado=reajuste+salario;
        System.out.print("Seu salário reajustado é: "+salarioRejustado);

    }
}