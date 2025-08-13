import java.util.HashSet;

class Main {
    public static void main(String[] args) {
        String a = "swiss";
     
        HashSet<Character> seen = new HashSet<>();
        for (char ch : a.toCharArray()) {
            if (seen.contains(ch)) {
                System.out.println("First repeating character: " + ch);
                return;
            }
            seen.add(ch);
        }
        System.out.println("No repeating character found");
    }
}
