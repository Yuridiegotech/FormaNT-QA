package br.com.formaNT.Atividade.Semana2;

import br.com.formaNT.Atividade.Semana2.Classes.Usuario;
import br.com.formaNT.Atividade.Semana2.Classes.UsuarioBase;
import br.com.formaNT.Atividade.Semana2.Classes.UsuarioStandard;
import br.com.formaNT.Atividade.Semana2.Classes.UsuarioPremium;

public class Atividade4 {

    public static void main(String[] args) {
        double valorProduto = 301;
        double valorFrete = 200;

        Usuario usuarioBase = new UsuarioBase();
        Usuario usuarioStandard = new UsuarioStandard();
        Usuario usuarioPremium = new UsuarioPremium();

        System.out.println("Usuário: " + usuarioBase.getTipoUsuario());
        System.out.println("Desconto: " + usuarioBase.getValorDesconto(valorProduto));
        System.out.println("Valor do frete: " + usuarioBase.getValorFreteDesconto(valorFrete, valorProduto));
        System.out.println();

        System.out.println("Usuário: " + usuarioStandard.getTipoUsuario());
        System.out.println("Desconto: " + usuarioStandard.getValorDesconto(valorProduto));
        System.out.println("Valor do frete: " + usuarioStandard.getValorFreteDesconto(valorFrete, valorProduto));
        System.out.println();

        System.out.println("Usuário: " + usuarioPremium.getTipoUsuario());
        System.out.println("Desconto: " + usuarioPremium.getValorDesconto(valorProduto));

        if (usuarioPremium.getValorFreteDesconto(valorFrete, valorProduto) == 0.0){
            System.out.println("Frete Gratis");
        }else {
            System.out.println("Valor do frete: " + usuarioPremium.getValorFreteDesconto(valorFrete, valorProduto));
        }

    }
}
