package Yearup.pluralsight;

import java.util.Scanner;

public class ShowAvailableBooks
{
    public static void showBooks(Books[] bookInventory, int bookCounter)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Available Books: \n");
        for(int i = 0; i < bookInventory.length; i++)
        {
            System.out.printf("1: " + bookInventory[i] + "\n");
        }

        System.out.println("\nPlease select a book to check out or Exit (0): \n");
        int userInput;
        userInput = scanner.nextInt();
        switch(userInput)
        {
            case 0:
                System.out.println("Returning...");
                break;
            case 1:

            default:
                System.out.println("Invalid Input!");
        }
        do
        {


        }while(userInput != 7);
    }
}
