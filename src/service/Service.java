package service;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class Service {
    private Scanner scanner = new Scanner(System.in);
    private StringBuilder stringBuilder = new StringBuilder();
    private double S;
    private double B;
    private int E;
    private double G;
    private int C;
    private int ALPHA;
    private double S_1;
    private double N;
    private int E_1;
    private double H;

    public String intro() {
        StringBuilder sb = new StringBuilder()
                .append("|  Расчет площади поперечного сечения наплавленного металла шва    |").append("\n")
                .append("|  для типов C2, C8, C17, C25, У4, У6, У8, Т1, Т6, Т8.             |").append("\n")
                .append("|  Виберите тип шва (C2, C8, C17, C25, У4, У6, У8, Т1, Т6, Т8).    |").append("\n");
        return String.valueOf(sb);
    }

    public void choiser() {
        String answer = scanner.nextLine();
        switch (answer) {
            case "C2":
                System.out.println(text(answer, getC2()));
                break;
            case "C8":
                System.out.println(text(answer, getC8()));
                break;
            case "C17":
                System.out.println(text(answer, getC17()));
                break;
            case "C25":
                System.out.println(text(answer, getC25()));
                break;
            case "Y4":
                System.out.println(text(answer, getY4()));
                break;
            case "Y6":
                System.out.println(text(answer, getY6()));
                break;
            case "Y8":
                System.out.println(text(answer, getY8()));
                break;
            case "T1":
                System.out.println(text(answer, getT1()));
                break;
            case "T6":
                System.out.println(text(answer, getT6()));
                break;
            case "T8":
                System.out.println(text(answer, getT8()));
                break;
            default:
                System.out.println("Вы ничего не выбрали...");
                break;
        }
        scanner.close();
    }

    @NotNull
    @Contract("_, _ -> !null")
    private Object text(String s, Object o) {
        return stringBuilder
                .append("Площадь поперечного сечения наплавленного металла шва и").append("\n")
                .append("расчетная масса наплавленного металла сварного соединения").append("\n")
                .append(s).append(" по ГОСТ 5264 - 80.").append("\n")
                .append("F = ").append(o).append(" mm2.");
    }

    @Contract(pure = true)
    private double getC2() {
        System.out.println('S');
        S = Double.parseDouble(scanner.nextLine());
        System.out.println('B');
        B = Double.parseDouble(scanner.nextLine());
        System.out.println('E');
        E = Integer.parseInt(scanner.nextLine());
        System.out.println('G');
        G = Double.parseDouble(scanner.nextLine());
        scanner.close();
        return Math.round(bs(B, S) + eg(E, G));
    }

    @Contract(pure = true)
    private double getC8() {
        System.out.println('S');
        S = Integer.parseInt(scanner.nextLine());
        System.out.println('B');
        B = Double.parseDouble(scanner.nextLine());
        System.out.println('С');
        C = Integer.parseInt(scanner.nextLine());
        System.out.println("ALPHA");
        ALPHA = Integer.parseInt(scanner.nextLine());
        System.out.println('E');
        E = Integer.parseInt(scanner.nextLine());
        System.out.println('G');
        G = Double.parseDouble(scanner.nextLine());
        scanner.close();
        double a = (Math.pow((S - C), 2) * tan(ALPHA)) / 2;
        return Math.round(bs(B, S) + a + eg(E, G));
    }

    @Contract(pure = true)
    private double getC17() {
        System.out.println('S');
        S = Integer.parseInt(scanner.nextLine());
        System.out.println('B');
        B = Double.parseDouble(scanner.nextLine());
        System.out.println('С');
        C = Integer.parseInt(scanner.nextLine());
        System.out.println("ALPHA");
        ALPHA = Integer.parseInt(scanner.nextLine());
        System.out.println('E');
        E = Integer.parseInt(scanner.nextLine());
        System.out.println('G');
        G = Double.parseDouble(scanner.nextLine());
        scanner.close();
        double a = Math.pow((S - C), 2) * tan(ALPHA);
        return Math.round(bs(B, S) + a + eg(E, G));
    }

    @Contract(pure = true)
    private double getC25() {
        System.out.println('S');
        S = Integer.parseInt(scanner.nextLine());
        System.out.println('С');
        C = Integer.parseInt(scanner.nextLine());
        System.out.println("ALPHA");
        ALPHA = Integer.parseInt(scanner.nextLine());
        System.out.println('E');
        E = Integer.parseInt(scanner.nextLine());
        System.out.println('G');
        G = Double.parseDouble(scanner.nextLine());
        scanner.close();
        double y = Math.pow((S - C), 2) * tan(ALPHA);
        double z = 1.5 * E * G;
        return Math.round(y + z);
    }

    @Contract(pure = true)
    private double getY4() {
        System.out.println("S_1");
        S_1 = Integer.parseInt(scanner.nextLine());
        System.out.println('B');
        B = Double.parseDouble(scanner.nextLine());
        System.out.println('N');
        N = Double.parseDouble(scanner.nextLine());
        System.out.println('S');
        S = Integer.parseInt(scanner.nextLine());
        System.out.println('E');
        E = Integer.parseInt(scanner.nextLine());
        System.out.println('G');
        G = Double.parseDouble(scanner.nextLine());
        scanner.close();
        double x = 0.5 * (S_1 + B) * N;
        double y = B * (S - N);
        return Math.round(x + y + eg(E, G));
    }

    @Contract(pure = true)
    private double getY6() {
        System.out.println('S');
        S = Integer.parseInt(scanner.nextLine());
        System.out.println('B');
        B = Double.parseDouble(scanner.nextLine());
        System.out.println('С');
        C = Integer.parseInt(scanner.nextLine());
        System.out.println("ALPHA");
        ALPHA = Integer.parseInt(scanner.nextLine());
        System.out.println('E');
        E = Integer.parseInt(scanner.nextLine());
        System.out.println('G');
        G = Double.parseDouble(scanner.nextLine());
        scanner.close();
        double y = 0.5 * Math.pow((S - C), 2) * tan(ALPHA);
        return Math.round(bs(S, B) + y + eg(E, G));
    }

    @Contract(pure = true)
    private double getY8() {
        System.out.println('S');
        S = Integer.parseInt(scanner.nextLine());
        System.out.println('B');
        B = Double.parseDouble(scanner.nextLine());
        System.out.println('С');
        C = Integer.parseInt(scanner.nextLine());
        System.out.println("ALPHA");
        ALPHA = Integer.parseInt(scanner.nextLine());
        System.out.println('E');
        E = Integer.parseInt(scanner.nextLine());
        System.out.println('G');
        G = Double.parseDouble(scanner.nextLine());
        System.out.println("E_1");
        E_1 = Integer.parseInt(scanner.nextLine());
        scanner.close();
        double y = 0.25 * Math.pow((S - C), 2) * tan(ALPHA);
        double z = 0.75 * (E * G + 0.3 * S * E_1);
        return Math.round(bs(S, B) + y + z);
    }

    @Contract(pure = true)
    private double getT1() {
        System.out.println('K');
        S = Double.parseDouble(scanner.nextLine());
        scanner.close();
        return 0.5 * S + 1.05 * S;
    }

    @Contract(pure = true)
    private double getT6() {
        System.out.println('S');
        S = Integer.parseInt(scanner.nextLine());
        System.out.println('B');
        B = Double.parseDouble(scanner.nextLine());
        System.out.println('С');
        C = Integer.parseInt(scanner.nextLine());
        System.out.println("ALPHA");
        ALPHA = Integer.parseInt(scanner.nextLine());
        System.out.println('E');
        E = Integer.parseInt(scanner.nextLine());
        scanner.close();
        double y = 0.5 * Math.pow((S - C), 2) * tan(ALPHA);
        double z = 0.75 * E * 0.3 * S;
        return Math.round(bs(S, B) + y + z);
    }

    @Contract(pure = true)
    private double getT8() {
        System.out.println('S');
        S = Integer.parseInt(scanner.nextLine());
        System.out.println('B');
        B = Double.parseDouble(scanner.nextLine());
        System.out.println('H');
        H = Integer.parseInt(scanner.nextLine());
        System.out.println('С');
        C = Integer.parseInt(scanner.nextLine());
        System.out.println("ALPHA");
        ALPHA = Integer.parseInt(scanner.nextLine());
        System.out.println('E');
        E = Integer.parseInt(scanner.nextLine());
        scanner.close();
        double w = 0.5 * Math.pow(H, 2) * tan(ALPHA);
        double y = 0.5 * Math.pow((S - H - C), 2) * tan(ALPHA);
        double z = 1.5 * E * (0.3 * S);
        return (bs(S, B) + w + y + z);
    }

    @Contract(pure = true)
    private double bs(double s, double b) {
        return s * b;
    }

    @Contract(pure = true)
    private double eg(int e, double g) {
        return 0.75 * e * g;
    }

    @Contract(pure = true)
    private double tan(int alpha) {
        return Math.tan((alpha * Math.PI) / 180);
    }
}
