package br.com.formaNT.Atividade.Semana1;

public class AtividadeNumero3 {
    public static void main(String[] args) {
       String palavra = "arara";

       boolean palindromo = verificarpalindromo(palavra);

        if (palindromo == true){
            System.out.println("A Palavra é um Palindromo");
        }else{
            System.out.println("A Plavra NÃO é um Palindromo");
        }

}

        private  static boolean verificarpalindromo(String palavra){

        String palavrainverso = "";
        for(int i= palavra.length()-1;i>=0;i--){
            palavrainverso += palavra.charAt(i);
        }
        return palavra.equals(palavrainverso);
    }
}
