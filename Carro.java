import java.util.Scanner;

public class Carro {
    public static void main(String[] args) {
        double custoFabrica = 0;
        double percentualDistribuidor = 23.5;
        double percentualImpostos = 43.15;

        Scanner in = new Scanner(System.in);
        System.out.print("Digite o valor do carro (custo de fábrica): ");
        custoFabrica = in.nextDouble();
        in.close();

        double valorComImpostos = custoFabrica + ((custoFabrica * percentualDistribuidor) / 100);
        valorComImpostos = valorComImpostos + ((valorComImpostos * percentualImpostos) / 100);
        System.out.println("Custo final ao consumidor: " + valorComImpostos);
    }
}
