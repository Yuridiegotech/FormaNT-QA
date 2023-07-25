package br.com.formaNT.Atividade.Semana1.classes;


    public class Pessoa {
        private String nome;
        private String cpf;
        private String rg;
        private int idade;

        // Construtor
        public Pessoa(String nome, String cpf, String rg, int idade) {
            this.nome = nome;
            this.cpf = cpf;
            this.rg = rg;
            this.idade = idade;
        }

        // Getters e Setters
        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getCpf() {
            return cpf;
        }

        public void setCpf(String cpf) {
            this.cpf = cpf;
        }

        public String getRg() {
            return rg;
        }

        public void setRg(String rg) {
            this.rg = rg;
        }

        public int getIdade() {
            return idade;
        }

        public void setIdade(int idade) {
            this.idade = idade;
        }
    }

