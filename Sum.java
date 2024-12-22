
public class Sum {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += 2 * i; // Adding the first 100 even natural numbers
        }
        System.out.println("The sum of the first 100 even natural numbers is: " + sum);
    }
}
