package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l, b, ch;
        double area, perimeter;
        System.out.println("Enter the length of the Rectangle: ");
        l = sc.nextInt();
        System.out.println("Enter the breadth of the Rectangle: ");
        b = sc.nextInt();
        System.out.println("MENU");
        System.out.println("***********");
        System.out.println("Enter 1 for AREA, Enter 2 for PERIMETER");
        System.out.println("Enter Your Choice");
        ch = sc.nextInt();
            switch(ch){
                case 1:
                    area = l * b;
                    System.out.println("Area of the Triangle:" +area);
                    break;

                case 2:
                    perimeter = 2 * (l + b);
                    System.out.println("Perimeter of the Triangle:" +perimeter);
                    break;

                default:
                    System.out.println("Wrong Choice");

            }
    }
}
