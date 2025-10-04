import java.util.HashMap;
import java.util.Stack;

public class StackOne{
    public static void main(String[] args) {
        System.out.println(isValid("({)"));
    }
   

    //Input: s = "(]"  Output: false

    static boolean isValid(String s) {
        HashMap <Character,Character> map=new HashMap<>();
        Stack<Character>stack=new Stack<>();

        map.put('}', '{');
        map.put(']', '[');
        map.put(')', '(');

        for(char c:s.toCharArray()){
            if(map.containsKey(c)){
                if(!stack.isEmpty() && stack.peek()==map.get(c)){
                    stack.pop();
                }else{
                    return false;
                }
            }else{
                stack.push(c);
            }
        }
        
        
        return stack.isEmpty();
    }
}