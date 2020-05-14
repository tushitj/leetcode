package solutions;

import solutions.configuration.PrintArrayAbstractClass;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class E03 extends PrintArrayAbstractClass {
    public String removeOuterParentheses(String s) {
        char[] c = s.toCharArray();
        Queue<Character> queue = new LinkedList<>();
        for(Character ch : c){

            if(ch == ')' && queue.peek() == '('){
                queue.remove();
            }else{
                queue.add(ch);
            }

            print(queue);
        }
        print(queue);

        return null;
    }

    @Override
    public void run() {
        String input = "(()())(())";
        System.out.println(removeOuterParentheses(input));
    }
}
