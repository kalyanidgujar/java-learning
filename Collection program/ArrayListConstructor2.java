import java.util.ArrayList;

public class ArrayListConstructor2 {
    public static void main(String[] args) {
        // Create an ArrayList to store integers
        ArrayList<Integer> numbers = new ArrayList<>(15);

        for (int i = 10; i <= 150; i+=10) {
            numbers.add(i);
        }

            System.out.print(numbers+" ");
            numbers.add(160);
        
    }
}
