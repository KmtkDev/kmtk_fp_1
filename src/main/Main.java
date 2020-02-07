package main;

import org.jetbrains.annotations.Contract;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

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
                System.out.println("F = " + getC2());
                break;
            case "C8":
                System.out.println("Площадь поперечного сечения наплавленного металла шва и " +
                        "расчетная масса наплавленного металла сварного соединения С 8 по ГОСТ 5264 - 80" + "\n");
                System.out.println("F = " + getC8());
                break;
            case "C17": //+
                System.out.println("Площадь поперечного сечения наплавленного металла шва и " +
                        "расчетная масса наплавленного металла сварного соединения С 17 по ГОСТ 5264 - 80" + "\n");
                System.out.println("F = " + getC17());
                break;
            case "C25":
                System.out.println("Площадь поперечного сечения наплавленного металла шва и " +
                        "расчетная масса наплавленного металла сварного соединения С 25 по ГОСТ 5264 - 80" + "\n");
                System.out.println("F = " + getC25());
                break;
            case "Y4":
                System.out.println("Площадь поперечного сечения наплавленного металла шва и " +
                        "расчетная масса наплавленного металла сварного соединения У 4 по ГОСТ 5264 - 80" + "\n");
                System.out.println("F = " + getY4());
                break;
            case "Y6":
                System.out.println("Площадь поперечного сечения наплавленного металла шва и " +
                        "расчетная масса наплавленного металла сварного соединения У 6 по ГОСТ 5264 - 80" + "\n");
                System.out.println("F = " + getY6());
                break;
            case "Y8":
                System.out.println("Площадь поперечного сечения наплавленного металла шва и " +
                        "расчетная масса наплавленного металла сварного соединения У 8 по ГОСТ 5264 - 80" + "\n");
                System.out.println("F = " + getY8());
                break;
            case "T1":
                System.out.println("Площадь поперечного сечения наплавленного металла шва и " +
                        "расчетная масса наплавленного металла сварного соединения T 1 по ГОСТ 5264 - 80" + "\n");
                System.out.println("F = " + getT1());
                break;
            case "T6":
                System.out.println("Площадь поперечного сечения наплавленного металла шва и " +
                        "расчетная масса наплавленного металла сварного соединения T 6 по ГОСТ 5264 - 80" + "\n");
                System.out.println("F = " + getT6());
                break;
            case "T8":
                System.out.println("Площадь поперечного сечения наплавленного металла шва и " +
                        "расчетная масса наплавленного металла сварного соединения T 8 по ГОСТ 5264 - 80" + "\n");
                System.out.println("F = " + getT8());
                break;
            default:
                System.out.println("Вы ничего не выбрали...");
                break;
        }
        scanner.close();
    }

    @Contract(pure = true)
    private static double getC2() {
        System.out.println('B');
        double b = Double.parseDouble(scanner.nextLine());
        System.out.println('S');
        double s = Integer.parseInt(scanner.nextLine());
        System.out.println('E');
        double e = Integer.parseInt(scanner.nextLine());
        System.out.println('G');
        double g = Double.parseDouble(scanner.nextLine());
        scanner.close();
        double x = b * s;
        double z = 0.75 * e * g;
        return Math.round(x + z);
    }

    @Contract(pure = true)
    private static double getC8() {
        System.out.println('S');
        int s = Integer.parseInt(scanner.nextLine());
        System.out.println('B');
        double b = Double.parseDouble(scanner.nextLine());
        System.out.println('С');
        double c = Double.parseDouble(scanner.nextLine());
        System.out.println("ALPHA");
        int alpha = Integer.parseInt(scanner.nextLine());
        System.out.println('E');
        int e = Integer.parseInt(scanner.nextLine());
        System.out.println('G');
        double g = Double.parseDouble(scanner.nextLine());
        scanner.close();
        double x = s * b;
        double y = (Math.pow((s - c), 2) * Math.tan((alpha * Math.PI) / 180)) / 2;
        double z = 0.75 * e * g;
        return Math.round(x + y + z);
    }

    @Contract(pure = true)
    private static double getC17() {
        System.out.println('S');
        int s = Integer.parseInt(scanner.nextLine());
        System.out.println('B');
        double b = Double.parseDouble(scanner.nextLine());
        System.out.println('С');
        double c = Double.parseDouble(scanner.nextLine());
        System.out.println("ALPHA");
        int alpha = Integer.parseInt(scanner.nextLine());
        System.out.println('E');
        int e = Integer.parseInt(scanner.nextLine());
        System.out.println('G');
        double g = Double.parseDouble(scanner.nextLine());
        scanner.close();
        double x = s * b;
        double y = Math.pow((s - c), 2) * Math.tan((alpha * Math.PI) / 180);
        double z = 0.75 * e * g;
        return Math.round(x + y + z);
    }

    @Contract(pure = true)
    private static double getC25() {
        System.out.println('S');
        int s = Integer.parseInt(scanner.nextLine());
        System.out.println('С');
        double c = Double.parseDouble(scanner.nextLine());
        System.out.println("ALPHA");
        int alpha = Integer.parseInt(scanner.nextLine());
        System.out.println('E');
        int e = Integer.parseInt(scanner.nextLine());
        System.out.println('G');
        double g = Double.parseDouble(scanner.nextLine());
        scanner.close();
        double y = Math.pow((s - c), 2) * Math.tan((alpha * Math.PI) / 180);
        double z = 1.5 * e * g;
        return Math.round(y + z);
    }

    @Contract(pure = true)
    private static double getY4() {
        System.out.println("S_1");
        int S_1 = Integer.parseInt(scanner.nextLine());
        System.out.println('B');
        double b = Double.parseDouble(scanner.nextLine());
        System.out.println('N');
        double n = Double.parseDouble(scanner.nextLine());
        System.out.println('S');
        int S = Integer.parseInt(scanner.nextLine());
        System.out.println('E');
        int e = Integer.parseInt(scanner.nextLine());
        System.out.println('G');
        double g = Double.parseDouble(scanner.nextLine());
        scanner.close();
        double x = 0.5 * (S_1 + b) * n;
        double y = b * (S - n);
        double z = 0.75 * e * g;
        return Math.round(x + y + z);
    }

    @Contract(pure = true)
    private static double getY6() {
        System.out.println('S');
        int s = Integer.parseInt(scanner.nextLine());
        System.out.println('B');
        double b = Double.parseDouble(scanner.nextLine());
        System.out.println('С');
        double c = Double.parseDouble(scanner.nextLine());
        System.out.println("ALPHA");
        int alpha = Integer.parseInt(scanner.nextLine());
        System.out.println('E');
        int e = Integer.parseInt(scanner.nextLine());
        System.out.println('G');
        double g = Double.parseDouble(scanner.nextLine());
        scanner.close();
        double x = s * b;
        double y = 0.5 * Math.pow((s - c), 2) * Math.tan((alpha * Math.PI) / 180);
        double z = 0.75 * e * g;
        return Math.round(x + y + z);
    }

    @Contract(pure = true)
    private static double getY8() {
        System.out.println('S');
        int s = Integer.parseInt(scanner.nextLine());
        System.out.println('B');
        double b = Double.parseDouble(scanner.nextLine());
        System.out.println('С');
        double c = Double.parseDouble(scanner.nextLine());
        System.out.println("ALPHA");
        int alpha = Integer.parseInt(scanner.nextLine());
        System.out.println('E');
        int e = Integer.parseInt(scanner.nextLine());
        System.out.println('G');
        double g = Double.parseDouble(scanner.nextLine());
        System.out.println("E_1");
        int e_1 = Integer.parseInt(scanner.nextLine());
        scanner.close();
        double x = s * b;
        double y = 0.25 * Math.pow((s - c), 2) * Math.tan((alpha * Math.PI) / 180);
        double z = 0.75 * (e * g + 0.3 * s * e_1);
        return Math.round(x + y + z);
    }

    @Contract(pure = true)
    private static double getT1() {
        System.out.println('K');
        double K = Double.parseDouble(scanner.nextLine());
        scanner.close();
        return 0.5 * K + 1.05 * K;
    }

    @Contract(pure = true)
    private static double getT6() {
        System.out.println('S');
        int s = Integer.parseInt(scanner.nextLine());
        System.out.println('B');
        double b = Double.parseDouble(scanner.nextLine());
        System.out.println('С');
        double c = Double.parseDouble(scanner.nextLine());
        System.out.println("ALPHA");
        int alpha = Integer.parseInt(scanner.nextLine());
        System.out.println('E');
        int e = Integer.parseInt(scanner.nextLine());
        scanner.close();
        double x = s * b;
        double y = 0.5 * Math.pow((s - c), 2) * Math.tan((alpha * Math.PI) / 180);
        double z = 0.75 * e * 0.3 * s;
        return Math.round(x + y + z);
    }

    @Contract(pure = true)
    private static double getT8() {
        System.out.println('S');
        int s = Integer.parseInt(scanner.nextLine());
        System.out.println('B');
        double b = Double.parseDouble(scanner.nextLine());
        System.out.println('H');
        int h = Integer.parseInt(scanner.nextLine());
        System.out.println('С');
        double c = Double.parseDouble(scanner.nextLine());
        System.out.println("ALPHA");
        int alpha = Integer.parseInt(scanner.nextLine());
        System.out.println('E');
        int e = Integer.parseInt(scanner.nextLine());
        scanner.close();
        double x = s * b;
        double w = 0.5 * Math.pow(h, 2) * Math.tan((alpha * Math.PI) / 180);
        double y = 0.5 * Math.pow((s - h - c), 2) * Math.tan((alpha * Math.PI) / 180);
        double z = 1.5 * e * (0.3 * s);
        return (x + w + y + z);
    }
}
