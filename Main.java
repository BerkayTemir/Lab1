
import java.util.Random;


public class Main {

    Random rand = new Random();
    int[] arr;
    public static void main(String[] args) {
        
    }
    public void RandomArray(int size){
        arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(101);
        }
    }

    public int FindAvg(){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }
    public int SumOddNumbers(){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            if(i % 2 == 1){
                sum += arr[i];
            }
        }
        return sum;
    }
    public int SumEvenNumbers(){
        int sum = 0;
            for(int i = 0; i < arr.length; i++){
                if(i % 2 == 0){
                    sum += arr[i];
                }
            }
            return sum;
    }
}

