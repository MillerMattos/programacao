package com.unama;

        import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double numero;
        double resultado;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o numero: ");
        numero = scanner.nextDouble();
        resultado = numero * 2;
        System.out.println("O dobro do numero é " + resultado);
    }
}
