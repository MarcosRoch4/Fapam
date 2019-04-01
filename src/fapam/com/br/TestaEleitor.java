package fapam.com.br;

import java.util.Scanner;

public class TestaEleitor {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        Eleitor eleitor = new Eleitor();

        System.out.println("Informe o nome do eleitor.");
        eleitor.setNome(input.nextLine());
        System.out.println("Informe o sexo do eleitor.");
        eleitor.setSexo(input.nextLine().charAt(0));
        System.out.println("Informe o número do titulo");
        eleitor.setNumeroTitulo(input.nextInt());
        System.out.println("Informe a idade do eleitor");
        eleitor.setIdade(input.nextInt());

    }
}
