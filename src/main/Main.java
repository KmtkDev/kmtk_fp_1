package main;

import service.Service;

public class Main {

    private static Service service = new Service();

    public static void main(String[] args) {
        System.out.println(service.intro());
        service.choiser();
    }

}
