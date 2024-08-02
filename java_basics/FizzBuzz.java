package java_basics;

public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i % 3 == 0) {
                System.out.println("fizz3");
            } else if (i % 5 == 0) {
                System.out.println("Buzz5");
            } else {
                System.out.println(i);
            }
        }
    }
}
