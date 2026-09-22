package exercicio1oo;

public class TesteContaBancaria {
    public static void main(String[] args){
        ContaBancaria contabancaria = new ContaBancaria();
        contabancaria.numeroconta = "55.525.5";
        contabancaria.titular = "Paulo Sergio Cordeiro Junior";
        contabancaria.saldo = 56.705;

        System.out.println("Numero da Conta: " + contabancaria.numeroconta);
        System.out.println("Titular da conta: " + contabancaria.titular);
        System.out.println("Saldo da conta: " + contabancaria.saldo);

    }
}
