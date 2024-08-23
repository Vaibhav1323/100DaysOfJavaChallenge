public class ConditionalStatements {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        // If-else statement
        if (x > y) {
            System.out.println("x is greater than y");
        } else {
            System.out.println("x is less than or equal to y");
        }

        // Nested if-else statement
        if (x > 5) {
            if (y > 15) {
                System.out.println("x is greater than 5 and y is greater than 15");
            } else {
                System.out.println("x is greater than 5 but y is less than or equal to 15");
            }
        } else {
            System.out.println("x is less than or equal to 5");
        }

        // Switch statement
        char grade = 'B';
        switch (grade) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Fair");
                break;
            default:
                System.out.println("Invalid grade");
        }
    }
}
