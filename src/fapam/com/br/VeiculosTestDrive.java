package fapam.com.br;

import java.util.Scanner;

public class VeiculosTestDrive {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Veiculo fox = new Veiculo();
        Veiculo spin = new Veiculo();

        // Coleta de dados do primeiro veiculo

        fox.setCor("Branco");
        fox.setMarca("Volks");
        fox.setModelo("Fox");
        fox.setNumPassageiros(5);
        fox.setQtdLitrosSuficiente(40);
        System.out.println("Informe a quantidade de combustivel no tanque do " + fox.getModelo());
        fox.setQtdLitrosAtual(entrada.nextDouble());


        // Coleta de dados do segundo Veiculo

        spin.setCor("Azul");
        spin.setMarca("GM");
        spin.setModelo("Spin");
        spin.setNumPassageiros(7);
        spin.setQtdLitrosSuficiente(60);
        System.out.println("Informe a quantidade de combustivel no tanque do " + spin.getModelo());
        spin.setQtdLitrosAtual(entrada.nextDouble());

        System.out.println("===================");
        System.out.println(fox.mostrarVeiculo());
        System.out.println("===================");
        System.out.println(spin.mostrarVeiculo());

    }
}
