import java.util.Scanner;

public class Atividade6
{
    public static void main(String[] args) {
        System.out.println("Calculadora média do aluno");
        Scanner sc = new Scanner(System.in);
        
       
        int idade;
        System.out.print("Digite a idade do nadador: ");
        idade = sc.nextInt();
        
       if (idade >= 5 && idade <= 7) {
            System.out.println("Categoria: Infantil A");
        } else if (idade >= 8 && idade <= 10) {
            System.out.println("Categoria: Infantil B");
        } else if (idade >= 11 && idade <= 13) {
            System.out.println("Categoria: Juvenil A");
        } else if (idade >= 14 && idade <= 17) {
            System.out.println("Categoria: Juvenil B");
        } else if (idade >= 18) {
            System.out.println("Categoria: Adulto");
        } else {
            System.out.println("Idade inválida para a classificação.");
        }
        
    
    }
}
