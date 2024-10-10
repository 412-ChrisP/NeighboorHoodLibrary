package Yearup.pluralsight;

import java.util.Scanner;

public class CheckInABook
{
    public static void checkIn(Books[] bookInventory, int bookCounter)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please select an option below:" +
                "1 - Check ina book with specific ID" +
                "2 - Go back to home screen");
        int userInput = scanner.nextInt();

        switch(userInput)
        {
            case 1:
                System.out.println("Please enter the book ID:");
                int userBookID = scanner.nextInt();

                boolean bookFound = false;
                int i = 0;
                while (i < bookCounter)
                {
                    if(bookInventory[i].getId() == userBookID)
                    {
                        bookFound = true;
                        bookInventory[i].checkIn();
                        break;
                    }
                    i++;
                }

                if(!bookFound)
                {
                    System.out.println("Book ID not found! ");
                }
                break;
            case 2:
                System.out.println("Returning...");
                break;
            default:
                System.out.println("Invalid Input!");
        }
    }
}
