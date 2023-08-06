    package br.com.formaNT.Atividade.Semana6.javapoo;

    import br.com.formaNT.Atividade.Semana6.javapoo.classes.Campo;
    import br.com.formaNT.Atividade.Semana6.javapoo.classes.Tabuleiro;

    import java.sql.SQLOutput;
    import java.util.Scanner;

    public class Atividade6 {
        public static void main(String[] args) {
            Scanner leitor = new Scanner(System.in);
            Tabuleiro t = new Tabuleiro();
            int jogadorAtual = 0;
            String[] simbolos = {"O","X"};
            int l,c;

            while(t.verificaGanhador().equals("N")){
                System.out.println("--Jogador Atual: "+ simbolos[jogadorAtual] + " ---");
                System.out.print("Digite a Linha a ser jogada: ");
                l = leitor.nextInt();
                System.out.print("Digite a coluna a ser jogada: ");
                c = leitor.nextInt();
                if(!t.setSimbolo(l,c,simbolos[jogadorAtual])){
                    System.out.println("Jogada inválida");
                    continue;
                }
                System.out.println(t);

                if (jogadorAtual == 0 ){
                    jogadorAtual = 1;
                }else{
                    jogadorAtual = 0;
                }

            }

            // indica o jogador
            System.out.println("Ganhador "+t.verificaGanhador() );

        }
    }
