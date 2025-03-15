public class Hollow_Square_Practice {
    public static void main(String[] args) {
        drawHollowSquare(5);
    }

    private static void drawHollowSquare(int n) {
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n - 1 ; j++){
               if(i == 0 ){
                   System.out.println("X ");
               } else {
                   System.out.println();
               }
            }

        }
    }
}
