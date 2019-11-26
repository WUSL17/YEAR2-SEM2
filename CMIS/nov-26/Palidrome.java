
import java.util.Scanner;
import java.util.Stack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author u172117
 */
public class Palidrome {
    public static void main(String[] args) {
        System.out.print("Enter any string : ");
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        Stack stack = new Stack();
        
        for (int i = 0; i < text.length(); i++) {
            stack.push(text.charAt(i));
        }
        
        String reverseString = "";
        while(!stack.isEmpty()){
            reverseString += stack.pop();
        }
        
        if(reverseString.equals(text)){
            System.out.println("The input text is a palidrome");
        } else {
            System.out.println("The input text is not a palidrome");
        }
    }
}
