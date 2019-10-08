/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package loops;

/**
 *
 * @author kibat6204
 */
import java.util.Scanner;

public class Loops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int countFrom;
        int countUntil;
        int countBy;
        int programSelection;
        Scanner input = new Scanner(System.in);
        
        System.out.println("COUNTER PROGRAM");
        System.out.println("\nPlease enter your choice:");
        System.out.println("1 ... Count from 0 to 10 by 1");
        System.out.println("2 ... Count from 100 to 0 by 10");
        System.out.println("3 ... Count from 50 to 500 by 50");
        System.out.println("4 ... Count from 6000 to 1000 by 1000");
        System.out.print("\nEnter choice here --> ");
        programSelection = input.nextInt();
        
        if(programSelection == 1)
        {
            countFrom = 0;
            countUntil = 10;
            countBy = 1;
            
            for(int i = countFrom; i<=countUntil; i=i+countBy)
            {
                System.out.println(i);
            }
            System.out.println("***COUNT COMPLETE!***");
        }
    }
    
}
