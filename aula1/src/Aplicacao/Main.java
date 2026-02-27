package Aplicacao;

import Entidade.Quadrado;

import java.util.Locale;
import java.util.Scanner;
import Entidade.Quadrado;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        double a =0;
        double b = 0;
        System.out.println("--------------------------");
        System.out.println();
        System.out.println("Entre com o tamanho do lado A do quadrado:  ");
        a= sc.nextDouble();

        System.out.println("--------------------------");
        System.out.println();
        System.out.println("Entre com o tamanho do lado B do quadrado:  ");
        b= sc.nextDouble();

        System.out.println("--------------------------");
        double area= 0;
        double perimetro=0;
        Quadrado q1= new Quadrado();
        q1.a = a;
        q1.b=b;
        area= q1.calcularArea();
        perimetro=q1.calculaPerimetro();

        System.out.println();
        System.out.println("--------------------------");
        System.out.println();
        System.out.println("Valor da area do quadrado é : " + area);
        System.out.println("o perimetro do quadrado é: " + perimetro);

        sc.close();

    }



}