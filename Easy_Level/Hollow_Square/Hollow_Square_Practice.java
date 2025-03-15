public class Hollow_Square_Practice {
    public static void main(String[] args) {
        drawHollowSquare(5);
    }

    private static void drawHollowSquare(int n) {
        for(int i = 0 ; i < n ; i++) {
            if (i == 0 || i == n - 1) {
                for (int j = 0; j < n; j++) {
                    // Horizontal
                    System.out.print("X ");
                }
            } else {
                // Vertical
                System.out.print("X ");
                for (int j = 1; j < n - 1; j++) {
                    System.out.print("  ");
                }
                System.out.print("X");
            }
            System.out.println();
        }
    }
}
