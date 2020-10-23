package parentheses;

import java.util.Scanner;

public class Parentheses {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayStack arr = new ArrayStack();
        ListStack list=new ListStack();
        System.out.println("Enter Expression");
        String str = sc.nextLine();
        boolean b = true;
        int j = 1;
        int i = 0;
        Object check = null;
        try {
            for (i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '(' || str.charAt(i) == '[' || str.charAt(i) == '{') {
                    j++;
                    arr.push(str.charAt(i));
                    //list.push(str.charAt(i));
                } else if (str.charAt(i) == ')' || str.charAt(i) == ']' || str.charAt(i) == '}') {
                    j++;
                    check = arr.pop();
                    //check = list.pop();
                    if (str.charAt(i) == ')' && (char) check != '(') {
                        b = false;
                        break;
                    } else if (str.charAt(i) == '}' && (char) check != '{') {
                        b = false;
                        break;
                    } else if (str.charAt(i) == ']' && (char) check != '[') {
                        b = false;
                        break;
                    }
                }
            }
            if (b == false) {
               System.out.println("This expression is NOT correct.\nError at character # " + j + " " + "'" + check + "'" + " not closed");
            } else {

                System.out.println("This expression is correct");
            }
        } catch (Exception e) {
            System.out.println("This expression is NOT correct.\nError at character # " + j + " " + "'" + str.charAt(i) + "'" + " not opened");
        }

    }

}
