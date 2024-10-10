package Yearup.pluralsight;

import java.util.Scanner;

public class ShowCheckedOutBooks
{
    public static void showCheckedOutBooks(Books[] bookInventory, int bookCounter)
    {
        Scanner scanner = new Scanner(System.in);
        boolean anyCheckedOutBooks = false;
        System.out.println("Books currently checked out:");
        for(int i = 0; i < bookCounter; i++)
        {
            if(bookInventory[i].isCheckedOut())
            {
                anyCheckedOutBooks = true;
                System.out.println(bookInventory[i].toString());
            }
        }

        System.out.println("Please select an option below:\n" +
                "C - to Check In a book\n" +
                "X - to go back to home screen\n");
        String userInput = scanner.next().toUpperCase();

        switch(userInput)
        {
            case "C":
                CheckInABook checkInABook = new CheckInABook();
                checkInABook.checkIn(bookInventory, bookCounter);
                break;
            case "X":
                System.out.println("Returning...");
                break;
            default:
                System.out.println("Invalid Input!");
        }

    }
}
