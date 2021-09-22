package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the max amount of marks for this test?");
        int maxMark = input.nextInt();

        System.out.println("Type in student's mark");
        int studentMark = input.nextInt();

        int studentPercentage = (studentMark / maxMark)* 100;

        if (studentPercentage >= 80) {
            System.out.println("The Grade for this Student is an A");
        }
        if ((studentPercentage >= 70) && (studentPercentage < 79)){
            System.out.println("The Grade for this Student is a B");
        }
        if ((studentPercentage >= 60)&& (studentPercentage <69)){
            System.out.println("The Grade for this Student is a C");
        }
        if ((studentPercentage >= 50)&& (studentPercentage <59)){
            System.out.println("The Grade for this Student is a D");
        }
        if ((studentPercentage >= 40)&& (studentPercentage <49)){
            System.out.println("The Grade for this Student is an E");
        }
        else{
            System.out.println("The Grade for this Student is a U");
        }
    }
}
