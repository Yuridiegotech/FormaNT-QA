package br.com.formaNT.Atividade.Semana2.Classes;

public class UsuarioPremium implements Usuario {
    @Override
    public Double getValorDesconto(double valorProduto) {
        if (valorProduto > 200){
            return valorProduto * 0.3;
        }else {
            return 0.0;
        }
    }

    @Override
    public String getTipoUsuario() {
        return "Premium";
    }

    @Override
    public double getValorFreteDesconto(double valorFrete, double valorProduto) {
        if (valorProduto > 100) {
            return 0.0;
        }else {
            return valorFrete;
        }
    }
}
