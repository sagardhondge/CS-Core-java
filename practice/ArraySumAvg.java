import java.util.Scanner;

public class ArraySumAvg {
    public static void main(String[] args) {
        int[] numArray = Arrayutility.inputArray();

        long sum = sum(numArray);
        int avg = Average(numArray);

        System.out.println("Sum of no's is: " + sum);
        System.out.println("Avg of no's is: " + avg);
    }

    public static long sum(int[] numArray) {
        long sum = 0;
        int i = 0;

        while (i < numArray.length) {
            sum += numArray[i];
            i++;
        }
        return sum;
    }

    public static int Average(int[] numArray) {
        long sum = sum(numArray);
        return (int) (sum / numArray.length);
    }
}