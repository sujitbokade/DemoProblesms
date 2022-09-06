package com.bridgelabz;

import java.util.Scanner;

public class DemoProblems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("***Area of Rectangle***");

        System.out.println("Enter First Side(in cm)");
        double firstSide = sc.nextDouble();
        System.out.println("Enter Second Side(in cm)");
        double secondSide = sc.nextDouble();
        double area = firstSide * secondSide;

        System.out.println("Area of Rectangle: " + area + " Sq.cm");

        System.out.println("***Perimeter of Rectangle***");
        System.out.println("Enter First Side(in cm)");
        double fSide = sc.nextDouble();
        System.out.println("Enter Second Side(in cm)");
        double sSide = sc.nextDouble();
        double perimeter = 2*(fSide + sSide);

        System.out.println("Perimeter of Rectangle: " + perimeter + " cm");


    }

 }

