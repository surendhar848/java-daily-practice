// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String input = scanner.nextLine();
        scanner.close();
        if(isInputValid(input)){
            System.out.print("valid");
        }
        else{
            System.out.print("Invalid");
        }
    }
    public static boolean isInputValid(String expr){
        Stack <Character>stack = new Stack<>();
        char prevchar = ' ';
        for(int i = 0; i<expr.length(); i++){
            char ch = expr.charAt(i);
            if(ch == '('){
                stack.push(ch);
            }
            else{
                if(ch == ')'){
                    if(stack.isEmpty()){
                        return false;
                    }
                    if(prevchar == ' '|| ch == '+' || ch=='-'|| ch== '/' || ch == '*'){
                return false;
            }
                    stack.pop();
                }
            }
            if(ch == '+' || ch == '-' || ch =='/' || ch == '*'){
            if(prevchar == ' '|| ch == '+' || ch=='-'|| ch== '/' || ch == '*'){
                return false;
            }
        }
        prevchar = ch;
        }
        return stack.isEmpty() && ! (prevchar == '+' || prevchar=='-'|| prevchar== '/' || prevchar == '*');
        
    }
}
