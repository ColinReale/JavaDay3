import java.util.Scanner;

public class SameOrNah {

    public static void main(String[] args) {
        // Create the Scanner for reading user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String one = scanner.nextLine();

        System.out.println("Enter another word: ");
        String two = scanner.nextLine();


        if (one.equals(two)) {
            System.out.println("The words are the same");
        } else {
            System.out.println("The words are different");
        }
    }
}
