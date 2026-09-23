
import java.util.Random;
import java.util.Scanner;

public class Main {

    static Random rand = new Random();
    static int[] arr;

    static int size;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter Size: ");
        size = sc.nextInt();
        arr = new int[size];

        RandomArray();

        System.out.println("Options: ");

        System.out.printf("1)Find the array's minimum and maximum. \n2)Find the average of the array.\n3)Find the sum of elements with odd- and even-numbered indexes. ");
        int input = sc.nextInt();

        if (input == 1) {
            System.out.println("Minimum of Array is: " + findMin() + " Maximum of Array is: " + findMax());
        } else if (input == 2) {
            System.out.println("The avarage of Array is: " + findAvg());
        }
        else if(input == 3){
            System.out.println("The sum of even numbers is: " + sumEvenNumbers());
            System.out.println("The sum of odd numbers is: " + sumOddNumbers());
        }

    }

    public static int findMin() {
        int i = 101;
        for (int j = 0; j < arr.length; j++) {
            if (i > arr[j])
                i = arr[j];
        }
        return i;
    }

    public static int findMax() {
        int i = 0;
        for (int j = 0; j < arr.length; j++) {
            if (i < arr[j])
                i = arr[j];
        }
        return i;
    }

    public static void RandomArray() {
        //arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(101);
        }
    }

    public static int findAvg() {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }

    public static  int sumOddNumbers() {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 1) {
                sum += arr[i];
            }
        }
        return sum;
    }

    public static int sumEvenNumbers() {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                sum += arr[i];
            }
        }
        return sum;
    }
}
