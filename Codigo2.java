class Main{

    public static void main (String[] args){
        Carro carro1 = new Carro();
        carro1.setAnoFabricacao(90);
        carro1.setAnoModelo(91);

        System.out.println("Ano Fabricação = " + carro1.getAnoFabricacao());
    }
}