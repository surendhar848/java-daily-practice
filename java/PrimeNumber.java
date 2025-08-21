// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        int a = 7;
        Boolean prime= isPrime(a);
        System.out.println(prime);
    }
   public static boolean isPrime(int n) {
    if (n <= 1) return false;
    for (int i = 2; i <= Math.sqrt(n); i++) {
        if (n % i == 0) return false;
    }
    return true;
}

}
