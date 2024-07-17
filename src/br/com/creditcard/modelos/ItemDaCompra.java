package br.com.creditcard.modelos;

public class ItemDaCompra implements Comparable<ItemDaCompra>{
    private double valor;
    private String descricao;

    @Override
    public String toString() {
        return "ITEM: " + this.descricao + " VALOR: R$" + this.valor + "\n";
    }

    @Override
    public int compareTo(ItemDaCompra outroItem){
        if (this.valor > outroItem.valor){
            return 1;
        } else if (this.valor < outroItem.valor) {
            return -1;
        } else {
            return 0;
        }
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
