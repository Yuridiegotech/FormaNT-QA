    package br.com.formaNT.Atividade.Semana6.javapoo;

    import br.com.formaNT.Atividade.Semana6.javapoo.classes.Campo;
    import br.com.formaNT.Atividade.Semana6.javapoo.classes.Tabuleiro;

    public class Atividade6 {
        public static void main(String[] args) {

            Tabuleiro t = new Tabuleiro();

            if(t.setSimbolo(0,0,"O")){
                System.out.println("Deu certo");
            }else {
                System.out.println("deu errado");
            }

            System.out.println(t.getSimbolo(0,1));





        }
    }
