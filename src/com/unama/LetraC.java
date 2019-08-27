package com.unama;

import java.util.Scanner;

public class LetraC {
    public static void main(String arg[])
    {
    double base;
    double altura;
    double area;

    Scanner sc = new Scanner(System.in);
    System.out.print("Informe a Base: ");
    base = sc.nextDouble();
    System.out.print("Informe a Altura: ");
    altura = sc.nextDouble();
    area = (base * altura / 2);
    System.out.print("A area do triangulo é: " + area);

    }
}
