package br.com.formaNT.Atividade.Semana6.javapoo.classes;

public class Invoice {
    int numeroPedido;
    String descriçãoItem;

    int quantidadeItem;

    double valorItem;

    public Invoice(int numeroPedido, String descriçãoItem, int quantidadeItem, double valorItem) {
        this.numeroPedido = numeroPedido;
        this.descriçãoItem = descriçãoItem;
        setQuantidadeItem(quantidadeItem);
        setValorItem(valorItem);
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public String getDescriçãoItem() {
        return descriçãoItem;
    }

    public void setDescriçãoItem(String descriçãoItem) {
        this.descriçãoItem = descriçãoItem;
    }

    public int getQuantidadeItem() {
        return quantidadeItem;
    }

    public void setQuantidadeItem(int quantidadeItem) {
        if (quantidadeItem > 0) {
            this.quantidadeItem = quantidadeItem;
        }else{
            this.quantidadeItem = 0;
        }
    }

    public double getValorItem() {
        return valorItem;
    }

    public void setValorItem(double valorItem) {
       if (valorItem > 0 ) {
           this.valorItem = valorItem;
       }else{
           this.valorItem = 0;
       }
       }

    public double getInvoiceAmount(){
        return quantidadeItem * valorItem;
    }

}
