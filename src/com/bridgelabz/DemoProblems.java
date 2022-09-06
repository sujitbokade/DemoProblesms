package com.bridgelabz;

import java.util.Scanner;

public class DemoProblems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Side(in cm)");
        double firstSide = sc.nextDouble();
        System.out.println("Enter Second Side(in cm)");
        double secondSide = sc.nextDouble();
        double area = firstSide * secondSide;
        double perimeter = 2 * (firstSide + secondSide);

        System.out.println("Area of Rectangle: " + area + " Sq.cm");
        System.out.println("Perimeter of Rectangle: " + perimeter + " cm");
    }

}

