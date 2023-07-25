import java.util.Scanner;

public class Atividade8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o código do item pedido: ");
        int codigo = sc.nextInt();

        System.out.print("Digite a quantidade desejada: ");
        int quantidade = sc.nextInt();
        
         double valorTotal = 0.0;
         String itempedido = "";
         
          switch (codigo) {
            case 100:
                valorTotal = 1.20 * quantidade;
                itempedido = "Cachorro quente";
                break;
            case 101:
                valorTotal = 1.30 * quantidade;
                itempedido = "Bauru simples";
                break;
            case 102:
                valorTotal = 1.50 * quantidade;
                itempedido = "Bauru com ovo";
                break;
            case 103:
                valorTotal = 1.20 * quantidade;
                itempedido = "Hamburger";
                break;
            case 104:
                valorTotal = 1.30 * quantidade;
                itempedido = "Cheeseburguer";
                break;
            case 105:
                valorTotal = 1.00 * quantidade;
                itempedido = "Refrigerante";
                break;
            default:
                System.out.println("Código inválido. Por favor, digite um código válido.");
                return; 
        }
        System.out.println("Voce comprou "+quantidade+" "+itempedido+"\nFicou o valor de: "  + valorTotal);
    }
}
