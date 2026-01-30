public class DoWhileCounter {
    public static void main(String[] args) {
        int counter = 0; // start at 0

        // do-while loop
        do {
            System.out.println("Counter = " + counter);
            counter++; // increment counter
        } while (counter <= 20); // condition checked after each iteration
    }
}