package br.com.formaNT.Atividade.Semana2.Classes;

public class UsuarioBase implements Usuario {
    @Override
    public Double getValorDesconto(double valorProduto) {
        if (valorProduto > 300){
            return valorProduto * 0.05;
        }else {
            return 0.0;
        }
    }

    @Override
    public String getTipoUsuario() {
        return "Base";
    }

    @Override
    public double getValorFreteDesconto(double valorFrete, double valorProduto) {
        if (valorProduto > 300) {
            return valorFrete * 0.95;
        }else {
            return valorFrete;
        }
    }
}
