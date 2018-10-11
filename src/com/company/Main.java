package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
  //  }

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter number in inches: ");
        int numInInches = keyboard.nextInt();


    System.out.printf("%.2f", convertToFt(numInInches));

}

    public static  double convertToFt (int numInInches){
        double ft = numInInches / 12f;
        return ft;
    }
}