package fapam.com.br;

public class Veiculo {

    String cor;
    String marca;
    String modelo;
    int numPassageiros;
    double qtdLitrosSuficiente;
    double qtdLitrosAtual = 0;



    public String mostrarVeiculo(){
        return "Carro do modelo " + this.modelo +
                "\nmarca "+ this.marca +
                "\ncor "+ this.cor +
                "\nsuporta "+ this.numPassageiros +
                " Passageiros \no tanque de " + this.qtdLitrosSuficiente +
                " Litros \ne com " + this.getQtdLitrosAtual() + " litros de combustível atualmente";

    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumPassageiros() {
        return numPassageiros;
    }

    public void setNumPassageiros(int numPassageiros) {
        this.numPassageiros = numPassageiros;
    }

    public double getQtdLitrosSuficiente() {
        return qtdLitrosSuficiente;
    }

    public void setQtdLitrosSuficiente(float qtdLitrosSuficiente) {
        this.qtdLitrosSuficiente = qtdLitrosSuficiente;
    }


    public double getQtdLitrosAtual() {
        return qtdLitrosAtual;
    }

    public void setQtdLitrosAtual(double qtdLitrosAtual) {
        if(qtdLitrosSuficiente < qtdLitrosAtual)
            this.qtdLitrosAtual = qtdLitrosSuficiente;
        else
            this.qtdLitrosAtual = qtdLitrosAtual;
    }
}
