import java.util.Scanner;

public class TestScores {

    public static void main(String[] args) {
        // Create the Scanner for reading user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your grade: ");
        String one = scanner.nextLine();
        int uno = Integer.parseInt(one);


        if (uno < 60) {
            System.out.println("Your grade is an F");
        } else {
            if (uno < 70) {
                System.out.println("Your grade is a D");
            }else {
                if (uno < 80) {
                    System.out.println("Your grade is a C");
                } else {
                    if (uno < 90) {
                        System.out.println("Your grade is a B");
                    } else {
                        if (uno <= 100) {
    System.out.println("Your grade is an A!");
                        }
                    }
                }
            }
        }
    }
}
