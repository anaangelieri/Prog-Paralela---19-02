public class Carro{
    int anoFabricacao;
    int anoModelo;
    String cor;

    

    public Carro(int anoFabricacao, int anoModelo) {
        this.anoFabricacao = anoFabricacao;
        this.anoModelo = anoModelo;
    }
    

    public Carro(int anoFabricacao, int anoModelo, String cor) {
        this.anoFabricacao = anoFabricacao;
        this.anoModelo = anoModelo;
        this.cor = cor;
    }

    public Carro() {
    }

    public int getAnoFabricacao (){
        return this.anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao){
        this.anoFabricacao = anoFabricacao;
    }
    // operação de escrita sempre é void

    public int getAnoModelo(){
        return anoModelo;
    }
    

    public void setAnoModelo(int anoModelo){
        this.anoModelo = anoModelo;
    }

    public String getCor(){
        return cor;
    }


    public void setCor(String cor) {
        this.cor = cor;
    }

}