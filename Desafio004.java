import java.util.Scanner;

public class Desafio004 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        // Entrada
        System.out.print("Digite o valor do salário do colaborador: ");
        double salarioColaborador = leia.nextDouble();

        // Processamento
        double percentual = mostrarPercentual(salarioColaborador);
        double aumento = salarioColaborador * percentual;
        double novoSalario = calcularNovoSalario(salarioColaborador, percentual);
        double salarioReal = calcularInflacao(novoSalario);

        // Saída
        System.out.println("\n--- Resultado ---");
        System.out.printf("1. Salário antes do reajuste: R$ %.2f\n", salarioColaborador);
        System.out.printf("2. Percentual de aumento aplicado: %.0f%%\n", percentual * 100);
        System.out.printf("3. Valor do aumento: R$ %.2f\n", aumento);
        System.out.printf("4. Novo salário após o aumento: R$ %.2f\n", novoSalario);
        System.out.printf("5. Salário real (descontando inflação): R$ %.2f\n", salarioReal);

        leia.close();
    }

    public static double calcularNovoSalario(double salarioColaborador, double percentual) {
        return salarioColaborador + (salarioColaborador * percentual);
    }

    public static double calcularInflacao(double salarioReajustado) {
        final double INFLACAO = 0.038; // 3,8%
        return salarioReajustado - (salarioReajustado * INFLACAO);
    }

    public static double mostrarPercentual(double salario) {
        if (salario <= 280.00) {
            return 0.20;
        } else if (salario <= 700.00) {
            return 0.15;
        } else if (salario <= 1500.00) {
            return 0.10;
        } else {
            return 0.05;
        }
    }
}