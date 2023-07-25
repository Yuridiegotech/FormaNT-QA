import java.util.Scanner;
import java.text.DecimalFormat;

public class Atividade9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.print("Digite o RA do aluno: ");
        int registroAluno = sc.nextInt();

        double num1;
        System.out.print("Digite a 1° nota: ");
        num1 = sc.nextDouble();
        
        
        double num2;
        System.out.print("Digite a 2° nota: ");
        num2 = sc.nextDouble();
       


        double num3;
        System.out.print("Digite a 3° nota: ");
        num3 = sc.nextDouble();
        
         double mediaExercicios ;
        System.out.print("Digite a média dos exercicios: ");
        mediaExercicios  = sc.nextDouble();
        
        
        double mediadeAproveitamento = (num1 + num2 * 2 + num3 * 3 + mediaExercicios )/7;
        
        String conceito;
        String status;
        
       if (mediadeAproveitamento >= 9.0) {
            conceito = "A";
            status = "Aprovado";
        } else if (mediadeAproveitamento >= 7.5) {
            conceito = "B";
            status = "Aprovado";
        } else if (mediadeAproveitamento >= 6.0) {
            conceito = "C";
            status = "Aprovado";
        } else if (mediadeAproveitamento >= 4.0) {
            conceito = "D";
            status = "Reprovado";
        } else {
            conceito = "E";
            status = "Reprovado";
        }
        
        
        System.out.println("O Aluno de RA: "+ registroAluno + " Foi " + status);
        System.out.println("o que compos suas notas foi");
        System.out.println("Nota 1: "+num1);
        System.out.println("Nota 2: "+num2);
        System.out.println("Nota 3: "+num3);
        System.out.println("Sua média dos exercicios foi : "+mediaExercicios);
        System.out.println("E sua média de Aproveitamento foi: " + df.format(mediadeAproveitamento));
        

    }
}
