package Materia.Ejercicio_01_sign;

import java.util.Stack;

public class SingValidator {

    public static boolean isValid(String valido){
        Stack<Character> stack = new Stack<>();
        for (char c : valido.toCharArray()) {
            if(c == '('  || c == '{'  || c == '[' ){
                stack.push(c);

            }else{
                if(stack.isEmpty()){
                    return false;

                }
                char top = stack.pop();
                if((c == ')' && top != '(')||
                (c == '}' && top != '{')||
                (c == ']' && top != '[')){
                    return false;

                }
            }
            
        }
        return stack.isEmpty();
    }
    
}
