package com.diosoft;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String firstArgument = args[0];

        System.out.println("This is 1st argument "+firstArgument);

        System.out.println("---------List of Arguments----------");
        for (int i = 0; i <= args.length-1; i++) {
            System.out.println(args[i]);
        }

        System.out.println("---------Quantity of Arguments----------");
        int quantity = args.length;

        System.out.println(quantity);

    }
}
