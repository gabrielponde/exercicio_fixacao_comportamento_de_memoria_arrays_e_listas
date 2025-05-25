package exercicio9;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();

        String[] nomes = new String[n];
        int[] idades = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Dados da " + (i + 1) + "a pessoa:");
            System.out.print("Nome: ");
            nomes[i] = sc.next();
            System.out.print("Idade: ");
            idades[i] = sc.nextInt();
        }

        int maisVelho = 0;
        for (int i = 1; i < n; i++) {
            if (idades[i] > idades[maisVelho]) {
                maisVelho = i;
            }
        }

        System.out.printf("PESSOA MAIS VELHA: %s%n", nomes[maisVelho]);

        sc.close();
    }
}
