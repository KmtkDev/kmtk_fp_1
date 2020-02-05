package main;

import org.jetbrains.annotations.Contract;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static int s;
    private static double b;
    private static double c;
    private static int alpha;
    private static int e;
    private static double g;

    public static void main(String[] args) {
        System.out.println("Площадь поперечного сечения наплавленного металла шва и " +
                "расчетная масса наплавленного металла сварного соединения С 17 по ГОСТ 5264 - 80" + "\n");
        System.out.println('S');
        s = Integer.parseInt(scanner.nextLine());
        System.out.println('B');
        b = Double.parseDouble(scanner.nextLine());
        System.out.println('С');
        c = Double.parseDouble(scanner.nextLine());
        System.out.println("ALPHA");
        alpha = Integer.parseInt(scanner.nextLine());
        System.out.println('E');
        e = Integer.parseInt(scanner.nextLine());
        System.out.println('G');
        g = Double.parseDouble(scanner.nextLine());
        scanner.close();

        System.out.println("F = " + getSquare());
    }

    @Contract(pure = true)
    private static double getSquare() {
        double x = s * b;
        double y = Math.pow((s - c), 2) * Math.tan(alpha);
        double z = 0.75 * e * g;
        return Math.round(x + y + z);
    }
}
