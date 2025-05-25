package exercicio4;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros você vai digitar? ");

        int n = sc.nextInt();
        int[] vet = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            vet[i] = sc.nextInt();
        }

        System.out.println("NUMEROS PARES: ");
        int contPares = 0;
        for (int i = 0; i < n; i++) {
            if (vet[i] % 2 == 0) {
                System.out.print(vet[i] + " ");
                contPares++;
            }
        }
        System.out.println();

        System.out.println("QUANTIDADE DE NUMEROS PARES = " + contPares);

        sc.close();
    }
}
