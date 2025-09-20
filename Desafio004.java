import java.util.Scanner;

public class Desafio004 {
    public static void main(String[] args) {
        // pedir aqui o valor do salário
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite o valor do salário do colaborador: ");
        float salarioColaborador = leia.nextFloat();

        // tabela de variáveis
        double aumento = 0;
        double aumentoValor = 0;
        double inflacao = 0.038;
        double salarioReal = 0;
        double percentual = 0;

        // tabela de salários:
        if (salarioColaborador <= 280.00) {
            System.out.println("O salário antes do reajuste é R$" + salarioColaborador);
            aumentoValor = salarioColaborador * 0.20;
            System.out.println("O valor do aumento é R$ " + aumentoValor);
            aumento = (float) (salarioColaborador + salarioColaborador * 0.20);
            System.out.println("O valor do salário atual após o aumento é R$ " + aumento);
            salarioReal = aumento - (aumento * inflacao);
            System.out.println("O salário descontado com a inflação é: R$ " + salarioReal);
            percentual = (int) (0.20 * 100);
            System.out.println("O percentual é de: " + percentual + "%");


        } else if (salarioColaborador > 280.00 && salarioColaborador <= 700) {

            System.out.println("O salário antes do reajuste é R$ " + salarioColaborador);
            aumentoValor = salarioColaborador * 0.15;
            System.out.println("O valor do aumento é R$ " + aumentoValor);
            aumento = (float) (salarioColaborador + salarioColaborador * 0.15);
            System.out.println("O valor do salário atual após o aumento é R$ " + aumento);
            salarioReal = aumento - (aumento * inflacao);
            System.out.println("O salário descontado com a inflação é R$ " + salarioReal);
            percentual = 0.15 * 100;
            System.out.println("O percentual é de: " + percentual + "%");

        } else if (salarioColaborador > 700 && salarioColaborador <= 1500) {
            System.out.println("O salário antes do reajuste é R$ " + salarioColaborador);
            aumentoValor = salarioColaborador * 0.10;
            System.out.println("O valor do aumento é R$ " + aumentoValor);
            aumento = (float) (salarioColaborador + salarioColaborador * 0.10);
            System.out.println("O valor do salário atual após o aumento é R$ " + aumento);
            salarioReal = aumento - (aumento * inflacao);
            System.out.println("O salário descontado com a inflação é R$ " + salarioReal);
            percentual = 0.10 * 100;
            System.out.println("O percentual é de: " + percentual + "%");

        } else if (salarioColaborador > 1500) {
            System.out.println("O salário antes do reajuste é R$" + salarioColaborador);
            aumentoValor = salarioColaborador * 0.05;
            System.out.println("O valor do aumento é R$" + aumentoValor);
            aumento = (float) (salarioColaborador + salarioColaborador * 0.05);
            System.out.println("O valor do salário atual após o aumento é R$" + aumento);
            salarioReal = aumento - (aumento * inflacao);
            System.out.println("O salário descontado com a inflação é: R$" + salarioReal);
            percentual = 0.05 * 100;
            System.out.println("O percentual é de: " + percentual + "%");

        } else {
            System.out.println("Salário inválido!");
        }
        leia.close();
    }
}                                                                                                     