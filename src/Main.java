import br.com.creditcard.modelos.CartaoDeCredito;
import br.com.creditcard.modelos.Menssageiro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean running = false;

        Scanner scanner = new Scanner(System.in);
        Menssageiro menssageiro = new Menssageiro();

        menssageiro.boasVindas();

        CartaoDeCredito cartao = new CartaoDeCredito();
        cartao.setApelidoDoCartao("Visa");

        menssageiro.inicializar();

        while (!running){
            running = cartao.setSaldoDoCartao(scanner.nextDouble());
        }

        menssageiro.saldoAtual(cartao);

        while (running){
            System.out.println("\nDigite 1 para cadastrar compra ou 0 para encerrar.\n");
            int response = scanner.nextInt();

            if (response == 0){
                menssageiro.saldoAtual(cartao);
                cartao.extratoDoCartao();
                running = false;

            } else if (response == 1) {
                running = cartao.cadastraCompra();
                if (!running){
                    menssageiro.saldoInsuficiente(cartao);
                    cartao.extratoDoCartao();
                }

            } else {
                System.out.println("Valor Inválido;");
            }
        }

    }
}
