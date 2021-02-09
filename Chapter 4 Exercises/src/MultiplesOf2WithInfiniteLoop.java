public class MultiplesOf2WithInfiniteLoop {
    public static void main(String[] args) {
        int counter = 2;
        while (counter != 0){
            System.out.println(counter);
            counter = counter * 2;
        }
    }
}
