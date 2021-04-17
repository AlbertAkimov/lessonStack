package com.base;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println ("Inter size of stack..");
        int mas = input.nextInt();
        Stack stack = new Stack(mas);
        int inp = 0;
        do {
            System.out.println(" -Select in action");
            System.out.println("1. add element");
            System.out.println("2. delete element");
            System.out.println("3. print stack");
            System.out.println("4. exit");
            inp = input.nextInt();
            switch (inp) {
                case 1: {
                    System.out.println("Enter value..");
                    stack.push(input.nextInt());
                }
                break;
                case 2: {
                    System.out.println("Deleted value " + stack.pop() + " from stack");
                    stack.print();
                }
                break;
                case 3: {
                    stack.print();
                }break;
                default : System.out.println("error...");

            }
        } while (inp != 4);
        System.out.println("GOOD BY");
        stack.print();
        input.close();

    }
}
