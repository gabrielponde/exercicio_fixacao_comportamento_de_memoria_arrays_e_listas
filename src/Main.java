import java.util.Locale;
import java.util.Scanner;

//public class Main {
//    public static void main(String[] args) {
//
//        Locale.setDefault(Locale.US);
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//        double[] vect = new double[n];
//        for (int i=0; i<n; i++) {
//            vect[i] = sc.nextDouble();
//        }
//
//        double sum = 0.0;
//        for (int i=0; i<n; i++) {
//            sum += vect[i];
//        }
//
//        double avg = sum / n;
//        System.out.printf("AVERAGE HEIGHT: %.2f%n", avg);
//
//        sc.close();
//    }
//}

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add(2, "Marco");
        System.out.println(list.size());
        for (String x : list) {
            System.out.println(x);
        }
        System.out.println("---------------------");
                list.removeIf(x -> x.charAt(0) == 'M');
        for (String x : list) {
            System.out.println(x);
        }
        System.out.println("---------------------");
                System.out.println("Index of Bob: " + list.indexOf("Bob"));
        System.out.println("Index of Marco: " + list.indexOf("Marco"));
        System.out.println("---------------------");
                List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        for (String x : result) {
            System.out.println(x);
        }
        System.out.println("---------------------");
                String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
        System.out.println(name);
    }
}