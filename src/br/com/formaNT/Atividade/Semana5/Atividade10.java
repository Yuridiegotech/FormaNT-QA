import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Indique o índice de poluição medido: ");
        double indice = sc.nextDouble();

        if (indice >= 0.05 && indice < 0.3) {
            System.out.print("O Índice está dentro do normal.");
        } else if (indice >= 0.3 && indice < 0.4) {
            System.out.print("As indústrias do 1° precisa ser intimada à suspensão.");
        } else if (indice >= 0.4 && indice < 0.5) {
            System.out.print("As indústrias do 1° e 2° precisam ser intimadas à suspensão.");
        } else if (indice >= 0.5) {
            System.out.print("Todas as indústrias precisam paralisar suas operações.");
        } else {
            System.out.println("Índice inválido.");
        }
    }
}
