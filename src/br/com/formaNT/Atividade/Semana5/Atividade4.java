import java.util.Scanner;

public class Atividade4
{
    public static void main(String[] args) {
        System.out.println("Calculadora média ponderada do aluno");
        Scanner sc = new Scanner(System.in);
        
       
        double num1;
        System.out.print("Digite a primeira nota: ");
        num1 = sc.nextInt();
        
        
        double num2;
        System.out.print("Digite a segunda nota: ");
        num2 = sc.nextInt();
       


        double num3;
        System.out.print("Digite a 3 nota: ");
        num3 = sc.nextInt();
     
        double pesoNota1 = 2.0;
        double pesoNota2 = 3.0;
        double pesoNota3 = 5.0;
        
        double somapesos = pesoNota1 + pesoNota2 + pesoNota3;
        
        
        double calculo=(num1*pesoNota1+num2*pesoNota2+num3*pesoNota3) / somapesos;

        
        System.out.println("A Média do aluno é : "+calculo);
        
    
    }
}
