package exercicio1oo;

public class TesteCarro {
    public static void main(String[] args){
        Carro carro = new Carro();
        carro.modelo = "RS6";
        carro.marca = "Audi";
        carro.ano = 2025;
        carro.velocidade = 388.0;

        System.out.println("Modelo do Carro: " + carro.modelo);
        System.out.println("Marca do Carro: " + carro.marca);
        System.out.println("Ano do Carro: " + carro.ano);
        System.out.println("Velocidade Maxima do Carro: " + carro.velocidade);

    }
}
