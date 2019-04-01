package fapam.com.br;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class TestaJogador {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Jogador jogador1 = new Jogador();
        Jogador jogador2 = new Jogador();
// Jogador 1
        System.out.println("QUAL O NOME DO JOGADOR?");
        jogador1.setNome(input.nextLine());
        System.out.println("QUAL O NUMERO DA CAMISA DO JOGADOR?");
        jogador1.setNumCamisa(input.nextLine());
        System.out.println("QUAL A POSIÇÃO DO JOGADOR?");
        jogador1.setPosicao(input.nextLine());
        System.out.println("QUAL O SALDO DE GOLS DO JOGADOR");
        jogador1.setNumGols(input.nextInt());

 // Jogador 2
        System.out.println("QUAL O NOME DO JOGADOR?");
        jogador2.setNome(input.nextLine());
        System.out.println("QUAL O NUMERO DA CAMISA DO JOGADOR?");
        jogador2.setNumCamisa(input.nextLine());
        System.out.println("QUAL A POSIÇÃO DO JOGADOR?");
        jogador2.setPosicao(input.nextLine());
        System.out.println("QUAL O SALDO DE GOLS DO JOGADOR");
        jogador2.setNumGols(input.nextInt());

            if(jogador1.artileiro(jogador1.getNumGols()) == true)
                System.out.println("!!!! - ARTILEIRO - !!!!\n" + jogador1.exibirJogador());
            else
                System.out.println(jogador1.exibirJogador());

            if(jogador2.artileiro(jogador2.getNumGols()) == true)
                System.out.println("!!!! - ARTILEIRO - !!!!\n" + jogador2.exibirJogador());
            else
                System.out.println(jogador2.exibirJogador());

    }

}
