package com.pavan;

import java.util.*;

public class Main {
    private static Scanner scanner= new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();


    public static void main(String[] args){
        boolean quit = false;
        int choice = 0;
        printInstructions();

        while(!quit){
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    processArrayList();
                    break;
                case 7:
                    initializeDefaultList();
                    break;
                case 8:
                    quit = true;
                    break;
                default:
                    System.out.println("Illegal Input");
                    break;
            }
        }
    }

    private static void initializeDefaultList() {
        String[] stringArray = {"foo", "bar", "baz", "foo", "bar", "baz", "Hinjawadi", "Bhugaon", "Magarpatta",
                "Hinjawadi", "Shivaji Nagar", "Wakad", "Hadapsar", "Hinjawadi", "Balewadi High Street", "Yerawada", "Bavdhan",
                "Kalyani Nagar", "Baner", "Koregaon Park", "Pimple Saudagar"};


        List<String> areaList = new ArrayList<>(Arrays.asList(stringArray));
    }

    public static void processArrayList() {
        ArrayList<String> newArrayList1 = new ArrayList<>();
        newArrayList1.addAll(groceryList.getGroceryList());
        System.out.println("Copied to new ArrayList using addAll(Collection) method : ");
        newArrayList1.forEach(System.out::println);


        ArrayList<String> newArrayList2 = new ArrayList<>(groceryList.getGroceryList());
        System.out.println("Copied to new ArrayList using constructor initialization new ArrayList<>(groceryList.getGroceryList()) method : ");
        newArrayList2.forEach(System.out::println);


        String[] myArray = new String[groceryList.getGroceryList().size()];
        myArray = groceryList.getGroceryList().toArray(myArray);
        System.out.println("Converted ArrayList to String[] array using toArray(t[] a) method : ");
        System.out.println(Arrays.toString(myArray));

        LinkedList<String> newLinkedList = new LinkedList<>(groceryList.getGroceryList());
    }

    public static void printInstructions(){
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options");
        System.out.println("\t 1 - To print list of grocery items");
        System.out.println("\t 2 - To add an item to the list");
        System.out.println("\t 3 - To modify an item in the list");
        System.out.println("\t 4 - To remove an item from the list");
        System.out.println("\t 5 - To search for an item in the list");
        System.out.println("\t 6 - To process ArrayList");
        System.out.println("\t 7 - To Initialize ArrayList with Default Values");
        System.out.println("\t 8 - To quite an application");
    }

    public static void addItem(){
       // groceryList.setGroceryList(new ArrayList<String>(Arrays.asList("Bread", "Butter", "Cream")));
        System.out.println("Please enter the grocery item: ");
        groceryList.addGroceryList(scanner.nextLine());
    }

    public static void modifyItem(){
        System.out.println("Enter current item name: ");
        String currentItemName = scanner.nextLine();
        System.out.println("Enter replacement item name: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(currentItemName,newItem);

    }

    public static void removeItem(){
        System.out.println("Enter item name: ");
        String itemName = scanner.nextLine();
        groceryList.removeGroceryItem(itemName);
    }

    public static void searchForItem(){
        System.out.println("Enter an item to search for: ");
        String searchItem = scanner.nextLine();
        if(groceryList.onFile(searchItem)){
            System.out.println("Found " + searchItem + " in your shopping list");
        }else{
            System.out.println(searchItem + " is not in your shopping list");
        }
    }

}
