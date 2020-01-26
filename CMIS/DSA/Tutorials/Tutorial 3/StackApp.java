import java.util.Scanner;

public class StackApp {

    public static void main(String[] args) {
        String s1;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input phrase : ");
        s1 = scanner.next();

        // Initializing 3 stack
        Stack stack1 = new Stack(10);
        Stack stack2 = new Stack(10);
        Stack stack3 = new Stack(10);

        // Push phase into stack 1 and 2
        for (int i = 0; i < s1.length(); i++) {
            stack1.push(s1.charAt(i));
            stack2.push(s1.charAt(i));
        }

        // Pop stack 2 and push into stack 3
        while (!stack2.isEmpty()){
            stack3.push(stack2.pop());
        }

        boolean isPalindrome = false;
        while (!stack1.isEmpty() && !stack3.isEmpty()){
            if (!stack1.pop().equals(stack3.pop())){
                isPalindrome = false;
                return;
            }else {
                isPalindrome = true;
            }
        }

        if (isPalindrome){
            System.out.println(s1 + " is a Palindrome");
        }else {
            System.out.println(s1 + " is not a Palindrome");
        }
    }

}
