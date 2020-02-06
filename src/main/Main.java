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

        StringBuilder sb = new StringBuilder();
        sb.append("Расчет площади поперечного сечения наплавленного металла шва").append("\n")
                .append("для типов C2, C8, C17, C25, У4, У6, У8, Т1, Т6, Т8.").append("\n")
                .append("Виберите тип шва (C2, C8, C17, C25, У4, У6, У8, Т1, Т6, Т8).").append("\n")
                .append('_').append("\n");

        System.out.println(sb);

        String answer = scanner.nextLine();
        switch (answer) {
            case "C2":
                System.out.println("Площадь поперечного сечения наплавленного металла шва и " +
                        "расчетная масса наплавленного металла сварного соединения С 2 по ГОСТ 5264 - 80" + "\n");
                System.out.println(getC2());
                break;
            case "C8":
                System.out.println("Площадь поперечного сечения наплавленного металла шва и " +
                        "расчетная масса наплавленного металла сварного соединения С 8 по ГОСТ 5264 - 80" + "\n");
                System.out.println(getC8());
                break;
            case "C17":
                System.out.println("Площадь поперечного сечения наплавленного металла шва и " +
                        "расчетная масса наплавленного металла сварного соединения С 17 по ГОСТ 5264 - 80" + "\n");
                System.out.println(getC17());
                break;
            case "C25":
                System.out.println("Площадь поперечного сечения наплавленного металла шва и " +
                        "расчетная масса наплавленного металла сварного соединения С 25 по ГОСТ 5264 - 80" + "\n");
                System.out.println(getC25());
                break;
            case "Y4":
                System.out.println("Площадь поперечного сечения наплавленного металла шва и " +
                        "расчетная масса наплавленного металла сварного соединения У 4 по ГОСТ 5264 - 80" + "\n");
                System.out.println(getY4());
                break;
            case "Y6":
                System.out.println("Площадь поперечного сечения наплавленного металла шва и " +
                        "расчетная масса наплавленного металла сварного соединения У 6 по ГОСТ 5264 - 80" + "\n");
                System.out.println(getY6());
                break;
            case "Y8":
                System.out.println("Площадь поперечного сечения наплавленного металла шва и " +
                        "расчетная масса наплавленного металла сварного соединения У 8 по ГОСТ 5264 - 80" + "\n");
                System.out.println(getY8());
                break;
            case "T1":
                System.out.println("Площадь поперечного сечения наплавленного металла шва и " +
                        "расчетная масса наплавленного металла сварного соединения T 1 по ГОСТ 5264 - 80" + "\n");
                System.out.println(getT1());
                break;
            case "T6":
                System.out.println("Площадь поперечного сечения наплавленного металла шва и " +
                        "расчетная масса наплавленного металла сварного соединения T 6 по ГОСТ 5264 - 80" + "\n");
                System.out.println(getT6());
                break;
            case "T8":
                System.out.println("Площадь поперечного сечения наплавленного металла шва и " +
                        "расчетная масса наплавленного металла сварного соединения T 8 по ГОСТ 5264 - 80" + "\n");
                System.out.println(getT8());
                break;
            default:
                System.out.println("Вы ничего не выбрали...");
                break;
        }
        scanner.close();

        /*

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
        */
    }

    @Contract(pure = true)
    private static double getC2() {
        return 2.0;
    }

    @Contract(pure = true)
    private static double getC8() {
        return 8.0;
    }

    @Contract(pure = true)
    private static double getC17() {
        double x = s * b;
        double y = Math.pow((s - c), 2) * Math.tan((alpha * Math.PI) / 180);
        double z = 0.75 * e * g;
        return Math.round(x + y + z);
    }

    @Contract(pure = true)
    private static double getC25() {
        return 25.0;
    }

    @Contract(pure = true)
    private static double getY4() {
        return 4.0;
    }

    @Contract(pure = true)
    private static double getY6() {
        return 6.0;
    }

    @Contract(pure = true)
    private static double getY8() {
        return 8.0;
    }

    @Contract(pure = true)
    private static double getT1() {
        return 1.0;
    }

    @Contract(pure = true)
    private static double getT6() {
        return 6.0;
    }

    @Contract(pure = true)
    private static double getT8() {
        return 8.0;
    }
}
