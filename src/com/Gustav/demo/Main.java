package com.Gustav.demo;

import java.util.*;



public class Main {

    public static void main(String[] args) {
        List<String> shoppingList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {

            optionMessage();

            String choice = scanner.nextLine().toLowerCase();

            if (!handleUserChoice(choice, shoppingList)) {

                break;
            }
        }

        scanner.close();
    }

    public static void optionMessage() {
        System.out.println("1. Type 'add' to add item");
        System.out.println("2. Type 'list' to display shopping list and add item");
        System.out.println("3. Type 'remove' to remove an item.");
        System.out.println("4. Type 'exit' to exit.");
    }

    public static boolean handleUserChoice(String choice, List<String> shoppingList) {

        switch (choice) {

            case "add":

                System.out.print("Add something to the shopping list: ");
                String food = new Scanner(System.in).nextLine();
                shoppingList.add(food);

                break;

            case "list":

                System.out.println("Shopping list: " + shoppingList);
                break;

            case "remove":

                System.out.print("Enter the item to remove: ");
                String itemToRemove = new Scanner(System.in).nextLine();

                if (shoppingList.remove(itemToRemove)) {
                    System.out.println("Removed " + itemToRemove + " from the shopping list.");
                }
                else {

                    System.out.println(itemToRemove + " not found in the shopping list.");
                }

                break;

            case "exit":

                return false;

            default:

                System.out.println("Invalid choice. Exiting.");

                return false;
        }
        return true;
    }
}


