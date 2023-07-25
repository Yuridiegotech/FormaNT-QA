package br.com.formaNT.Atividade.Semana2;

import java.sql.SQLOutput;

public class Atividade1 {

    public static void main(String[] args) {
        StringBuilder mensagem;
        int numero = 7;
        int fat = 1;
        for (int i = 1; i <= numero ; i++) {

            fat = fat * i;

        }
            if(numero < 0){
                System.out.println("o numero informado é invalido");

            }else {

                mensagem = new StringBuilder();
                mensagem.append("O Fatorial de: " + numero);
                mensagem.append("\n");
                mensagem.append("É o valor de: " + fat);
                System.out.println(mensagem.toString());
            }

    }
}
