package br.com.formaNT.Atividade.Semana6.javapoo;

import br.com.formaNT.Atividade.Semana6.javapoo.classes.Empregado;

public class Atividade3 {
    public static void main(String[] args) {
        // Criando duas instâncias da classe Empregado
        Empregado empregado1 = new Empregado("Diego", "Yuri", 3000.0);
        Empregado empregado2 = new Empregado("Maria", "Santos", 3500.0);

        // Exibindo o salário anual de cada empregado
        System.out.println("Salário anual de " + empregado1.getNome() + " " + empregado1.getSobrenome() + ": R$" + empregado1.salarioAnual());
        System.out.println("Salário anual de " + empregado2.getNome() + " " + empregado2.getSobrenome() + ": R$" + empregado2.salarioAnual());

        empregado1.aumentaSalario();
        empregado2.aumentaSalario();

        System.out.println("Salário anual de " + empregado1.getNome() + " " + empregado1.getSobrenome() + ":Após reajuste salarial é: R$" + empregado1.salarioAnual());
        System.out.println("Salário anual de " + empregado2.getNome() + " " + empregado2.getSobrenome() + ":Após reajuste salarial é: R$" + empregado2.salarioAnual());




    }


}
