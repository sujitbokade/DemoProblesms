package com.bridgelabz;

import java.util.Scanner;

public class DemoProblems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("***Area of Triangle***");

        System.out.println("Enter Base of Triangle(in cm)");
        double base = sc.nextDouble();
        System.out.println("Enter Perpendicular Height of Triangle(in cm)");
        double height = sc.nextDouble();
        double area = (base * height) / 2;

        System.out.println("Area of Triangle: " + area + " Sq.cm");

        System.out.println("***Perimeter of Triangle***");
        System.out.println("Enter First Side(in cm)");
        double fSide = sc.nextDouble();
        System.out.println("Enter Second Side(in cm)");
        double sSide = sc.nextDouble();
        System.out.println("Enter Third Side(in cm)");
        double tSide = sc.nextDouble();
        double perimeter = (fSide + sSide + tSide);

        System.out.println("Perimeter of Triangle: " + perimeter + " cm");


    }

}

