package br.com.formaNT.Atividade.Semana6.javapoo.classes;

public class Campo {
    private boolean estaVazio;
    private String simbolo;

    public Campo() {
        this.reset();
    }

    public boolean getEstaVazio(){
        return this.estaVazio;
    }
    public String getSimbolo(){
        return this.simbolo;
    }

    public boolean setSimbolo(String simbolo){
        if (this.estaVazio) {
            if (simbolo.equals("X") || simbolo.equals("O")) {
                this.simbolo = simbolo;
                this.estaVazio = false;
                return true;
            }
        }
            return false;

    }
    public void reset(){

        this.simbolo = " ";
        this.estaVazio = true;
    }

}