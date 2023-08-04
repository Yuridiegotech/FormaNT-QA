package br.com.formaNT.Atividade.Semana6.javapoo.classes;

public class Tabuleiro {

    private Campo[][] matriz;

    //metodo chamada na construção do objeto
    public Tabuleiro() {
        matriz = new Campo[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = new Campo();
            }
        }

    }


    public boolean setSimbolo(int l, int c, String simbolo) {

        if (c < 0 || c > 2) return false;
        if (l < 0 || l > 2) return false;
        return matriz[l][c].setSimbolo(simbolo);
    }

    public String getSimbolo(int l, int c) {
        return matriz[l][c].getSimbolo();
    }

    public boolean getEstaVazio(int l, int c){
        return matriz[l][c].getEstaVazio();
               }

    public void reset () {
     for (int l = 0; l < 3; l++){
         for (int c=0; c < 3; c++){
             matriz[l][c].reset();
         }
     }
    }

}