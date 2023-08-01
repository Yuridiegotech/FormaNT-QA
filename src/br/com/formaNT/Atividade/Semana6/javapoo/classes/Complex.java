package br.com.formaNT.Atividade.Semana6.javapoo.classes;


public class Complex {
        //Não compreendo o conceito de numero complexo, Neste ponto, ainda não fiz essa atividade

    private double real;
    private double imaginario;
    public Complex()
    {
        this(0.0, 0.0);
    }
    public Complex(double real, double imaginario) {
        this.real = real;
        this.imaginario = imaginario;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginario() {
        return imaginario;
    }

    public void setImaginario(double imaginario) {
        this.imaginario = imaginario;
    }

    public Complex addition (Complex other){
        this.real = real + other.real;
        this.imaginario = imaginario + other.imaginario;

        return new Complex(real,imaginario);
    }

    public Complex Subtraction (Complex other){
        this.real = real - other.real;
        this.imaginario = imaginario - other.imaginario;

        return new Complex(real,imaginario);
    }

    public String toString(){
        return "(" + real +","+imaginario+(")");
    }

}
