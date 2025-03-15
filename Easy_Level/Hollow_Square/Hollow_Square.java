public class Hollow_Square {
    public static void drawSquare(int n) {
        for (int i = 0; i < n; i++) {
            // Print "X" for the first and last row
            if (i == 0 || i == n - 1) {
                for (int j = 0; j < n; j++) {
                    System.out.print("X ");
                }
            } else {
                // Print "X" at the beginning, spaces in the middle, and "X" at the end
                System.out.print("X ");
                for (int j = 1; j < n - 1; j++) {
                    System.out.print("  ");
                }
                System.out.print("X");
            }
            System.out.println(); // Move to the next line
        }
    }

    public static void main(String[] args) {
        drawSquare(5);
    }
}
