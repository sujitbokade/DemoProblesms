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
        switch (input){
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



    }

    public static void circle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("***Area of Circle***");

        System.out.println("Enter Radius of Circle(in cm)");
        double radius = sc.nextDouble();
        double area = 3.14*radius*radius;

        System.out.println("Area of Circle: " + area + " Sq.cm");

        System.out.println("***Perimeter of Circle***");
        System.out.println("Enter Radius of Circle(in cm)");
        double circleRadius = sc.nextDouble();

        double perimeter = 2 * 3.14 * circleRadius;

        System.out.println("Perimeter of Circle: " + perimeter + " cm");

    }

    public static void triangle() {
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

    public static void rectangle() {
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

