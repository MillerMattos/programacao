package com.unama;

import java.util.Scanner;

public class Nome {

    public static void main(String args[])
    {
    double raio;
    double perimetro;
    double area;

       Scanner sc = new Scanner(System.in);
       System.out.print("Informe o raio: ");
       raio = sc.nextDouble();
       perimetro = (2 * 3.14 * raio);
       System.out.println("O Perímetro do Circulo é de: " + perimetro);
       area = (3.14 * Math.pow (raio , 2));
       System.out.print("A Area do Circulo é de: " + area);

    }

}
