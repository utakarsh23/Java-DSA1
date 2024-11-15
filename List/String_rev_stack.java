import java.util.Stack;
public class String_rev_stack {
    public static void main(String[] args) {
        String str = "Shresth";
        Stringreverses sr = new Stringreverses();
        String result = sr.reverses(str);
        System.out.println("Original : "+ str);
        System.out.println("Reverses : " + result);
    }
        
    }
    class Stringreverses {
    public String reverses(String input) {
        Stack<Character> stack = new Stack<Character>();
        for(char ch : input.toCharArray()) {
            stack.push(ch);
        }
        String reverse = "";
        while(!stack.isEmpty()) {
            reverse += stack.pop();
        }
        return reverse;
    }
}
