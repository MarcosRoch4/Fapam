package fapam.com.br;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class TestaProduto {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Produto produto = new Produto();
        Locale ptbr = new Locale("pt","br");
        System.out.println("Informe o nome do produto.");
        produto.setNome(input.nextLine());
        System.out.println("Informe o preço de custo do produto.");
        produto.setPrecoCusto(input.nextDouble());
        System.out.println("Informe o preço de venda do produto.");
        produto.setPrecoVenda(input.nextDouble());

        System.out.println("===============================");
        System.out.println("A margem de lucro do produto é: " +
                NumberFormat.getCurrencyInstance(ptbr).format(produto.calcularMargemLucro()));
        System.out.print("Referente à " + produto.getMargemLucroPorcentagem());


    }



}


