import java.util.Scanner;

public class SalarioComissao {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double salarioFixo = 0;
        double valorComissao = 0;
        double valorVenda = 0;
        boolean continua = true;

        System.out.print("Digite o valor do salário: ");
        salarioFixo = in.nextDouble();

        while(continua) {
            System.out.print("Digite o valor da venda (0 para parar): ");
            valorVenda = in.nextDouble();
            if(valorVenda == 0) {
                continua = false;
            }

            if(valorVenda <= 1500) {
                valorComissao += valorVenda * 0.03;
            } else {
                valorComissao += 1500 * 0.03 + ((valorVenda - 1500) * 0.05);
            }
            System.out.println("Salario atual: " + (salarioFixo + valorComissao));
        }
        in.close();
        System.out.println("Salario total: " + (salarioFixo + valorComissao));
    }
}
