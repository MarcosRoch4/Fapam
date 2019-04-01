package fapam.com.br;

public class Trabalhador {

    private String nome;
    private int matricula;
    private double salario;


    public String exibirTrabalhador(){
        return "Nome: " + this.nome + "\nMatricula: " + "\nSalário: R$" +this.salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario < 998)
            this.salario = 998;
        else
            this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }


}
