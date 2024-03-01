/*Q7: Return a string output containing the equivalent postfix
* expression.*/

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class InfixtoPostfix {
    public static void main(String[] args){
        //Create Scanner Object for user input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter input ");
        String inputString = input.nextLine();

        Queue<String>  postFix = new LinkedList<>();
        for (int i = 0; i < inputString.length(); i++ ){
            if (inputString.contains("(")){
                postFix.add(inputString);
            } else if (inputString.contains("(") && inputString.contains(")")) {
                postFix.remove();
            }
        }
        System.out.println(postFix);
    }
}
