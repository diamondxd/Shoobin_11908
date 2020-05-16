
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        brackets("((()){{}}}}}[[[[]]]]");

    }


    public static void brackets(String s) {


        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        Stack<Character> stack3 = new Stack<>();

        for(char ch : s.toCharArray()) {


            switch (ch) {


                case '(' :
                case ')' :

                    if(stack1.empty()) {
                        stack1.push(ch);
                        break;
                    }

                    if(stack1.peek().equals(ch)) {
                        stack1.push(ch);
                    }
                    else {
                        stack1.pop();
                    }

                    break;

                case '[' :
                case ']' :

                    if(stack2.empty()) {
                        stack2.push(ch);
                        break;
                    }

                    if(stack2.peek().equals(ch)) {
                        stack2.push(ch);
                    }
                    else {
                        stack2.pop();
                    }
                    break;

                case '{' :
                case '}' :

                    if(stack3.empty()) {
                        stack3.push(ch);
                        break;
                    }

                    if(stack3.peek().equals(ch)) {
                        stack3.push(ch);
                    }
                    else {
                        stack3.pop();
                    }
            }
        }
        System.out.println("Лишние : ");

        System.out.println(stack1);
        System.out.println(stack2);
        System.out.println(stack3);
    }
}
