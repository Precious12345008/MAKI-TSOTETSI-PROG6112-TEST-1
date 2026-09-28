

package com.mycompany.consolesales;
import java.util.Scanner;

public class ConsoleSales {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Menu
        System.out.println("Select a console type:");
        System.out.println("1. PlayStation");
        System.out.println("2. Xbox");
        System.out.println("3. Nintendo Switch");
        System.out.println("Enter 1, 2 or 3: ");
        int choice = input.nextInt();
        input.nextLine();

        String consoleType;
        if (choice == 1) {
            consoleType = "PlayStation";
        } else if (choice == 2) {
            consoleType = "Xbox";
        } else {
            consoleType = "Nintendo Switch";
        }

        // Get the name store
        System.out.println("Enter the store name: ");
        String store = input.nextLine();
        System.out.println("Enter the total amount of sales: ");
        int totalSales = input.nextInt();

        ConsoleSales sales = new ConsoleSales(consoleType, store, totalSales);
        sales.printReport();
    }

    private ConsoleSales(String consoleType, String store, int totalSales) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void printReport() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
        
