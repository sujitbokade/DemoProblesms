package com.bridgelabz;

import java.util.Scanner;

public class DemoProblems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius of Circle(in cm)");
        double radius = sc.nextDouble();
        double area = 3.14*radius*radius;
        double perimeter = 2 * 3.14 * radius;

        System.out.println("Area of Circle: " + area + " Sq.cm");
        System.out.println("Perimeter of Circle: " + perimeter + " cm");


    }

}

