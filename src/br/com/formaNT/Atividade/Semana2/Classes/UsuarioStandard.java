package br.com.formaNT.Atividade.Semana2.Classes;

public class UsuarioStandard implements Usuario {
    @Override
    public Double getValorDesconto(double valorProduto) {
        if (valorProduto > 200){
            return valorProduto * 0.2;
        }else {
            return 0.0;
        }
    }

    @Override
    public String getTipoUsuario() {
        return "Standard";
    }

    @Override
    public double getValorFreteDesconto(double valorFrete, double valorProduto) {
        if (valorProduto > 200) {
            return valorFrete * 0.9;
        }else {
            return valorFrete;
        }
    }
}
