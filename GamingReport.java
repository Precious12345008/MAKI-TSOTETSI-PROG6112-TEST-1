/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gamingreport;

public class GamingReport {

    public static void main(String[] args, String[] consoles) 
    {
        
        //Two-dimensional Array
        String[] cities = {"Cape Town", "Port Elizabeth", "Pretoria"};
        String[] console = {"PS5", "XBOX", "SWITCH"};
        int[][] sales = {
                {1000, 2000, 3000},
                {2000, 3000, 4000},
                {1500, 1100, 1200},
        };
        
        //Single-dimensional array
        int[] cityTotals = new int[cities.length];
        
        for (int i = 0; i < cities.length; i++) {
            for (int j=0; j < console.length; j++) {
                cityTotals[i] += sales[i][j];
            }
        }
        
        //Gaming console sales
        int topIndex = 0;
        for (int i = 1; i < cityTotals.length; i++) {
            if (cityTotals[i] > cityTotals[topIndex]) {
                topIndex = i;
            }
        }
        
        //Report
        for (int i = 0; i < 72; i++) {
            System.out.print("=");
        }
            System.out.println("Number 1 Electronics Franchise - Yearly gaming console sales");
    
        for (int i = 0; i< 72; i++) {
            System.out.print("=");
    }
        System.out.println();
        
        System.out.println("CITY\t\t\tPS5\t\tXBOX\t\tNINTENDO SWITCH\tTOTAL");
        for (int i = 0; i < 72; i++) {
            System.out.print("-");
        }
        System.out.println();
 
        // Table rows: city name, sales of each console, then the city total
        for (int i = 0; i < cities.length; i++) {
            System.out.print(cities[i] + "\t\t");
            for (int j = 0; j < consoles.length; j++) {
                System.out.print(sales[i][j] + "\t\t");
            }
            System.out.println(cityTotals[i]);
        }
         System.out.println("SALES FOR EACH CONSOLE");
        for (int j = 0; j < consoles.length; j++) {
            System.out.println(consoles[j] + ":");
            for (int i = 0; i < cities.length; i++) {
                System.out.println("   " + cities[i] + " = " + sales[i][j]);
            }
        }
        System.out.println("TOTAL SALES FOR EACH CITY");
        for (int i = 0; i < cities.length; i++) {
            System.out.println("   " + cities[i] + " = " + cityTotals[i]);
        System.out.println("CITY WITH THE MOST GAMING CONSOLE SALES");
        System.out.println("   " + cities[topIndex] + " with " + cityTotals[topIndex] + " units");
    }
}
}
