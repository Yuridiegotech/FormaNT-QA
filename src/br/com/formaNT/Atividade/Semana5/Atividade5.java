import java.util.Scanner;

public class Atividade5
{
    public static void main(String[] args) {
        System.out.println("Calculadora média do aluno");
        Scanner sc = new Scanner(System.in);
        
       
        double num1;
        System.out.print("Digite a primeira nota: ");
        num1 = sc.nextInt();
        
        
        double num2;
        System.out.print("Digite a segunda nota: ");
        num2 = sc.nextInt();
       


        double num3;
        System.out.print("Digite a terceira nota: ");
        num3 = sc.nextInt();
     
        
        
        
        double calculo=(num1+num2+num3) / 3;

        if (calculo > 6) {
             System.out.println("A Média do aluno é : "+calculo +" o aluno foi APROVADO");
        }else{
        System.out.println("A Média do aluno é : "+calculo +"o aluno foi REPROVADO");
        }
    
    }
}
