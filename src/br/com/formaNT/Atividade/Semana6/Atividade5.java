package br.com.formaNT.Atividade.Semana6;
import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salarioMinimo;
        System.out.print("Digite qual é o salário minimo atual: ");
        salarioMinimo = sc.nextDouble();
        double salarioUsuario;
        System.out.print("Digite qual é o seu salário atual: ");
        salarioUsuario = sc.nextDouble();

        double quantidadeSalario = salarioUsuario/salarioMinimo;

        System.out.print("O Usuario recebe "+quantidadeSalario+" Salario Minimo");
    }
}
