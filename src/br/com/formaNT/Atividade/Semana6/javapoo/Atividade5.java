package br.com.formaNT.Atividade.Semana6.javapoo;

import br.com.formaNT.Atividade.Semana6.javapoo.classes.Datas;

public class Atividade5 {


    public static void main(String[] args) {

        //testando construtor
        Datas data = new Datas(31, 12, 2023);
        System.out.println("Data 1: " + data);


        int dataDia = data.getDia();
        int dataMes = data.getMes();
        int dataAno = data.getAno();

        System.out.println("teste data dia"+dataDia);
        //Testar avançar dia

        data.avançarDia();

        System.out.println("Data avançada: " + data);




        //Puxa dia atual
        Datas dataAtual = new Datas();
        System.out.println("Data 3 (atual): " + dataAtual);
    }

    // Testando construtor




}
