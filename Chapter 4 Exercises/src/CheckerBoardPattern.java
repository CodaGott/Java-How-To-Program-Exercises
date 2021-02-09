public class CheckerBoardPattern {
    public static void main(String[] args) {
        int counter = 8;
        while (counter >= 1){
            int printer = 1;
            while(printer <= 8){
                System.out.print("* ");
                System.out.print(" ");
                printer++;
            }
            counter--;
            System.out.println();
        }
    }
}
