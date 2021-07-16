import java.util.Scanner;

//Escreva um algoritmo para ler o valor do salário mensal atual de um funcionário e o percentual de reajuste. Calcular e escrever o valor do novo salário. Após o cálculo do novo salário, deverá ser apresentado os seguintes valores.

public class Funcionario {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double salarioMensal = 0;
        double percentualReajuste = 0;
        System.out.print("Digite o valor do salário mensal: ");
        salarioMensal = in.nextDouble();
        System.out.print("Digite o valor do percentual de reajuste: ");
        percentualReajuste = in.nextDouble();
        in.close();
        double novoSalario = salarioMensal + (salarioMensal * percentualReajuste / 100);

        System.out.println("Valor do Salário: " + salarioMensal);
        System.out.println("Valor do NOVO Salário: " + novoSalario);
        System.out.println("Diferença entre o salário e o NOVO salário: " + (novoSalario - salarioMensal));

    }

}
