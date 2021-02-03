package ChapterSixExercises;

import java.util.Scanner;

public class FindTheMinimum {
private static float minimum;

    public static void main(String[] args) {
        setMinimum();
        System.out.println(getMinimum());
    }

    public static void setMinimum() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number ");
        float firstNum = scanner.nextFloat();

        System.out.println("Enter second number ");
        float secondNum = scanner.nextFloat();

        System.out.println("Enter third number ");
        float thirdNum = scanner.nextFloat();

        minimum = Math.min(firstNum, Math.min(secondNum, thirdNum));
    }

    public static float getMinimum(){
        return minimum;
    }
}
