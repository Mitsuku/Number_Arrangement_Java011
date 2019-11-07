package com.example.lib;

import java.util.Scanner;

public class MyClass {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 sets of numbers in sequence");
        int x,y,z,n;
        x = scanner.nextInt();
        y = scanner.nextInt();
        z = scanner.nextInt();
        for(int i = 0;i<2;i++){
            if(x>y){
                n=x;
                x=y;
                y=n;
            }
            if (y>z){
                n=y;
                y=z;
                z=n;
            }
        }
        System.out.printf("The number entered is from small to large: %d %d %d",x,y,z);
        System.out.printf("    ");
    }

}