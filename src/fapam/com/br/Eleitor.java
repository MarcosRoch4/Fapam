package fapam.com.br;

public class Eleitor {

    private String nome;
    private char sexo;
    private int idade;
    private int numeroTitulo;

    public String eObrigad0(){
        if(this.idade >= 18 && this.idade < 60)
            return "É obrigado.";
        if(this.idade >= 16)
            return "É facultativo";
        return "não é obrigado.";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getNumeroTitulo() {
        return numeroTitulo;
    }

    public void setNumeroTitulo(int numeroTitulo) {
        this.numeroTitulo = numeroTitulo;
    }
}
