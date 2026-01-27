package Exercicios;

import java.util.Scanner;

/* 
Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e 
mostre:  
a) a área do triângulo retângulo que tem A por base e C por altura.  
b) a área do círculo de raio C. (pi = 3.14159)  
c) a área do trapézio que tem A e B por bases e C por altura.  
d) a área do quadrado que tem lado B.  
e) a área do retângulo que tem lado A e Altura B. */

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   
        
        double A, B,C, triangulo, circulo, trapezio, quadrado, retangulo, pi;

        System.out.println("Valor A: ");
        A = sc.nextDouble();
        System.out.println("Valor B: ");
        B = sc.nextDouble();
        System.out.println("Valor C: ");
        C = sc.nextDouble();
        pi = 3.14159;

        triangulo =  A * C / 2;
        circulo = pi * Math.pow(C, 2);
        trapezio = ((A+B)*C)/2;
        quadrado = B*B;
        retangulo = A*B;

        System.out.printf("Area Triângulo: %.3f ", triangulo);
        System.out.printf("\nArea Círculo: %.3f ", circulo);
        System.out.printf("\nArea Trapézio: %.3f ", trapezio);
        System.out.printf("\nArea Quadrado: %.3f ", quadrado);
        System.out.printf("\nArea Retângulo: %.3f ", retangulo);

        sc.close();
    }
}
