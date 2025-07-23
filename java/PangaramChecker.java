import java.util.HashSet;

class Main {
    public static void main(String[] args) {
        String a = "The quick brown fox jumps over the lazy dog";
        String b = a.toLowerCase().replaceAll("\\s", ""); // Remove all whitespace

        HashSet<Character> result = new HashSet<>();
        for (char ch : b.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {  // Only consider a-z
                result.add(ch);
            }
        }

        if (result.size() == 26) {
            System.out.println("Pangram");
        } else {
            System.out.println("Not Pangram");
        }
    }
}
