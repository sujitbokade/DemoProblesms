package com.bridgelabz;

import java.util.Scanner;

public class DemoProblems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 For Calculate Area & Perimeter of Rectangle");
        System.out.println("Enter 2 For Calculate Area & Perimeter of Triangle");
        System.out.println("Enter 3 For Calculate Area & Perimeter of Circle");
        System.out.println("Enter 4 For Exit");
        int input = sc.nextInt();
        switch (input) {
            case 1:
                rectangle();
                break;
            case 2:
                triangle();
                break;
            case 3:
                circle();
                break;
            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid Entry");
                break;

        }
        sc.close();
    }

    public static void circle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius of Circle(in cm)");
        double radius = sc.nextDouble();

        double area = 3.14 * radius * radius;
        double perimeter = 2 * 3.14 * radius;

        System.out.println("Area of Circle: " + area + " Sq.cm");
        System.out.println("Perimeter of Circle: " + perimeter + " cm");
    }

    public static void triangle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Side(in cm)");
        double a = sc.nextDouble();
        System.out.println("Enter Second Side(in cm)");
        double b = sc.nextDouble();
        System.out.println("Enter Third Side(in cm)");
        double c = sc.nextDouble();

        double perimeter = (a + b + c);
        double s = perimeter / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));


        System.out.println("Area of Triangle: " + area + " sq.cm");
        System.out.println("Perimeter of Triangle: " + perimeter + " cm");
    }

    public static void rectangle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length of Rectangle(in cm)");
        double length = sc.nextDouble();
        System.out.println("Enter Width of Rectangle(in cm)");
        double width = sc.nextDouble();

        double area = length * width;
        double perimeter = 2 * (length + width);

        System.out.println("Area of Rectangle: " + area + " Sq.cm");
        System.out.println("Perimeter of Rectangle: " + perimeter + " cm");
    }

}

