package Yearup.pluralsight;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        Books[] bookInventory = new Books[20];
        int bookCounter = 0;

        bookInventory[bookCounter++] = new Books(1, "ISBN-3255896", "1984", false,"Available");
        bookInventory[bookCounter++] = new Books(2, "ISBN-9001682", "Moby Dick", true, "User275");
        bookInventory[bookCounter++] = new Books(3, "ISBN-7224917", "The Great Gatsby", false,"Available");
        bookInventory[bookCounter++] = new Books(4, "ISBN-8161431", "The Hobbit", true,"User945");
        bookInventory[bookCounter++] = new Books(5, "ISBN-1001234", "Fahrenheit 451", false,"Available");
        bookInventory[bookCounter++] = new Books(6, "ISBN-9876543", "Pride and Prejudice", true,"User4024");


        System.out.println("Welcome to the NeighboorHood Library!\n" +
                "Please select an option:\n" +
                "1 - Show available books:\n" +
                "2 - Show checked out books:\n" +
                "3 - Check in a book:\n" +
                "4 - Exit:\n");
        int userChoice;
        userChoice = scanner.nextInt();
        do
        {
            switch(userChoice)
            {
                case 1:
                    ShowAvailableBooks showAvailableBooks = new ShowAvailableBooks();
                    showAvailableBooks.showBooks(bookInventory, bookCounter);
                    break;
                case 2:
                    ShowCheckedOutBooks showCheckedOutBooks = new ShowCheckedOutBooks();
                    showCheckedOutBooks.showCheckedOutBooks(bookInventory, bookCounter);
                    break;
                case 3:
                    CheckInABook checkInABook = new CheckInABook();
                    checkInABook.checkIn(bookInventory, bookCounter);
                    break;
                case 4:
                    System.out.println("Thank you for coming to The Neighboorhood Library!");
                    break;
                default:
                    System.out.println("Invaid Input!\n" +
                            "Please enter 1-3: ");
            }
        }while(userChoice != 4);
        scanner.close();
    }
}