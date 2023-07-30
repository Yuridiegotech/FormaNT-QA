package br.com.formaNT.Atividade.Semana6.javapoo.classes;
import java.util.Calendar;


public class Datas {
    int dia;
    int mes;

    int ano;

    public Datas(int dia, int mes, int ano) {
        if (validarData(dia, mes, ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            throw new IllegalArgumentException("Data inválida!");
        }
    }
    public Datas() {
        Calendar dataAtual = Calendar.getInstance();
        this.dia = dataAtual.get(Calendar.DAY_OF_MONTH);
        this.mes = dataAtual.get(Calendar.MONTH) + 1; // Note que o mês em Calendar começa em 0
        this.ano = dataAtual.get(Calendar.YEAR);
    }


    // ----------------------------
    // Verificar e validar o set

    private boolean validarData(int dia,int mes,int ano){
        if (ano <0 || mes < 1 || mes > 12 || dia <0 || dia > 31){
            return false;
        }
        return true;
    }


    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if (validarData(dia, this.mes, this.ano)) {
            this.dia = dia;
        } else {
            throw new IllegalArgumentException("Dia inválido!");
        }
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if (validarData(this.dia, mes, this.ano)) {
            this.mes = mes;
        } else {
            throw new IllegalArgumentException("Mês inválido!");
        }
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if (validarData(this.dia, this.mes, ano)) {
            this.ano = ano;
        } else {
            throw new IllegalArgumentException("Ano inválido!");
        }
    }






    @Override
    public String toString() {
        return String.format("%02d/%02d/%04d", dia, mes, ano);
    }
}
