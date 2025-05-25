package exercicio2;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros você vai digitar? ");

        int n = sc.nextInt();
        int[] vet = new int[n];

        for (int i=0; i<n; i++) {
            System.out.print("Digite um numero: ");
            vet[i] = sc.nextInt();
        }

        System.out.print("VALORES = ");
        for (int i = 0; i < n; i++) {
            System.out.print(vet[i] + " ");
        }

        System.out.println();

        int soma = 0;
        for (int i = 0; i < n; i++) {
            soma += vet[i];
        }
        System.out.println("SOMA = " + soma);

        double media = (double) soma / n;
        System.out.printf("MEDIA = %.2f\n", media);

        sc.close();
    }
}
