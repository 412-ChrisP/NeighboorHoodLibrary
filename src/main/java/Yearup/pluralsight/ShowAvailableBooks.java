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
        int userInput = scanner.nextLine();
        switch (userInput)
        {
            case 0:
                System.out.println("Returning...");
                break;
            default:
                if (userInput > 0 && userInput <= bookCounter)
                {
                    Books selectedBook = bookInventory[userInput - 1];

                    if (selectedBook.isCheckedOut())
                    {
                        System.out.println("This book is already checked out!");
                    }
                    else
                    {
                        System.out.print("Please enter your name to check out the book: ");
                        scanner.nextLine();
                        String name = scanner.nextLine();
                        selectedBook.checkOut(name);
                    }
                }
                else
                {
                    System.out.println("Invalid Input! Please try again.");
                }
                break;
        }
    } while (userInput != 0);
}
