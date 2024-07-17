package br.com.creditcard.modelos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CartaoDeCredito {
    private double saldoDoCartao;
    private String apelidoDoCartao;
    private ArrayList<ItemDaCompra> listaDeCompras = new ArrayList<>();

    public double getSaldoDoCartao() {
        return saldoDoCartao;
    }

    public boolean setSaldoDoCartao(double saldoDoCartao) {
        if (saldoDoCartao > 0){
            this.saldoDoCartao = saldoDoCartao;
            return true;
        }else {
            System.out.println("Valor inválido, digite novamente.");
            return false;
        }
    }

    public String getApelidoDoCartao() {
        return apelidoDoCartao;
    }

    public void setApelidoDoCartao(String apelidoDoCartao) {
        this.apelidoDoCartao = apelidoDoCartao;
    }

    public boolean cadastraCompra(){
        ItemDaCompra novoItem = new ItemDaCompra();
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nDigite o nome do item:");
        novoItem.setDescricao(scanner.nextLine());

        System.out.println("\nDigite o valor da compra:");
        double valorDaCompra = scanner.nextDouble();

        if (valorDaCompra <= this.saldoDoCartao){
            novoItem.setValor(valorDaCompra);
            this.saldoDoCartao -= valorDaCompra;
            System.out.println("\nCompra realizada!");

        } else {
            return false;
        }

        listaDeCompras.add(novoItem);
        return true;
    }

    public void extratoDoCartao(){
        System.out.println("\n********************************************\n");
        System.out.println("COMPRAS REALIZADAS:\n");

        Collections.sort(listaDeCompras);
        for (ItemDaCompra item : listaDeCompras){
            System.out.println(item);
        }
        System.out.println("********************************************\n");
    }

}
