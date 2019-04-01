package fapam.com.br;

public class Jogador {

    private String numCamisa;
    private String posicao;
    private String nome;
    private int numGols;

    boolean artileiro(int numGols){
        if(numGols > 5)
            return true;
        return false;
    }

    String exibirJogador(){
        return "Jogador: "+getNome() + "\nCamisa: "+ getNumCamisa() + "\nPosição: "+ getPosicao()+ "\nNumero de gols: "+getNumGols();

    }

    public String getNumCamisa() {
        return numCamisa;
    }

    public void setNumCamisa(String numCamisa) {
        this.numCamisa = numCamisa;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumGols() {
        return numGols;
    }

    public void setNumGols(int numGols) {
        this.numGols = numGols;
    }
}
