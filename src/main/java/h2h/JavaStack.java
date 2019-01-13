package h2h;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class JavaStack {
    public static void main(String ...a) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        while(bufferedReader.ready()) {
          System.out.println(checkBalancing(bufferedReader.readLine().toCharArray()));
        }
    }

    static boolean checkBalancing(char[] input) {
        Stack<Character> stringStack = new Stack<>();
        for(char e: input){
            if(e == '{' || e == '(' || e == '[')
                stringStack.push(e);
            if (e == '}' || e == ')' || e == ']'){
                if(stringStack.empty())
                    return false;
                else if(!isMatchingPair(stringStack.pop(), e));
                    return false;
            }
        }
        if(stringStack.empty())
            return true;
        else
            return false;
    }

    static boolean isMatchingPair(char character1, char character2)
    {
        if (character1 == '(' && character2 == ')')
            return true;
        else if (character1 == '{' && character2 == '}')
            return true;
        else if (character1 == '[' && character2 == ']')
            return true;
        else
            return false;
    }
}
