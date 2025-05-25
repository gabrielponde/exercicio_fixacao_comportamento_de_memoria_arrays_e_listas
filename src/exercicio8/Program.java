package exercicio8;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        double[] vet = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            vet[i] = sc.nextDouble();
        }

        double somaPares = 0.0;
        int qtdPares = 0;

        for (int i = 0; i < n; i++) {
            if ((int)vet[i] % 2 == 0) {
                somaPares += vet[i];
                qtdPares++;
            }
        }

        if (qtdPares == 0) {
            System.out.println("NENHUM NUMERO PAR");
        } else {
            double mediaPares = somaPares / qtdPares;
            System.out.printf("MEDIA DOS PARES = %.1f%n", mediaPares);
        }

        sc.close();
    }
}
