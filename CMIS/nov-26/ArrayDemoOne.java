
import java.util.Arrays;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author u172117
 */
public class ArrayDemoOne {
    public static void main(String[] args) {
        String[] array = new String[5];
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter 5 words : ");
        
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextLine();
        }
        
        Arrays.sort(array);
        
        for (int i = 0; i < array.length; i++) {
            System.out.print( array[i] + " ");
        }
        
        System.out.println("");
    }
}
