package br.com.formaNT.Atividade.Semana2.Classes;

public interface Usuario {
    Double getValorDesconto(double valorProduto);
    String getTipoUsuario();
    double getValorFreteDesconto(double valorFrete, double valorProduto);
}
