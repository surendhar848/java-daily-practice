// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.HashMap;
class Main {
    public static void main(String[] args) {
        String a = "abcabcbb";
       
        HashMap <Character,Integer> map = new HashMap<>();
        int left = 0; 
        int maxLen = 0;
        for(int right = 0; right < a.length(); right++){
            char ch = a.charAt(right);
            if(map.containsKey(ch) && map.get(ch)>=left){
                left = map.get(ch)+1;
            }
            map.put(ch,right);
            maxLen = Math.max(maxLen, right-left+1);
        }
        System.out.print(maxLen);
    }
}
