package service;

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
        stringBuilder.append("Расчет площади поперечного сечения наплавленного металла шва").append("\n")
                .append("для типов C2, C8, C17, C25, У4, У6, У8, Т1, Т6, Т8.").append("\n")
                .append("Виберите тип шва (C2, C8, C17, C25, У4, У6, У8, Т1, Т6, Т8).").append("\n")
                .append('_').append("\n");
        return String.valueOf(stringBuilder);
    }

}
