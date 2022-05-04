import java.util.Scanner;

public class NumberComparison {

    public static void main(String[] args) {
        // Create the Scanner for reading user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        String one = scanner.nextLine();
        int uno = Integer.parseInt(one);
        System.out.println("Enter a second number");
        String two = scanner.nextLine();
        int dos = Integer.parseInt(two);

        if (uno > dos) {
            System.out.println("The first number is larger than the second");
        } else {
            if (dos > uno) {
                System.out.println("The second number is larger than the first");
            }else {
                if (dos == uno) {
                    System.out.println("The numbers are equal");
                }
            }
        }
    }
}
