import br.com.formaNT.Atividade.Semana1.classes.Motorista;

public class AtividadeNumero4 {
    public static void main(String[] args) {
        // Instanciar dois motoristas
        Motorista motorista1 = new Motorista("Diego", "1111111111", "1234", 15, "Motorista", 5000.0, "123456", "ABC1234");
        Motorista motorista2 = new Motorista("Yuri", "987654321", "54321678", 35, "Motorista", 3500.0, "654321", "DEF5678");

        // Imprimir as informações de cada motorista
        System.out.println("Motorista 1:");
        System.out.println("Nome: " + motorista1.getNome());
        System.out.println("Cargo: " + motorista1.getCargo());
        System.out.println("Placa do Carro: " + motorista1.getPlacaCarro());

        System.out.println();

        System.out.println("Motorista 2:");
        System.out.println("Nome: " + motorista2.getNome());
        System.out.println("Cargo: " + motorista2.getCargo());
        System.out.println("Placa do Carro: " + motorista2.getPlacaCarro());
    }
}
