import java.util.ArrayList;

public class ArrayListConstructor {
    public static void main(String[] args) {
        // Create an ArrayList to store integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Adding numbers from 10 to 100 to the ArrayList
        for (int i = 10; i <= 100; i+=10) {
            numbers.add(i);
        }

        // Printing the numbers stored in the ArrayList
        for (int number : numbers) {
            System.out.print(number+" ");
        }
    }
}
