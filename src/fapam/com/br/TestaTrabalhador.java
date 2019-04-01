package fapam.com.br;

import java.util.Scanner;

public class TestaTrabalhador {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Trabalhador pessoa = new Trabalhador();
        Trabalhador pessoa2 = new Trabalhador();
        Trabalhador pessoa3 = new Trabalhador();
        int contador = 0;
        System.out.println("Informe o nome da pessoa "+ contador++);
        pessoa.setNome(input.nextLine());
        System.out.println("Informe a matricula da pessoa "+ contador);
        pessoa.setMatricula(input.nextInt());
        System.out.println("Informe o salário da pessoa "+ contador);
        pessoa.setSalario(input.nextDouble());
        System.out.println("Informe o nome da pessoa "+ contador++);
        pessoa2.setNome(input.nextLine());
        System.out.println("Informe a matricula da pessoa "+ contador);
        pessoa2.setMatricula(input.nextInt());
        System.out.println("Informe o salário da pessoa "+ contador);
        pessoa2.setSalario(input.nextDouble());
        System.out.println("Informe o nome da pessoa "+ contador++);
        pessoa3.setNome(input.nextLine());
        System.out.println("Informe a matricula da pessoa "+ contador);
        pessoa3.setMatricula(input.nextInt());
        System.out.println("Informe o salário da pessoa "+ contador);
        pessoa3.setSalario(input.nextDouble());
        System.out.println("================================================\n"+pessoa.exibirTrabalhador());
        System.out.println("================================================\n"+pessoa2.exibirTrabalhador());
        System.out.println("================================================\n"+pessoa3.exibirTrabalhador());



    }
}
