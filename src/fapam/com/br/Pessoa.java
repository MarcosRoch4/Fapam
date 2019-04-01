package fapam.com.br;

public class Pessoa {

    String nome;
    String endereco;
    String telefone;

    public String imprimir(){
        return this.nome + "\n" + this.endereco + "\n" + this.telefone;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
