import java.util.Scanner;

public class Atividade2
{
    public static void main(String[] args) {
        System.out.println("Calculo da expressão A + B / C * B * A");
        System.out.println("Digite o valor de A,B,C 3 Sendo eles inteiros e positivos");
        Scanner sc = new Scanner(System.in);
        
         // Obter valor de A
        int num1;
        System.out.print("Digite o valor de A: ");
        num1 = sc.nextInt();
        if (num1 < 0 || num1 == 1) {
            System.out.println("deve ser um número inteiro e esse numero não pode ser 1.");
            return;
        }

        // Obter valor de B
        int num2;
        System.out.print("Digite o valor de B: ");
        num2 = sc.nextInt();
        if (num2 < 0 || num2 == 2) {
            System.out.println("deve ser um número inteiro e positivo e esse numero não pode ser 2.");
            return;
        }

        // Obter valor de C
        int num3;
        System.out.print("Digite o valor de C: ");
        num3 = sc.nextInt();
        if (num3 <= 0 && num3 <= 10 || num3 >= 15) {
            System.out.println("C deve ser um número e tem que estar entre 10 e 15");
            return;
        }
        
        
        int calculo= num1 + num2 / num3 * num2 * num1;

        
        System.out.println("O Resultado do calculo e: "+calculo);
        
    
    }
}
