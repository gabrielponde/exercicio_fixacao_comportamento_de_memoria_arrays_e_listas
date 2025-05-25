package exercicio11;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();

        double[] alturas = new double[n];
        char[] generos = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Altura da " + (i + 1) + "a pessoa: ");
            alturas[i] = sc.nextDouble();
            System.out.print("Genero da " + (i + 1) + "a pessoa (M/F): ");
            generos[i] = sc.next().toUpperCase().charAt(0);
        }

        double menorAltura = alturas[0];
        double maiorAltura = alturas[0];
        double somaAlturasMulheres = 0.0;
        int qtdMulheres = 0;
        int qtdHomens = 0;

        for (int i = 0; i < n; i++) {
            if (alturas[i] < menorAltura) {
                menorAltura = alturas[i];
            }
            if (alturas[i] > maiorAltura) {
                maiorAltura = alturas[i];
            }

            if (generos[i] == 'F') {
                somaAlturasMulheres += alturas[i];
                qtdMulheres++;
            } else if (generos[i] == 'M') {
                qtdHomens++;
            }
        }

        System.out.printf("Menor altura = %.2f%n", menorAltura);
        System.out.printf("Maior altura = %.2f%n", maiorAltura);

        if (qtdMulheres > 0) {
            double mediaMulheres = somaAlturasMulheres / qtdMulheres;
            System.out.printf("Media das alturas das mulheres = %.2f%n", mediaMulheres);
        } else {
            System.out.println("Nao ha mulheres cadastradas.");
        }

        System.out.printf("Numero de homens = %d%n", qtdHomens);

        sc.close();
    }
}
