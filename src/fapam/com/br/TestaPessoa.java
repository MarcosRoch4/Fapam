package fapam.com.br;

import java.util.Scanner;

public class TestaPessoa {
    public static void main (String [] args){

        Scanner entrada = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();
        Pessoa pessoa2 = new Pessoa();

        // Coleta de dados da primeira pessoa

        System.out.println("Informe o nome da pessoa 1?");
        pessoa.setNome(entrada.nextLine());

        System.out.println("Informe endereço da pessoa 1?.");
        pessoa.setEndereco(entrada.nextLine());

        System.out.println("Informe o numero de telefone da pessoa 1?");
        pessoa.setTelefone(entrada.nextLine());

        // Coleta de dados da segunda pessoa

        System.out.println("Informe o nome da pessoa 2?");
        pessoa2.setNome(entrada.nextLine());

        System.out.println("Informe endereço da pessoa 2?.");
        pessoa2.setEndereco(entrada.nextLine());

        System.out.println("Informe o numero de telefone da pessoa 2?");
        pessoa2.setTelefone(entrada.nextLine());

        System.out.println("======================");
        System.out.println(pessoa.imprimir());
        System.out.println("======================");
        System.out.println(pessoa2.imprimir());


    }

}
