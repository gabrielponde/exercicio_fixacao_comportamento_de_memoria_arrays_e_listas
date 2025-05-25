package exercicio6;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores vai ter em cada vetor? ");

        int n = sc.nextInt();
        double[] vetA = new double[n];
        double[] vetB = new double[n];
        double[] vetC = new double[n];

        System.out.println("Digite o valor do vetor A: ");
        for (int i = 0; i < n; i++) {
            vetA[i] = sc.nextDouble();
        }

        System.out.println("Digite o valor do vetor B: ");
        for (int i = 0; i < n; i++) {
            vetB[i] = sc.nextDouble();
        }

        for (int i = 0; i < n; i++) {
            vetC[i] = vetA[i] + vetB[i];
        }

        System.out.println("VETOR RESULTANTE: ");
        for (int i = 0; i < n; i++) {
            System.out.printf("%.1f\n", vetC[i]);
        }

        sc.close();
    }
}
