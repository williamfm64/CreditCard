package br.com.creditcard.modelos;

public class Menssageiro {

    public void boasVindas(){
        System.out.println("********************************************\n");
        System.out.println("BEM VINDO AO SISTEMA DE CADASTRO DE COMPRAS\n");
        System.out.println("********************************************\n");
    }

    public void inicializar(){
        System.out.println("Digite o saldo inicial do seu cartão de crédito:\n");
    }

    public void saldoAtual(CartaoDeCredito cartao){
        System.out.println("\n********************************************");
        System.out.println("\nCARTÃO: " + cartao.getApelidoDoCartao() + "\n\nLIMITE DISPONÍVEL: R$" + cartao.getSaldoDoCartao());
        System.out.println("\n********************************************\n");
    }

    public void saldoInsuficiente(CartaoDeCredito cartao){
        System.out.println("\n********************************************\n");
        System.out.println("LIMITE INSUFICIENTE! LIMITE AUTAL: R$" + cartao.getSaldoDoCartao() + "\n");
        System.out.println("********************************************\n");
    }
}
