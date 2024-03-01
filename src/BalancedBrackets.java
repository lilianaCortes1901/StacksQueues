//Q4: Given a String of brackets, determine whether the sequence of brackets is balanced.
//If a String is balanced, return Yes. Otherwise, return No.

import java.util.*;

public class BalancedBrackets {
    //Function isBalanced (String s)
    static void isBalanced(String s){
        //Constraint - all characters in DNA sequence are A, C, G, T
        if(s.contains("{") || s.contains("}") || s.contains("(") || s.contains(")") || s.contains("[") || s.contains("]")){
            System.out.println("Valid Sequence");
        } else {
            System.out.println("Invalid Sequence");
        }
        //Set Queue value to String s
        Queue<String> stack = new LinkedList<>();
        stack.add(s);
        for (int i = 0; i < s.length(); i++){
           char x = s.charAt(i);
            if (x == '(' || x == '[' || x == '{'){
                stack.add(String.valueOf(x));
                continue;
            }
            //Address Cases for Unbalanced Sequence
            String check = stack.peek();
            switch (x){
                case ')':
                    if (check.charAt(i) == '{' || check.charAt(i) == '['){
                        System.out.println("NO");
                        break;
                    }
                case '}':
                    if (check.charAt(i) == '(' || check.charAt(i) == '['){
                        System.out.println("NO");
                    }
                case ']':
                    if(check.charAt(i) == '(' || check.charAt(i) == '{'){
                        System.out.println("NO");
                    }
            }
        }
        System.out.println(stack);
    }

    public static void main(String[] args) {
        isBalanced("{[()]}");
        isBalanced("{[(])}");
        isBalanced("{{[[(())]]}}");

    }
}