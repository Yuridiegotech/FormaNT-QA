package br.com.formaNT.Atividade.Semana1.classes;



    public class Funcionario extends Pessoa {
        private String cargo;
        private double salario;

        // Construtor
        public Funcionario(String nome, String cpf, String rg, int idade, String cargo, double salario) {
            super(nome, cpf, rg, idade);
            this.cargo = cargo;
            this.salario = salario;
        }

        // Getters e Setters
        public String getCargo() {
            return cargo;
        }

        public void setCargo(String cargo) {
            this.cargo = cargo;
        }

        public double getSalario() {
            return salario;
        }

        public void setSalario(double salario) {
            this.salario = salario;
        }
    }

