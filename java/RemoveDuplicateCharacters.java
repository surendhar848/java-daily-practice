// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.LinkedHashSet;
class Main {
    public static void main(String[] args) {
        String s = "programming";
        LinkedHashSet<Character> seen = new LinkedHashSet <>();
        for(char ch: s.toCharArray()){
            seen.add(ch);
        }
        StringBuilder result  = new StringBuilder();
        for(char ch: seen){
            result.append(ch);
        }
        System.out.println(result);
    }
}
