package fapam.com.br;
import java.math.*;

public class Produto extends Lucro {

    private String nome;
    private double precoCusto;
    private double precoVenda;
    private double margemLucro;

    public double calcularMargemLucro(){
        this.margemLucro = this.precoVenda - this.precoCusto;
        return this.margemLucro;
    }


    public String getMargemLucroPorcentagem(){
        double percentagem;
        percentagem = Math.round(- (this.precoCusto / this.precoVenda)*100);
        percentagem += 100;
        return percentagem + ( "% do preço do produto.");
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        if(precoVenda < precoCusto)
            System.out.println("Valor da venda inferior ao preço do produto.");
        else
            this.precoVenda = precoVenda;
    }

    public double getMargemLucro() {
        return margemLucro;
    }


    public void setMargemLucro(double margemLucro) {
        this.margemLucro = margemLucro;
    }
}
