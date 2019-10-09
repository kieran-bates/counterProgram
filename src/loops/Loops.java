/*
 * Kieran Bates
 * October 9, 2019
 * This program counts from a number to a number by a number based on user input
 */

package loops;

import java.util.Scanner;

public class Loops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int countFrom; //declare variables
        int countUntil;
        int countBy;
        int programSelection;
        boolean programStop = false;
        Scanner input = new Scanner(System.in);
        
    while(programStop == false) //loop until programStop is true
    {
        System.out.println("COUNTER PROGRAM"); //Display user options
        System.out.println("\nPlease enter your choice:");
        System.out.println("1 ... Count from 0 to 10 by 1");
        System.out.println("2 ... Count from 100 to 0 by 10");
        System.out.println("3 ... Count from 50 to 500 by 50");
        System.out.println("4 ... Count from 6000 to 1000 by 1000");
        System.out.println("5 ... Terminate Program");
        System.out.print("\nEnter choice here --> ");
        programSelection = input.nextInt(); //wait for user input
        
        if(programSelection == 1) //if user selects 1
        {
            countFrom = 0; //declare start number
            countUntil = 10; //declare stop number
            countBy = 1; //declare count interval
            
            for(int i = countFrom; i<=countUntil; i=i+countBy) //loop until stop number has been reached
            {
                System.out.println(i); //print output
            }
            System.out.println("***COUNT COMPLETE!***"); //inform user count is complete
        }
        
        if(programSelection == 2) //if user selects 2 follow the same process
        {
            countFrom = 100;
            countUntil = 0;
            countBy = 10;
            
            for(int i = countFrom; i>=countUntil; i=i-countBy)
            {
                System.out.println(i);
            }
            System.out.println("***COUNT COMPLETE!***");
        }
        
        if(programSelection == 3) //if user selects 3 follow the same process
        {
            countFrom = 50;
            countUntil = 500;
            countBy = 50;
            
            for(int i = countFrom; i<=countUntil; i=i+countBy)
            {
                System.out.println(i);
            }
            System.out.println("***COUNT COMPLETE!***");
        }
        
        if(programSelection == 4) //if user selects 4 follow the same process
        {
            countFrom = 6000;
            countUntil = 1000;
            countBy = 1000;
            
            for(int i = countFrom; i>=countUntil; i=i-countBy)
            {
                System.out.println(i);
            }
            System.out.println("***COUNT COMPLETE!***");
        }
        if(programSelection == 5) //if user selects 5
        {
            programStop = true; //set programStop to true - program terminates
        }
    }
    } 
}
