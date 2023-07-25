package br.com.formaNT.Atividade.Semana1.classes;

public class Motorista extends Funcionario {
    private String cnh;
    private String placaCarro;

    // Construtor
    public Motorista(String nome, String cpf, String rg, int idade, String cargo, double salario, String cnh, String placaCarro) {
        super(nome, cpf, rg, idade, cargo, salario);
        this.cnh = cnh;
        this.placaCarro = placaCarro;
    }

    // Getters e Setters
    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public String getPlacaCarro() {
        return placaCarro;
    }

    public void setPlacaCarro(String placaCarro) {
        this.placaCarro = placaCarro;
    }
}

